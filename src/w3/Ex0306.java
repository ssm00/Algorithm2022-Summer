package w3;

//2point 알고리즘
//lt ,rt 사용하여 길이를 계산
//0일때 1로 바꾼다고 가정 후 계산 lt는 0을 바꾼 시작부분 rt는 계속증가

import java.util.Scanner;

public class Ex0306 {
	public int solution(int n, int m, int[] arr) {
		int ans = 0;
		int lt = 0;
		int len = 0;
		int cnt =  0;
		
		for(int rt=0; rt<n; rt++) {
			if(arr[rt]==0) {
				if(cnt == m) {
					while(arr[++lt] != 0) {
						continue;
					}
				}else {
					cnt++;					
				}
				len = rt-lt;
			}else if(arr[rt]==1) {
				len = rt-lt;
			}
			ans = Math.max(ans, len);
		}
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		Ex0306 T = new Ex0306();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println(T.solution(n,m,arr));
	}
}
