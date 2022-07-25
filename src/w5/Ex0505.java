package w5;

//쇠막대기 괄호가 나왔을때 stack 예상 + 괄호별로 케이스를 나눠 어떤 행동을 해주면 되는지 계산

import java.util.Scanner;
import java.util.Stack;

public class Ex0505 {
	
	public int solution(String str) {
		int ans = 0;
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				st.push(str.charAt(i));
			}else {
				st.pop();
				if(str.charAt(i-1) == '(') {
					ans += st.size();
				}else {
					ans++;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0505 T = new Ex0505();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
	}
}
