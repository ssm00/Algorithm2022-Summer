package w2;

import java.util.Scanner;

public class Ex0207 {
	public int solution(int [] arr) {
		int ans = 0;
		int now = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == 1) {
				now++;
				ans += now;
			}else {
				now = 0;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0207 T = new Ex0207();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int[n+1];
		arr[n] = 0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(arr));
		
	}
}
