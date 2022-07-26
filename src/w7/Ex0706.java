package w7;

import java.util.Scanner;

//부분집합 만들기
//선택만 할때 2의n제곱 사용한다, 사용하지않는다
//DFS ch배열을 각 123 사용한다 안한다로 가지를만듬 1이면 사용 0이면 사용안함
//RE

public class Ex0706 {
	
	static int n;
	static int [] ch;
	
	public void DFS(int L) {
		if(L==n+1) {
			String temp = "";
			for(int i=1; i<=n; i++) {
				if(ch[i] == 1) {
					temp += i + " "; 
				}
			}
			if(temp.length()>0) {
				System.out.println(temp);
			}
		}else {
			ch[L] = 1;	//쓴다는걸 표시
			DFS(L+1);	//DFS내려가기 왼쪽으로 내려가는 것으로 간주 메소드에 lt를 넣지않으니까 ch[]를 이용
			ch[L] = 0;	//안쓴다는걸 표시
			DFS(L+1);	//DFS내려가기 오른쪽으로 내려가는 것으로 간주 메소드에 rt를 넣지않으니까 ch[]를 이용
		}
	}
	
	public static void main(String[] args) {
		Ex0706 T = new Ex0706();
		n=3;
		ch = new int[n+1];
		T.DFS(1);
				
	}
}
