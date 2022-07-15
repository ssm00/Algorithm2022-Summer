package w1;

import java.util.Scanner;

public class Ex0101 {
	
	public int solution(String str, char c) {
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		int ans = 0;
		for(char x : str.toCharArray()) {
			if(x == c) {
				ans++;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0101 T = new Ex0101();
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		char c = sc.next().charAt(0);
		System.out.println(T.solution(str, c));
		
	}
}
