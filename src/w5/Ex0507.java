package w5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex0507 {
	
	public String solution(String a, String b) {
		String ans = "YES";
		Queue<Character> q = new LinkedList<Character>();
		
		for(char x: a.toCharArray()) {
			q.offer(x);
		}
		
		for(char x : b.toCharArray()) {
			if(q.contains(x)) {
				if(q.poll() != x) {
					return "NO";
				}
			}
		}
		if(!q.isEmpty()) {
			return "NO";
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0507 T = new Ex0507();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		System.out.println(T.solution(a, b));
		
	}
}
