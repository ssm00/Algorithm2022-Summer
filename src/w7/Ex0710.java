package w7;

import java.util.LinkedList;
import java.util.Queue;

//말단노드로 가는 최소경로
//BFS풀이

public class Ex0710 {
	Node root;
	public int BFS(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		int L = 0;
		q.offer(root);
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				Node current = q.poll();
				if(current.lt == null && current.rt == null) {
					return L;
				}
				if(current.lt != null) {
					q.offer(current.lt);
				}
				if(current.rt != null) {
					q.offer(current.rt);
				}
			}
			L++;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Ex0710 tree = new Ex0710();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(tree.root));
	}
}
