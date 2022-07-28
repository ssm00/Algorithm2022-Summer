package w8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//동전교환 가장 적은수의 동전으로 교환해주기
//가장적은수, 최소거리 BFS
// BFS q.len만큼 반복후 가지 갯수는 coin 갯수만큼 반복 반복하면서 q에 넣어주기 그리고 L++는 q.len이후
//DFS로 풀경우 모든 경우의수 구하고 최소값을 리턴

public class Ex0805 {
	
	static int [] coin;
	static int target;
	
	public int BFS(int L, int sum) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(0);
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				int current = q.poll();
				for(int j=0; j<coin.length; j++) {
					int nx = current + coin[j];
					if(nx == target) {
						return L+1;
					}
					q.offer(nx);
				}
			}
			L++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Ex0805 T = new Ex0805();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		coin = new int[n];
		for(int i=0; i<n; i++) {
			coin[i] = sc.nextInt();
		}
		target = sc.nextInt();
		
		System.out.println(T.BFS(0,0));
	}
}
