package w2;

import java.util.Scanner;

public class Ex0202 {
	
	public int solution(int [] arr) {
		int ans = 1;
		int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(temp < arr[i]) {
				temp = arr[i];
				ans++;
			}
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		Ex0202 T = new Ex0202();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(arr));
	}
}
