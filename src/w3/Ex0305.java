package w3;

import java.util.Scanner;

//연속된 수열의 합
//for문 이용 lt rt를 아용한다
//RE

public class Ex0305 {
	
	public int solution(int n) {
		int ans = 0;
		int lt = 0;
		int m = n/2+1;
		int sum = 0;
		int [] arr = new int[m];
		
		for(int i=0; i<m; i++) {
			arr[i] = i+1;
		}
		
		for(int rt=0; rt<m; rt++) {
			sum += arr[rt];
			if(sum == n) {
				ans++;
			}
			while(sum>=n) {
				sum -= arr[lt++];
				if(sum == n) {
					ans++;
				}
			}
		}
		
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		Ex0305 T = new Ex0305();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}
