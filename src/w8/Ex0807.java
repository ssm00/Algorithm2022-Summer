package w8;

import java.util.Scanner;

//조합의 경우의수
//0807랑 같은문제 nCr  = n-1Cr-1 + n-1Cr Ex 5C3 = 4C2 + 4C3

public class Ex0807 {
	static int [][] ch = new int [35][35];
	
	public int DFS(int n, int m) {
		if(ch[n][m] > 0) {
			return ch[n][m];
		}		
		if(n==m || m==0) {
			return 1;
		}else {
			ch[n][m] = DFS(n-1,m-1) + DFS(n-1,m);
		}
		return ch[n][m];
	}
	
	
	public static void main(String[] args) {
		Ex0807 T = new Ex0807();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(T.DFS(n,m));
		
	}
}
