package w7;

import java.util.LinkedList;
import java.util.Queue;

//BFS while문 q사용 len만큼 반복 = q에있는 자식들 넣기 끝나면 level++
//자기자신 빼고 자식 넣기 반복하면됨 len만큼
//BFS는 최단거리 구하기나 최소횟수 구하기

public class Ex0707 {
	
	Node root;
	public void BFS(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				Node cur = q.poll();
				System.out.print(cur.data+" ");
				if(cur.lt != null) q.offer(cur.lt);
				if(cur.rt != null) q.offer(cur.rt);
			}
			len++;
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		Ex0707 tree = new Ex0707();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);
	}
}
