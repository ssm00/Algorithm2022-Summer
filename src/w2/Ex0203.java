package w2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0203 {
	
	public ArrayList<Character> solution(int [] arr1 , int [] arr2){
		ArrayList<Character> ans = new ArrayList<Character>();
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == arr2[i]) {
				ans.add('D');
			}else if(arr1[i]==1 && arr2[i]==3) {
				ans.add('A');
			}else if(arr1[i]==2 && arr2[i]==1) {
				ans.add('A');
			}else if(arr1[i]==3 && arr2[i]==2) {
				ans.add('A');
			}else {
				ans.add('B');
			}
		}
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		Ex0203 T = new Ex0203();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr1 = new int[n];
		int [] arr2 = new int[n];
		
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(char x : T.solution(arr1,arr2)) {
			System.out.println(x);
		}
	}
}
