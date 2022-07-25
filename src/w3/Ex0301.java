package w3;

import java.util.ArrayList;

//슬라이딩 윈도우 연속된 수 합 
//2point 알고리즘
//오름차순 정렬되어야함
//arr1의 point1과 arr2의 point2를 비교하여 작은쪽을 answer에 저장


import java.util.Scanner;

public class Ex0301 {
	
	public ArrayList<Integer> solution(int [] arr1, int [] arr2) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int p1=0;
		int p2=0;
		while(p1<arr1.length && p2<arr2.length) {
			if(arr1[p1] > arr2[p2]) {
				ans.add(arr2[p2++]);
			}else {
				ans.add(arr1[p1++]);
			}
		}
		while(p1<arr1.length) {
			ans.add(arr1[p1++]);
		}
		while(p2<arr2.length) {
			ans.add(arr2[p2++]);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Ex0301 T = new Ex0301();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr1 = new int[n];
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int x : T.solution(arr1, arr2)) {
			System.out.print(x+" ");
		}
	}

}
