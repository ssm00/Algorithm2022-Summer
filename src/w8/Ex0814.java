package w8;

import java.util.ArrayList;

//피자배달
//피자집을 먼저 선택 집이 6개의 피자집중에 4개면 6C4 조합임
//각 피자집 조합마다 집과의 거리를 구해서 더하면됨

import java.util.Scanner;


//class Point{
//	int x,y;
//	
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}


public class Ex0814 {
	
	static int n,m,len;
	static ArrayList<Point> house;
	static ArrayList<Point> pizza;
	static int [] combi;
	static int ans = Integer.MAX_VALUE;
	
	public void DFS(int L, int s) {
		if(L == m) {
			int sum = 0;
			for(Point h : house) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis=Math.min(dis,(Math.abs(h.x-pizza.get(i).x)+Math.abs(h.y-pizza.get(i).y)));
				}
				sum += dis;
			}
			ans = Math.min(ans, sum);
		}else {
			for(int i=s; i<len; i++) {
				combi[L] = i;
				DFS(L+1,i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex0814 T = new Ex0814();
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		m=sc.nextInt();
		
		house = new ArrayList<>();
		pizza = new ArrayList<>();
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int temp = sc.nextInt();
				if(temp == 1) {
					house.add(new Point(i,j));
				}else if(temp == 2) {
					pizza.add(new Point(i, j));
				}
			}
		}
		len = pizza.size();
		combi = new int[len];
		T.DFS(0, 0);
		System.out.println(ans);
	}
}
