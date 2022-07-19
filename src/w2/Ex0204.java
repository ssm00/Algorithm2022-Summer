package w2;

import java.util.Scanner;

public class Ex0204 {
	
	public int [] solution(int n) {
		int [] ans = new int[n];
		ans[0] = 1;
		ans[1] = 1;
		for(int i=2; i<n; i++) {
			ans[i] = ans[i-1]+ ans[i-2];
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0204 T = new Ex0204();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int x : T.solution(n)) {
			System.out.print(x + " ");
		}
		
	}
}
