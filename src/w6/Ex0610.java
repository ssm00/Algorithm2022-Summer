package w6;

import java.util.Arrays;
import java.util.Scanner;


//마구간 배치
//결정 알고리즘
//count에서 말이 배치되는 갯수 리턴하여 3과 같은지 비교

public class Ex0610 {
	
	public int count(int [] arr, int dist) {
		int cnt=1;
		int ep = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]-ep >= dist) {
				cnt++;
				ep=arr[i];
			}
		}
		return cnt;
	}
	
	public int solution(int n, int c, int [] arr) {
		int ans = 0;
		Arrays.sort(arr);
		int lt=1;
		int rt=arr[n-1];
		while(lt<=rt) {
			int mid=(lt+rt)/2;
			if(count(arr,mid) >= c) {
				ans = mid;
				lt = mid+1;
			}else {
				rt = mid-1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0610 T = new Ex0610();
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
