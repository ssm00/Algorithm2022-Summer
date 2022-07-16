package w1;

import java.util.Scanner;

public class Ex0102 {
	
	public String solution(String str) {
		String ans = "";
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				ans += Character.toUpperCase(x);
			}else {
				ans += Character.toLowerCase(x);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0102 T = new Ex0102();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}