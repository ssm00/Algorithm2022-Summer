package w5;

import java.util.Scanner;
import java.util.Stack;

//후위식 연산 postfix stack

public class Ex0504 {
	
	public int solution(String str) {
		int ans=0;
		Stack<Integer> st = new Stack<Integer>();
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				st.push(x-48);
			}else {
				int rt = st.pop();
				int lt = st.pop();
				if(x == '+') {
					st.push(lt+rt);
				}else if(x == '-') {
					st.push(lt-rt);
				}else if(x == '*') {
					st.push(lt*rt);
				}else if(x == '/') {
					st.push(lt/rt);
				}
			}
		}
		ans = st.pop();
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0504 T = new Ex0504();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
		
	}
}
