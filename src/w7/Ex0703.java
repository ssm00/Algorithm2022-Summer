package w7;

import java.util.Scanner;

public class Ex0703 {
	
	public int DFS(int n) {
		if(n==1) {
			return 1;
		}else {
			return n * DFS(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		Ex0703 T = new Ex0703();
		Scanner sc = new Scanner(System.in);
		System.out.println(T.DFS(6));
	}
}
