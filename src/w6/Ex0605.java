package w6;

import java.util.*;

//중복 찾기 HashMap n 정렬 nlogn 

public class Ex0605 {
	
	public String solution(int n, int [] arr) {
		String ans = "U";
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i] == arr[i+1]) {
				return "D";
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0605 T = new Ex0605();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n,arr));
	}
}
