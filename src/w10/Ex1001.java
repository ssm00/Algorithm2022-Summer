package w10;

import java.util.Scanner;

public class Ex1001 {
	
	static int[] dy;
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i=3; i<=n; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		return dy[n];
	}
	
	
	public static void main(String[] args) {
		Ex1001 t = new Ex1001();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dy = new int[n+1];
		System.out.println(t.solution(n));
		
	}
}
