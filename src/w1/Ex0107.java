package w1;

import java.util.Scanner;

public class Ex0107 {
	
	public String solution(String str) {
		str =str.toUpperCase();
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-1-i)) {
				return "NO";
			}
		}
		return "YES";
	}
	
	public static void main(String[] args) {
		Ex0107 T = new Ex0107();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		
	}

}
