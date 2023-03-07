package w9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

//다익스트라다
//dis 배열로 갈수있는 노드 만들고 그때의 최솟값을 저장
//dis만큼 루프돌면서 루프한번 정점 움직일때 최솟값은 확정하고 그다음 정점찾기
//최솟값찾기를 그냥 dis만큼 돌면 (노드에서출발횟수)n*(dis최솟값찾기)n 프라이어티큐로하면 nlogn 최솟값찾기를 logn으로 할수있음 

import java.util.Scanner;


class Edge implements Comparable<Edge>{
	
	int to;
	int weight;
	
	public Edge(int to, int weight) {
		this.to = to;
		this.weight = weight;
	}
	@Override
	public int compareTo(Edge o) {	//poll시에 오름차순
		return this.weight-o.weight;
	}
}

public class Ex0905 {
	
	static int n;
	static int m;
	static ArrayList<ArrayList<Edge>> graph;
	static int [] dis;

	private void solution(int v) {
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.offer(new Edge(v, 0));
		dis[v] = 0;
		while(!pq.isEmpty()) {
			Edge tmp = pq.poll();
			int now = tmp.to;
			int nowcost = tmp.weight;
			if(nowcost>dis[now]) continue;
			for(Edge ob : graph.get(now)) {
				if(dis[ob.to]>nowcost+ob.weight) {
					dis[ob.to] = nowcost+ob.weight;
					pq.offer(new Edge(ob.to,nowcost+ob.weight));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex0905 T = new Ex0905();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph= new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Edge>());
		}
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		for(int i =0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph.get(a).add(new Edge(b, c));
		}
		T.solution(1);
		for(int i=2; i<=n; i++) {
			if(dis[i] != Integer.MAX_VALUE) System.out.println(i +" : "+dis[i]);
			else System.out.println(i+" : impossible");
		}
	}


}
