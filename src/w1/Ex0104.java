package w1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0104 {
	
	public ArrayList<String> solution(int n, String [] str){
		ArrayList<String> al = new ArrayList<String>();
		for(String s : str) {
			String temp = new StringBuilder(s).reverse().toString();
			al.add(temp);
		}
		return al;
	}
	
	public static void main(String[] args) {
		Ex0104 T = new Ex0104();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = sc.next();
		}
		for(String x : T.solution(n,str)) {
			System.out.println(x);
		}
	}
}
