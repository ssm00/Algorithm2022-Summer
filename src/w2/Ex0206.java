package w2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0206 {
	
	public ArrayList<Integer> solution(int n, int [] arr) {
		ArrayList<Integer> ansArr = new ArrayList<Integer>();
		int [] net = new int[100001];
		
		//에라토스테네스채
		net[0] = 1;
		net[1] = 1;
		for(int i=2; i<100001; i++) {
			if(net[i] == 0) {
				for(int j=i+i; j<100001; j=i+j) {
					net[j] = 1;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			int temp = arr[i];
			int res = 0;
			while(temp > 0) {
				int t = temp%10;
				res = res*10 + t;
				temp = temp/10;
			}
			arr[i] = res;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(net[arr[i]] == 0) {
				ansArr.add(arr[i]);
			}
		}
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
