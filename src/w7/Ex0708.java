package w7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//송아지찾기(최소횟수)
//최소횟수,최단거리 구하기 BFS
//레벨이 점프횟수 가지는 1,-1,5 가지가3개인 BFS트리
//0에서 1,-1,5,가 될수 있음
//1에서 2,0,6....
//14를 찾았을때 레벨을 구하면됨
//-1,1더했을때 0 으로 무한루프돌수 있으므로 체크해주기

public class Ex0708 {
	
	public int BFS(int s, int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		int [] dis = {-1,1,5};
		int ch [] = new int [10001];
		ch[s] = 1;
		int L = 0;
		q.offer(s);
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				int cur = q.poll();
				for(int j=0; j<3; j++) {
					int nx = cur+dis[j];
					if(nx == n) {
						return L+1;
					}
					if(ch[nx] == 0 && nx<10001 && nx>0) {
						q.offer(dis[j]+cur);
						ch[dis[j]+cur] = 1;
					}
				}
			}
			L++;
		}
		return L;
	}
	
	public static void main(String[] args) {
		Ex0708 T = new Ex0708();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(T.BFS(s,n));
	}

}
