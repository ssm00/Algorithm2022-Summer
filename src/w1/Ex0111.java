package w1;

// i랑 i+1 비교

import java.util.Scanner;

public class Ex0111 {
	
	public String solution(String str) {
		String ans = "";
		int temp = 1;
		str = str +" ";
		char arr [] = str.toCharArray();
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				temp++;
			}else {
				ans += arr[i];
				if(temp>1) {
					ans += temp;
					temp = 1;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0111 T = new Ex0111();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}

}
