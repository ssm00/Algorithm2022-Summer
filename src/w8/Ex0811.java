package w8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//미로찾기 최단거리 DFS

class Point{
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Ex0811 {
	
	static int ans = 0;
	static int [] dx = {-1,0,1,0};
	static int [] dy = {0,1,0,-1};
	static int [][] board;
	static boolean flag = false;
	
	
	public void BFS(int x, int y) {
		Queue<Point> q = new LinkedList<Point>();
		q.offer(new Point(x, y));
		board[x][y] = 1;
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				Point current = q.poll();
				if(flag == true) {
					return;
				}
				for(int j=0; j<4; j++) {
					int newx = current.x + dx[j];
					int newy = current.y + dy[j];		
					if(newx == 7 && newy ==7) {
						board[newx][newy] = 1;
						ans++;
						flag = true;
						break;
					}
					if(newx>=1 && newy>=1 && newx<=7 && newy<=7 && board[newx][newy] == 0) {
						board[newx][newy] = 1;
						q.offer(new Point(newx,newy));
					}
				}	
			}
			if(flag ==true) {
				break;
			}
			ans++;
		}
		
		
	}
	
	public static void main(String[] args) {
		Ex0811 T = new Ex0811();
		Scanner sc = new Scanner(System.in);
		
		board = new int[8][8];
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		board[1][1] = 1;
		T.BFS(1, 1);
		if(board[7][7] == 0) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
			
		}

	}
}
