package w8;

//최대점수 구하기
//부분집합 구하기임 -> DFS 문제를 푼다, 풀지않는다로 가지를 만들어서 DFS



import java.util.Scanner;

public class Ex0803 {
	
	static int n;
	static int mtime;
	static int ans;
	
	public void DFS(int L, int time, int score, int [][] arr) {
		if(time > mtime) {
			return;
		}
		if(L==n) {
			ans = Math.max(ans, score);
		}else {
			DFS(L+1,time+arr[L][1],score+arr[L][0],arr); 	//풀었을때
			DFS(L+1,time,score,arr);					//안풀었을때
		}
	}
	
	
	public static void main(String[] args) {
		Ex0803 T = new Ex0803();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		mtime = sc.nextInt();
		int [][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		T.DFS(0,0,0,arr);
		System.out.println(ans);
	}
}
