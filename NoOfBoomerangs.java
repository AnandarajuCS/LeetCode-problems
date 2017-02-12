package leetcode1;

import java.util.HashMap;
import java.util.Map;

public class NoOfBoomerangs {
	public static void main(String[] args) {
		
	}
	public int numberOfBoomerangs(int[][] points) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int output = 0;
        for(int i = 0; i < points.length; i++){
            for(int j = 0 ; j < points.length; j++){
                if(i == j) continue;
                int dist = findDistance(points[i],points[j]);
                map.put(dist, map.getOrDefault(dist,0)+1);
            }
            for(int val : map.values()){
                output += val*(val-1);
            }
            map.clear();
        }
        return output;
    }
    public int findDistance(int[] x, int[] y){
        int dis = (int) (Math.pow((x[0]-y[0]),2)+Math.pow((x[1]-y[1]),2));
        return dis;
    }
}
