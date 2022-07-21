package w2;

import java.util.Scanner;

public class Ex0211 {
	
	public int solution(int n, int [][] arr) {
		int ans = 0;
		int past = 0;
		int sum = 0;
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<5; j++) {
					if(arr[k][j] == arr[i][j]) {
						sum++;
						break;
					}
				}
			}
			if(past < sum) {
				past = sum;
				ans = k+1;
			}
			sum = 0;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0211 T = new Ex0211();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int [n][5];
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n,arr));
	}
}
