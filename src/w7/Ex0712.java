package w7;

import java.util.Scanner;

//경로탐색 방향그래프 (인접행렬)
//경우의수 구하기 DFS
//1부터5일때 쓴다 안쓴다로 트리만들기.
//DFS()파라미터값이 트리의 높이가 아닌 노드자체값 자체가 들어감 베이스컨디션 체크할 기준이 파라미터에 들어가야함

public class Ex0712 {
	
	static int ans = 0;
	static int n;
	static int m;
	static int [][] graph;
	static int [] ch;
	
	
	public void DFS(int v) {
		if(v == n) {
			ans++;
		}else {
			for(int i=1; i<=n; i++) {
				if(ch[i] == 0 && graph[v][i] ==1) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex0712 T = new Ex0712();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph= new int[n+1][n+1];
		ch = new int[n+1];
		for(int i =0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(ans);
	}
}
