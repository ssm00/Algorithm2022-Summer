package w8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0802 {
	
	static int total;
	static int n;
	static int ans = 0;
	
	public void DFS(int L, int sum, int [] arr) {
		if(sum>total) {
			return;
		}
		if(L==n) {
			ans = Math.max(ans, sum);
			return;
		}
		else {
			DFS(L+1,sum+arr[L],arr);
			DFS(L+1,sum,arr);
		}
	}
	
	public static void main(String[] args) {
		Ex0802 T = new Ex0802();
		Scanner sc = new Scanner(System.in);
		total = sc.nextInt();
		n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		T.DFS(0,0,arr);
		System.out.println(ans);
	}
}
