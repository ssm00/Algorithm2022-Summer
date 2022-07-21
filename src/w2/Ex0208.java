package w2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex0208 {
	
	public int[] solution(ArrayList<Integer> arr) {
		ArrayList<Integer> newarr = new ArrayList<Integer>();
		int [] ans = new int[arr.size()];
		for(int i=0; i<ans.length; i++) {
			ans[i] = arr.get(i);
		}
		Collections.sort(arr,Collections.reverseOrder());
		
		for(int i=0; i<ans.length; i++) {
			ans[i] = arr.indexOf(ans[i]) + 1;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0208 T = new Ex0208();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			arr.add(sc.nextInt());
		}
		for(int x : T.solution(arr)) {
			System.out.print(x + " ");
		}
	}
}
