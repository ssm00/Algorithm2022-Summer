package w8;

import java.util.Scanner;

//중복순열 구하기 1~n까지의 구슬중 중복을 허락하여 M번뽑아 일렬로 나열하는 방법을 출력
//이전까지 포함한다 안한다, 2가지 가닥
//이문제는 여러가지의 가닥 만들기
//DFS는 레벨로 끝낼수 있을때사용

public class Ex0804 {
	
	static int n;
	static int m;
	static int [] pm;
	
	public void DFS(int L, int num) {
		if(L == m) {
			for(int i=0; i<L; i++) {
				System.out.print(pm[i]+" ");
			}
			System.out.println();
			return;
		}else {
			for(int i=1; i<=n; i++) {
				pm[L] = i;
				DFS(L+1,i);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex0804 T = new Ex0804();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pm = new int[n];
		
		T.DFS(0,0);
	}
}
