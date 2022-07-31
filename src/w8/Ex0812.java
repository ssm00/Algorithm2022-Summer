package w8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//토마토
//격자모양으로 토마토를 저장하고 상하좌우 하루있으면 익는다 모두 다 익는 최소일수 구하기
//최소일수 BFS
//dis라는 일수를 적어두는 배열을 만든다. levle을 카운트해서 구하는게 아니라 dis배열만 끝가지 돌리면 되기때문에
//LEVEL로 끝나는 시점 판별이 아니라 Q가 자동으로 비는 시점이 생긴다
//level로 새는게 아니라 dis배열로 새는거면 for문을 q.len로 안돌려도됨 offer하는 조건에서 끝나면 더 안들어감

class Point{
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Ex0812 {
	
	static int [] dx = {-1,0,1,0};
	static int [] dy = {0,1,0,-1};
	static int [][] board;
	static int [][] dis;
	static int n,m;
	static Queue<Point> q = new LinkedList<Point>();
	
	public void BFS() {
		while(!q.isEmpty()) {
			Point cur = q.poll();
			for(int i=0; i<4; i++) {
				int newx = cur.x+dx[i];
				int newy = cur.y+dy[i];
				if(newx>=0 && newx<n && newy>=0 && newy<m && board[newx][newy] == 0) {
					board[newx][newy] = 1;
					q.offer(new Point(newx,newy));
					dis[newx][newy] = dis[cur.x][cur.y]+1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex0812 T = new Ex0812();
		Scanner sc = new Scanner(System.in);
		
		m=sc.nextInt();
		n=sc.nextInt();
		
		board = new int[n][m];
		dis = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				board[i][j] = sc.nextInt();
				if(board[i][j] == 1) {
					q.offer(new Point(i, j));
				}
			}
		}
		
		T.BFS();
		
		boolean flag = false;
		int ans = 0;
		for(int i=0; i<n; i++) {
			if(flag == true) {
				break;
			}
			for(int j=0; j<m; j++) {
				if(board[i][j]==0) {
					System.out.println(-1);
					flag = true;
					break;
				}else {
					ans = Math.max(ans, dis[i][j]);
				}
			}
		}
		if(flag == false) {
			System.out.println(ans);
		}
	}
}
