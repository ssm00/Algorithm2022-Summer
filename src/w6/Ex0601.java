package w6;

import java.util.Scanner;

//선택정렬


public class Ex0601 {
	
	public int[] solution(int n, int [] arr) {
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Ex0601 T = new Ex0601();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(n,arr)) {
			System.out.print(x + " ");
		}
		
	}
}
