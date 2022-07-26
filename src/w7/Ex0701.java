package w7;

import java.util.Scanner;

public class Ex0701 {
	
	public void DFS(int n) {
		if(n==0) {
			return;
		}else {
			DFS(n-1);			
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		Ex0701 T = new Ex0701();
		Scanner sc = new Scanner(System.in);
		T.DFS(3);
		
		
	}
}
