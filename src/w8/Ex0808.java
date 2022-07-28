package w8;

import java.util.Scanner;

//수열 예측하기 수열은 DFS가지갯수만큼 집합이면 ox로 2가지 가지
//삼각형
//차례로 4개면 4C0 4C1 4C2 4C3 * 순열 = M이면 정답

public class Ex0808 {
	
	static int n,m;
	static int [] dy ,b = new int[11];
	static int [][] ch = new int[35][35];
	static int [] ch2 = new int [11];
	static boolean flag = false;
	static int [] p;
	
	
	public int combi(int n, int r) {
		if(ch[n][r] > 0 ) {
			return ch[n][r];
		}
		if(r==n || r==0) {
			return 1;
		}else {
		 	return ch[n][r] = combi(n-1,r-1) + combi(n-1,r);
		}
	}
	
	public void DFS(int L, int sum) {
		if(flag) {
			return;
		}
		if(L == n) {
			if(sum == m) {
				for(int x : p) {
					System.out.print(x + " ");
				}
				flag = true;
			}
		}else {
			for(int i=1; i<=n; i++) {
				if(ch2[i] ==0) {
					ch2[i] = 1;
					p[L] = i;
					DFS(L+1,sum+(b[L] * p[L]));
					ch2[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex0808 T = new Ex0808();
		Scanner sc = new Scanner(System.in);
		
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		b = new int[n];
		p = new int[n];
		
		for(int i=0; i<n; i++) {
			b[i]= T.combi(n-1, i);
		}
		T.DFS(0,0);
		
	}
}
