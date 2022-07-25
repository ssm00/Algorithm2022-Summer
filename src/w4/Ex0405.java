package w4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//TreeSet 자료구조
//중복제거에 많이 사용된다.

public class Ex0405 {
	
	public int solution(int n, int k, int [] arr) {
		int ans = -1;
		TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0;
		for(int x : tset) {
			cnt++;
			if(cnt == k) {
				return x;
			}
		}
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		Ex0405 T = new Ex0405();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}
}
