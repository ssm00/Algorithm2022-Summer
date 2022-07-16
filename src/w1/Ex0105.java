package w1;

import java.util.Scanner;

public class Ex0105 {
	
	public String solution(String str){
		char [] c =  str.toCharArray();
		int lt = 0;
		int rt = c.length-1;
		
		while(lt<rt) {
			if(!Character.isAlphabetic(c[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(c[rt])) {
				rt--;
			}else {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++;
				rt--;
			}	
		}
		return String.valueOf(c);
	}
	
	
	public static void main(String[] args) {
		Ex0105 T = new Ex0105();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
