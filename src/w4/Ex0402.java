package w4;

import java.util.HashMap;
import java.util.Scanner;

//해쉬맵 비교

public class Ex0402 {
	
	public String solution(String str1, String str2) {
		String ans = "YES";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : str1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) +1);
		}
		for(char x : str2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
			map.put(x, map.get(x)-1);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0402 T = new Ex0402();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(T.solution(str1,str2));
	}
}
