package w1;

//replaceall 정규식 사용가능 [] 안에 있는 모든 걸 바꿈
//^는 아니다를 표현 - 로 사이 모두를표현
//StringBuilder사용하면 새로운 String을 만들지 않고 수정가능하여 메모리 사용에용의 
//StringBulider는 String으로 사용시 toString으로 변환해주어야함.

import java.util.Scanner;

public class Ex0108 {
	
	public String solution(String str) {
		String ans = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");		 
		String temp = new StringBuilder(str).reverse().toString(); 
		if(str.equals(temp)) {
			ans = "YES";
		}else {
			return ans;
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		Ex0108 T = new Ex0108();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
		
	}	
}
