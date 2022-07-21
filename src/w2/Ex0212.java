package w2;

//브루트 포스 모든 경우의수 for문을 먼저하고 

import java.util.Scanner;

public class Ex0212 {
	public int solution(int n, int m, int [][] arr) {
		int ans = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int cnt = 0;
				int mentor =0;
				int menti = 0;
				for(int k=0; k<m; k++) {
					for(int s=0; s<n; s++) {
						if(arr[k][s] == i) {
							mentor = s;
						}
						if(arr[k][s] == j) {
							menti = s;
						}
					}
					if(mentor < menti) {
						cnt++;
					}
				}
				if(cnt == m) {
					ans++;
				}
			}
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		Ex0212 T = new Ex0212();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] arr = new int [m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n,m,arr));
	}
}	
