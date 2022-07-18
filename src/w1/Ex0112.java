package w1;

//substring 문자열 자르기 slice도 있음
//substr은 시작문자 갯수 substring은 시작문자 마지막문자 하나만 넣으면 갯수이후로 시작
//replace로 문자 바꾸기
//parseInt(int,2)이진수 -> 십진수 바꾸기
//toBinaryString(int) 십진수 ->이진수 바꾸기


import java.util.Scanner;

public class Ex0112 {
	
	public String solution(int n, String str) {
		String ans = "";
		for(int i=0; i<n; i++) {
			String temp = str.substring(0,7).replace("#", "1").replace("*", "0");
			int num = Integer.parseInt(temp,2);
			ans += (char)num;
			str = str.substring(7);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0112 T = new Ex0112();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n,str));
		
		
	}
}
