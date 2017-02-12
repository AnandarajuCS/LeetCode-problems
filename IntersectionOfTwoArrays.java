package leetcode1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {

	}
	public int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0;
		int j = 0;
		Set<Integer> output = new HashSet<Integer>();
		while(i < nums1.length && j < nums2.length){
			if(nums1[i] < nums2[j]){
				i++;
			}else if(nums1[i] > nums2[j]){
				j++;
			}else{
				output.add(nums1[i]);
			}
		}
		int[] arr = new int[output.size()];
		Iterator<Integer> it = output.iterator();
		int k = 0;
		while(it.hasNext()){
			arr[k++] = it.next();
		}
		return arr;
	}
}
