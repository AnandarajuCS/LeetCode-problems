package leetcode1;

//434.

public class StringSegments {
	public static void main(String[] args) {
		System.out.println(countSegments("0 j hitb uy 6  654 6 65    653 9                ;.mlu  . . l         ; [ ["));
	}
	public static int countSegments(String s) {
        //if char add c (Initially 1) and make c = 0;
        //if space make c =1;
        char[] sArr = s.toCharArray();
        int mark = 1;
        int count = 0;
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] == ' '){
                mark=1;
            }else{
                count+=mark;
                mark=0;
            }
        }
        return count;
    }
}
