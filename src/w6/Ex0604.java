package w6;

import java.util.Scanner;

//LRU캐시
//삽입정렬 이용
//하나씩 i를 i+1로 밀어냄 있으면 그전까지만 밀어내기

public class Ex0604 {
	
	public int [] solution(int s, int n, int [] arr) {
		int [] cache = new int[s];
		
		for(int x : arr) {
			int temp = -1;
			for(int i=0; i<s; i++) {
				if(x == cache[i]) {
					temp = i;
				}
			}
			if(temp == -1) {
				for(int i=s-1; i>=1; i--) {
					cache[i] = cache[i-1];
				}
			}else {
				for(int i=temp; i>=1; i--) {
					cache[i] = cache[i-1];
				}
			}
			cache[0] = x;
		}
		
		return cache;
	}
	
	
	public static void main(String[] args) {
		Ex0604 T = new Ex0604();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(s,n,arr)) {
			System.out.print(x + " ");
		}
	}
}
