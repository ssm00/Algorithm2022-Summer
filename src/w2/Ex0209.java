package w2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0209 {
	public int solution(int n,int [][] arr) {
		int ans = 0;
		int sum1;
		int sum2;
		
		for(int i=0; i<n; i++) {
			sum1 =0;
			sum2 =0;
			for(int j=0; j<n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			ans = Math.max(ans, sum1);
			ans = Math.max(ans, sum2);
		}
		
		sum1 = 0;
		sum2 = 0;
		
		for(int i=0; i<n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[n-i-1][n-i-1];
		}
		ans = Math.max(ans, sum1);
		ans = Math.max(ans, sum2);	
		return ans;
	}
	
	
	public static void main(String[] args) {
		Ex0209 T = new Ex0209();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int [n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n,arr));
	}
}
