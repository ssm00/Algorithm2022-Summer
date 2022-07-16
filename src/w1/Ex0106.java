package w1;

import java.util.Scanner;

public class Ex0106 {
	
	public String solution(String str){
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) {
				ans += str.charAt(i);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0106 T = new Ex0106();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		
	}

}
