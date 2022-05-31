package Tree;

class Node {
	int data;
	Node left;
	Node right;
	Node(int x) {
		x = data;
//		right = left = null;
	}
}

public class traversal {
	
	public static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data + "\t");
        preOrder(root.left);
        preOrder(root.right);
    }
    
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        preOrder(root);
	}

}
