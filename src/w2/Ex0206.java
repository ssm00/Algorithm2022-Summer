package w2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0206 {
	
	public ArrayList<Integer> solution(int n, int [] arr) {
		ArrayList<Integer> ansArr = new ArrayList<Integer>();
		int [] net = new int[n+1];
		
		//에라토스테네스채
		for(int i=2; i<n+1; i++) {
			if(net[i] == 0) {
				ansArr.add(i);
				for(int j=i; j<n+1; j=i+j) {
					net[j] = 1;
				}
			}
		}
		arr[i]
		
		return ansArr;
	}
	
	
	public static void main(String[] args) {
		Ex0206 T = new Ex0206();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n,arr)) {
			System.out.print(x + " ");
		}
		
		
	}
}
