package w8;

import java.util.Scanner;

//순열 구하기 10이하의 자연수n개가 주어지면 m개를 뽑아 일렬로 나열하는 방법을 모두 출력
//중복 지우기
//4개 순열이면 level 4까지 숫자갯수 만큼 가지 만들기

public class EX0806 {
	
	static int ch [];
	static int ans [];
	
	public void DFS(int L,int m, int [] arr) {
		
		if(L==m) {
			for(int i=0; i<ans.length; i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
			return;
		}else {
			for(int i=0; i<arr.length; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					ans[L] = arr[i];
					DFS(L+1,m,arr);
					ch[i] = 0;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		EX0806 T = new EX0806();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ch = new int [n];
		ans = new int[m];
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		T.DFS(0,m,arr);
		
	}
}
