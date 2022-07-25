package w5;

import java.util.Scanner;
import java.util.Stack;

//while로 배열찾기 주의 (안됨)

public class Ex0503 {
	
	public int solution(int n, int [][] arr1, int m, int[] arr2) {
		int ans = 0;
		Stack<Integer> st = new Stack<>();
		for(int x : arr2) {
			int cnt = 0;
			while(arr1[cnt][x] == 0) {	//for로 배열 찾기가 낫다 break두번해야함
				cnt++;
				if(cnt == n) {
					break;
				}
			}
			if(cnt == n) {
				break;
			}
			if (st.isEmpty()) {
				st.push(arr1[cnt][x]);
			} else if (st.peek() == arr1[cnt][x]) {
				st.pop();
				ans += 2;
			} else if (st.peek() != arr1[cnt][x]) {
				st.push(arr1[cnt][x]);
			}
			arr1[cnt][x] = 0;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0503 T = new Ex0503();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr1 = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		int m = sc .nextInt();
		int [] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt() - 1;
		}
		
		System.out.println(T.solution(n,arr1,m,arr2));
	}
}
