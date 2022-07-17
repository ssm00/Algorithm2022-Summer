package w1;

import java.util.Scanner;

public class Ex0110 {
	
	public int [] solution(String str, char t) {
		int [] ans = new int[str.length()];
		int p = 1000;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==t) {
				p=0;
				ans[i] = p;
			}else {
				p++;
				ans[i] = p;
			}
		}
		p = 1000;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==t) {
				p=0;
			}else {
				p++;
				ans[i] = Math.min(ans[i], p);
			}
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		Ex0110 T = new Ex0110();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char t = sc.next().charAt(0);
	
		for(int x : T.solution(str, t)) {
			System.out.print(x+" ");
		}
	
	
	}

}
