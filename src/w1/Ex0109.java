package w1;

//asci 48~57 숫자 0-9
//65~90 알파벳 대문자

//2번 방법 Character.isDigit = 숫자냐?
//Integer.parseInt() int로 바꾸기

//3번 relpaceAll로 지우기

import java.util.Scanner;

public class Ex0109 {
	
	public int solution(String str) {
		int ans = 0;
		for(char x : str.toCharArray()) {
			if(x>=48 && x<=57) {
				ans = ans *10 + (x-48);
			}
		}
		return ans;
		
//3		str = str.toUpperCase().replaceAll("[A-Z]", "");
//		return Integer.parseInt(str);
	}
	
	public static void main(String[] args) {
		Ex0109 T = new Ex0109();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
