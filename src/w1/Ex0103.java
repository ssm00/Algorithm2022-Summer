package w1;

import java.util.Scanner;

public class Ex0103 {
	
	public String solution(String str) {
		String ans = "";
		String [] s = str.split(" ");
		for(String a : s) {
			if(a.length()> ans.length()) {
				ans = a;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0103 T  = new Ex0103();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
		
	}
}