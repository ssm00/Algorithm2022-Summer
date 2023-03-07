package w8;

import java.util.Scanner;

//섬나라 아일랜드 갯수 구하기 DFS
//DFS호출 갯수를 구하기
//출구찾기처럼 끝나는 지점(7,7)이 정해져있는경우 basecase작성
//섬찾기처럼 없으면 basecase작성하지않고 DFS들어가는 경우에서 체크

public class Ex0813 {
	
	static int n;
	static int [][] board;
	static int ans = 0;
	static int [] dx = {-1,-1,0,1,1,1,0,-1};
	static int [] dy = {0,1,1,1,0,-1,-1,-1};
	
	
	public void DFS(int x, int y) {
		for(int i=0; i<8; i++) {
			int newx = x + dx[i];
			int newy = y + dy[i];
			if(newx >= 0 && newx<=n-1 && newy>=0 && newy<=n-1 && board[newx][newy] == 1) {
				board[newx][newy] = 0;
				DFS(newx,newy);
			}
			
		}
	}
	
	public void solution() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(board[i][j] == 1) {
					ans++;
					board[i][j] = 0;
					DFS(i,j);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Ex0813 T = new Ex0813();
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		board = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		T.solution();
		System.out.println(ans);
	}
}
