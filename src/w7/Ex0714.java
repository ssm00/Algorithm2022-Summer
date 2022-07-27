package w7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//그래프 최단 거리
//최단 거리는 BFS
//배열에 기록하는 방법

public class Ex0714 {
	
	static int n;
	static int m;
	static ArrayList<ArrayList<Integer>> graph;
	static int [] ch;
	static int [] dis;
	
	public void BFS(int v) {
		ch[1] = 1;
		dis[0] = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(v);
		while(q.isEmpty()) {
			int cv = q.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv]=1;
					q.offer(nv);
					dis[nv] = dis[cv]+1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex0714 T = new Ex0714();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		ch = new int[n+1];
		dis = new int[n+1];
		graph= new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i =0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i =0; i<dis.length; i++) {
			System.out.println(i+":"+dis[i]);
		}
	}
}
