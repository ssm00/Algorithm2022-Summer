package w7;

//이진수 변환

import java.util.Scanner;

public class Ex0702 {
	
	public void DFS(int n) {
		if(n==0) {
			return;
		}else {
			DFS(n/2);
			System.out.print(n%2+" ");
		}
	}
	
	public static void main(String[] args) {
		Ex0702 T = new Ex0702();
		Scanner sc = new Scanner(System.in);
		T.DFS(11);
	}
}
