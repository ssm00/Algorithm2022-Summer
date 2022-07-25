package w3;

import java.util.Scanner;

//연속된합의 최대값구하기
//sliding window
//길이가 3인 창을 만든다
//2중 for문 사용시 시간에러
//창의 처음값을 빼고 창의 마지막+1번째 값을 더해주기 2번만 계산하면된다.

public class Ex0303 {
	
	public int solution(int n, int k, int [] arr) {
		int ans = 0;
		int sum = 0;
		for(int i=0; i<k; i++){
			sum += arr[i];
		}
		ans = sum;
		for(int i=0; i<arr.length-k; i++) {
			sum -= arr[i];
			sum += arr[i+k];
			ans = Math.max(sum, ans);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0303 T = new Ex0303();
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
