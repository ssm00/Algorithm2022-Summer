package w5;

import java.util.Scanner;
import java.util.Stack;

//stack 짝 맞추기 문제 뒤집기 문제

public class Ex0501 {
	
	public String solution(String s) {
		String ans = "YES";
		Stack<Character> st = new Stack<Character>();
		for(char x : s.toCharArray()) {
			if(x == '(') {
				st.push(x);
			}else {
				if(st.isEmpty()) {
					return "NO";
				}
				st.pop();
			}
		}
		
		if(!st.isEmpty()) {
			return "NO";
		}
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		Ex0501 T = new Ex0501();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(T.solution(s));
		
	}
}
