package w3;

import java.util.Scanner;

//연속된 수열의 합 : 슬라이딩윈도우, 2point
//2point 활용
//lt와 rt를 이용하여 sliding window만들기 

public class Ex0304 {
	
	
	public int solution(int n, int k, int [] arr) {
		int ans = 0;	
		int lt = 0;
		int sum = 0;

		for(int rt=0; rt<n; rt++) {
			sum += arr[rt];
			if(sum==k) {
				ans++;
			}
			while(sum>=k) {
				sum -= arr[lt++];
				if(sum==k) {
					ans++;
				}
			}
		
		}

		return ans;
	}
	
	
	public static void main(String[] args) {
		Ex0304 T = new Ex0304();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k= sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n,k,arr));
	}
}
