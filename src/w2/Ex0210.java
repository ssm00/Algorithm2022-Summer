package w2;

import java.util.Scanner;

public class Ex0210 {
	
	public int solution(int n, int [][] arr) {
		int ans = 0;
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<n+1; j++) {
				if(arr[i][j] > arr[i-1][j] &&
				   arr[i][j] > arr[i+1][j] &&
				   arr[i][j] > arr[i][j-1] &&
				   arr[i][j] > arr[i][j+1]) {
					ans++;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0210 T = new Ex0210();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int [n+2][n+2];
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<n+1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n,arr));
	}
}
