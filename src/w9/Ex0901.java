package w9;
//그리디
//씨름선수


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
	
	int w;
	int h;
	public Body(int w, int h) {
		this.w = w;
		this.h = h;
	}
	@Override
	public int compareTo(Body o) {
		return o.h-this.h;
	}
}

public class Ex0901 {
	
	public int solution(ArrayList<Body> arr, int n) {
		int ans = 0;
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		for(Body ob : arr) {
			if(ob.w > max) {
				max = ob.w;
				ans++;
				
				
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0901 T = new Ex0901();
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Body> arr = new ArrayList<Body>();
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.add(new Body(a, b));
		}
		
		
		System.out.println(T.solution(arr, n));
	}
}
