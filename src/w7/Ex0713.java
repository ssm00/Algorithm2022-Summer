package w7;

import java.util.ArrayList;
import java.util.Scanner;

//인접리스트로 풀기
//0712는 인접 행렬
//갯수가 많아지면 인접 행렬은 비효율적이다. 1000개면 1000x1000 배열이 필요함
//리스트를 갯수만큼 만들고 추가
//1->2의 경우 1번 arrlist에 2추가
//2->3의 경우 2번 arrlist에 3추가

public class Ex0713 {
	static int ans = 0;
	static int n;
	static int m;
	static ArrayList<ArrayList<Integer>> graph;
	static int [] ch;
	
	public void DFS(int v) {
		if(v == n) {
			ans++;
			return;
		}else {
			for(int i=1; i<=n; i++) { // for(int x: graph.get(v)); 도 가능 밑에 contains 생략
				if(ch[i] == 0 && graph.get(v).contains(i)) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex0713 T = new Ex0713();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		ch = new int[n+1];
		graph= new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i =0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(ans);
	}
}
