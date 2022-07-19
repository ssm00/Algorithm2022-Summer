package w2;

//에라토스테네스의 채
//배수 지우기

import java.util.Scanner;

public class Ex0205 {
	
	public int solution(int n) {
		int ans = 0;
		int [] arr = new int[n+1];
		for(int i=2; i<arr.length; i++) {
			if(arr[i] == 0) {
				ans++;
				arr[i] = 1;
				for(int j=i; j<arr.length; j=j+i) {
					arr[j] = 1;
				}
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0205 T = new Ex0205();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}

}
