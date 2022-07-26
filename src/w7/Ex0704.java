package w7;

//fibo
import java.util.Scanner;

public class Ex0704 {
	
	static int [] fibo;
	
	public int DFS(int n) {
		if(fibo[n]!= 0) {
			return fibo[n];
		}
		if(n==1 || n==2) {
			return 1;
		}else {
			return fibo[n] = DFS(n-1) + DFS(n-2);
		}
	}
	
	public static void main(String[] args) {
		Ex0704 T = new Ex0704();
		Scanner sc = new Scanner(System.in);
		fibo = new int[46];
		System.out.println(T.DFS(6));
	}
}
