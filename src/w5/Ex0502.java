package w5;

import java.util.Scanner;
import java.util.Stack;

//괄호제거 문제 stack이용 괄호가 있으면 stack일가능성 높음

public class Ex0502 {
	
	public String solution(String s) {
		String ans = "";
		Stack<Character> st = new Stack<Character>();
		
		for(char x : s.toCharArray()) {
			if(x == '(') {
				st.push(x);
			}else if(x == ')'){
				st.pop();
			}else {
				if(st.isEmpty()) {
					ans += x;
				}
			}
			
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0502 T = new Ex0502();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(T.solution(s));
	}
}
