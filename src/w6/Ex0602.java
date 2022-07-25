package w6;

import java.util.Scanner;

//버블소트
//가장 큰 값을 뒤로 미루기

public class Ex0602 {
	
	public int[] solution(int n, int [] arr) {
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		Ex0602 T = new Ex0602();
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
