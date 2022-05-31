package LinkedList;

class Node{
	int data;
	Node next;
	Node(int x) {
		data = x;
		next = null;
	}
}

public class func {

	public static void print(Node head) {
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	//recursively print the linkedlist
	public static void print_recur(Node head) {
		while(head == null)
			return ;
		System.out.println(head.data);
		print_recur(head.next);
	}
	
	
	//insert a node in the beginning of linkedlist
	static Node insert_begin(Node head, int val) {
		Node temp = new Node(val);
		if(head == null)
			return temp;
		temp.next = head;
		head = temp;
		return head;
	}
	
	//insert a node in the end of the linkedlist.
	static Node insert_end(Node head, int val) {
		Node temp = new Node(val);
		Node curr = head;
		if(head == null)
			return temp;
		while(curr.next != null)
			curr = curr.next;
		curr.next = temp;
		return head;
	}
	
	//insert a node in the given position of linkedlist.
	static Node insert_pos(Node head, int val, int pos) {
		Node temp = new Node(val);
		Node curr = head;
		if(head == null)
			return null;
		for(int i = 0; i < pos-2; i++)
			curr = curr.next;
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}
	
	
	//Delete a node in the linkedlist.
	static Node delete_begin(Node head) {
		head = head.next;
		return head;
	}
	
	
	//Delete a node in the end of the linkedlist.
	static Node delete_end(Node head) {
		Node curr = head;
		if(head == null || head.next == null)
			return null;
		while(curr.next.next != null)
			curr = curr.next;
		curr.next = null;
		return head;
	}
	
	//Delete node of the given position in the linkedist.
	static Node delete_pos(Node head, int pos) {
		Node curr = head;
		for(int i = 0; i < pos-2; i++)
			curr = curr.next;
		curr.next = curr.next.next;
		return head;
	}
	
	//Middle node of the linkedlist.
	public static int middlenode(Node head) {
		if(head == null) {
			return 0;
		}
		Node first = head, second = head;
		while(first != null && first.next != null) {
			second = second.next;
			first = first.next.next;
		}
		int x = second.data;
		return x;		
	}
	
	
	//find the nth node form the end of the linkedlist.
	static void nth_node_from_end(Node head, int n) {
		//node curr = head;
		int len = 0;
		for(Node curr = head; curr != null; curr = curr.next)
			len++;
//		if(len < n)
//			return;
		Node curr = head;
		for(int i = 1; i < len-n+1; i++) {
			curr = curr.next;
		}
		System.out.println("Nth node of linkedlist from the end : " + curr.data);
	}

	static Node reverse(Node head) {
		if(head == null)
			return null;
		Node curr = head, prev = null;
		while(curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	//sorts the linkedlist.
	static Node sort(Node head) {
		if(head.next == null)
			return null;
		Node first = head;
		Node second = null;
		while(first != null) {
			second = first.next;
			while(second != null) {
				if(first.data > second.data) {
					int temp = second.data;
					second.data = first.data;
					first.data = temp;
				}
				second = second.next;
			}
			first = first.next;
		}
		return head;
	}
	
	//Remove duplicate node in the linkedlist.
	static Node RemoveDuplicate(Node head) {
		Node curr = head;
		while(curr != null && curr.next != null) {
			if(curr.data == curr.next.data)
				curr.next = curr.next.next;
			else
				curr = curr.next;
		}
		return head;
		
	}
	
	
	public static void main(String[] args) {
		Node head = new Node(11);
		head.next = new Node(33);
		head.next.next = new Node(33);
		head.next.next.next = new Node(44);
		head.next.next.next.next = new Node(88);
		head = insert_begin(head, 55);
		head = insert_end(head, 66);
		head = insert_pos(head, 77, 5);
		head = delete_begin(head);
		head = delete_end(head);
		head = delete_pos(head, 4);
		head = reverse(head);
		head = sort(head);
		head = RemoveDuplicate(head);
		print_recur(head);
		System.out.println("middle node of the this linkedlist : " + middlenode(head));
		nth_node_from_end(head, 2);
	}
}
