package w5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex0508 {
	
	class Person{
		int id;
		int value;
		
		public Person(int id, int value) {
			this.id = id;
			this.value = value;
		}
		
	}
	
	public int solution(int n, int m, int [] arr) {
		int ans = 0;
		Queue<Person> q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			q.offer(new Person(i,arr[i]));
		}
		
		while(!q.isEmpty()) {
			Person p = q.poll();
			for(Person x : q) {
				if(p.value < x.value) {
					q.offer(p);
					p = null;
					break;
				}
			}
			if(p != null) {
				ans++;
				if(p.id == m) {
					return ans;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0508 T = new Ex0508();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n,m,arr));
	}
}
