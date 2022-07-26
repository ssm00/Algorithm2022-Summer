package w6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//이분탐색

public class Ex0608 {
	
	public int solution(int n, int m, int [] arr) {
		int ans = 0;
		Arrays.sort(arr);
		int lt = 0;
		int rt = n-1;
		while(lt <= rt) {
			int mid = (lt+rt) / 2;
			if(arr[mid] == m) {
				ans = mid+1;
				break;
			}else if(arr[mid] > m){
				rt = mid-1;
			}else {
				lt = mid+1;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0608 T = new Ex0608();
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
