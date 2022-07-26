package w6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0606 {
	
	public int [] solution(int n, int [] arr) {
		int [] ans = new int[2];
		int [] arr2 = new int[n];
		
		for(int i=0; i<n; i++) {
			arr2[i] = arr[i];
		}
		Arrays.sort(arr2);
		
		int cnt = 0;
		for(int i=0; i<n; i++) {
			if(arr2[i] != arr[i]) {
				ans[cnt] = i+1;
				cnt++;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0606 T = new Ex0606();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n,arr)) {
			System.out.print(x+" ");
		}
		
	}
}
