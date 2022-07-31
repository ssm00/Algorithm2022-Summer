package w8;

import java.util.Scanner;

//조합만들기
//파라미터 Level start


public class Ex0809 {
	
	static int n;
	static int m;
	static int [] combi;
	
	
	
	public void DFS(int L, int s) {
		if(L == m) {
			for(int x : combi) {
				System.out.print(x + " ");
			}
			System.out.println();
		}else {
			for(int i=s; i<=n; i++) {
				combi[L] = i;
				DFS(L+1,i+1);
			}
			
		}
	}
	
	public static void main(String[] args) {
		Ex0809 T = new Ex0809();
		Scanner sc = new Scanner(System.in);
		
		
		n = sc.nextInt();
		m = sc.nextInt();
		combi = new int[m];
		
		T.DFS(0, 1);
	}
}
