package w3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//2point 알고리즘
//Arrays.sort() arr배열 Collections.sort() arrlist sort

public class Ex0302 {
	
	public ArrayList<Integer> solution(int [] arr1, int [] arr2){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int p1 = 0;
		int p2 = 0;
		
		while(p1< arr1.length && p2< arr2.length) {
			if(arr1[p1] < arr2[p2]) {
				p1++;
			}else if(arr1[p1] > arr2[p2]) {
				p2++;
			}else {
				ans.add(arr1[p1]);
				p1++;
				p2++;
			}
		}
		
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0302 T = new Ex0302();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr1 = new int[n];
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int x : T.solution(arr1, arr2)) {
			System.out.print(x+" ");
		}
	}
}
