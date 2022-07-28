package w8;

//합이같은 부분집합
//DFS 순서가 상관없는 집합, 경우의수 찾는 경우에는 가지를 2개 ox로 만들어서 사용
//순서가 다르면 다르게 되는 길찾기 같은경우는 가지를 여러개 만들어서 사용 

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0801 {
	
	static String ans = "NO";
	static int n,total = 0;
	boolean flag = false;
	
	public void DFS(int L, int sum, int [] arr) {
		if(flag) {
			return;
		}
		if(sum>total/2) {
			return;
		}
		if(L==n) {
			if((total-sum)==sum) {
				ans = "YES";
				flag = true;
			}
		}else {
			DFS(L+1,sum+arr[L],arr);
			DFS(L+1,sum,arr);
		}
	}
	
	public static void main(String[] args) {
		Ex0801 T = new Ex0801();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		T.DFS(0, 0,arr);
		System.out.println(ans);
	}
}
