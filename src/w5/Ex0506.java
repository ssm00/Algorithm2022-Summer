package w5;

//원형 queue

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex0506 {
	
	public int solution(int n, int m) {
		int ans = 0;
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			q.offer(i+1);
		}
		while(!q.isEmpty()) {
			for(int i=1; i<m; i++) {
				q.offer(q.poll());
			}
			ans = q.poll();
		}
		
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0506 T = new Ex0506();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(T.solution(n, m));
		
	}
}
