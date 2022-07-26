package w6;

//Comparble implements 받으면 compareTo로 비교가능 Collections.sort()
//compare To 같을때 -값 반환하면 오름차순 내림차순은 + 반환

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Point implements Comparable<Point>{
	public int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) {
			return this.y-o.y;
		}else {
			return this.x - o.x;
		}
	}
}

public class Ex0607 {	
	
	public static void main(String[] args) {
		Ex0607 T = new Ex0607();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Point> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Point(x, y));
		}
		
		Collections.sort(arr);
		
		for(Point x : arr) {
			System.out.println(x.x +" "+ x.y);
		}
		
	}
}
