package w7;

//DFS 이진순회
//전위순회, 중위 순회, 후위 순회
//DFS는 경우의수

class Node{
	int data;
	Node lt,rt;
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
}

public class Ex0705 {
	Node root;
	public void DFS(Node root) {
		if(root==null) return;
		else {
			DFS(root.lt);
			DFS(root.rt);
			System.out.print(root.data+" ");
		}
	}
	
	public static void main(String[] args) {
		Ex0705 tree = new Ex0705();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}
}
