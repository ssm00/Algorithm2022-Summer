package w2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0201 {
	
	public ArrayList<Integer> solution(int [] arr){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(arr[0]);
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				ans.add(arr[i+1]);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0201 T = new Ex0201();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(arr)) {
			System.out.print(x+" ");
		}
		
	}

}
