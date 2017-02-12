package leetcode1;

public class NumberComplement {
public static void main(String[] args) {
	int n = 5;
	int s = 0;
	System.out.println(Integer.toBinaryString(n));
	int len = Integer.toBinaryString(n).length();
	for(int i = 0; i < len; i++){
		int temp = n&(1 << i);
		s |= temp^(1 << i);
	}
	System.out.println(Integer.toBinaryString(s));
	System.out.println(Integer.toBinaryString(~n));
}
}
