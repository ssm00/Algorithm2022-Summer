package w4;

//hashmap 비교할때 equals사용
//슬라이딩 윈도우 for문 i를 rt로 설정하고 3칸일경우 
//2칸채워놓고 rt 추가 후 비교 후 lt 제거 순서 반복

import java.util.HashMap;
import java.util.Scanner;

public class Ex0404 {
	
	public int solution(String a, String b) {
		int ans=0;
		HashMap<Character, Integer> am = new HashMap<Character, Integer>();
		HashMap<Character, Integer> bm = new HashMap<Character, Integer>();
		for(char x : b.toCharArray()) {
			bm.put(x, bm.getOrDefault(x, 0) + 1);
		}
		int l = b.length()-1;
		for(int i=0; i<l; i++) {
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i),0) + 1);
		}
		int lt=0;
		for(int rt=l; rt<a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) +1);
			if(am.equals(bm)) {
				ans++;
			}
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt)) == 0) {
				am.remove(a.charAt(lt));
			}
			lt++;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0404 T = new Ex0404();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(T.solution(a, b));
	}
}
