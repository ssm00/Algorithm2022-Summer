package w4;

import java.util.HashMap;
import java.util.Scanner;

//아나그램처럼 등장횟수를 샐때 이용 슬라이딩 윈도우 사용하면 연속된 순서바뀐 문자 찾기 가능.
//슬라이딩 윈도우 - > 연속된 수 합, 길이    해쉬맵추가하면 순서바뀐 + 연속된 
//HashMap key value
//map.getOrDefault(x,0) x있으면 value리턴 없으면 0 리턴
//map.keySet() 키 배열변환
//map.containsKey() 있는 키면 true변환
//map.size() 키 개수 변환
//map.remove() 특정키 삭제

public class Ex0401 {
	
	public char solution(int n, String str) {
		char ans = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char s : str.toCharArray()) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		int temp = 0;
		for(char key : map.keySet()) {
			if(map.get(key) > temp) {
				temp = map.get(key);
				ans = key;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0401 T = new Ex0401();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n,str));
	}
}
