package w6;

import java.util.Arrays;
import java.util.Scanner;

//DVD최적의 용량
//결정 알고리즘 
//문제의 답이 lt와 rt 사이에 있어야함
//부분으로 나누어 최적의값을 찾을때 이분탐색으로 범위를 좁혀나감
//배열합 구하기 Arrays.stream(arr).max.getAsInt()
// count에서 배치가능한 지점 갯수 리턴

public class Ex0609 {
	
	public int count(int [] arr, int capacity) {
		int cnt = 1;
		int sum = 0;
		for(int x : arr) {
			if(sum + x>capacity) {
				cnt++;
				sum = x;
			}else {
				sum += x;
			}
		}
		return cnt;
	}
	
	
	public int solution(int n, int m, int [] arr) {
		int ans=0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		while(lt <= rt) {
			int mid = (lt+rt)/2;
			if(count(arr,mid) <= m) {
				ans = mid;
				rt = mid-1;
			}else {
				lt = mid+1;
			}
	
		}	
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0609 T = new Ex0609();
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
