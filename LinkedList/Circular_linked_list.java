package LinkedList;

class Node {
	int data;
	Node next;
	Node(int x) {
		data = x;
		next = null;
	}
};

public class Circular_linked_list {
	
	//print the circulat linkedlist.
	public static void print(Node head) {
		System.out.print(head.data + " \t");
		for(Node ptr = head.next; ptr != head; ptr = ptr.next) {
			System.out.print(ptr.data + "\t");
		}
	}
	
	//insert in the begin of the Cir linkedlist.
	static Node insert_begin(Node head, int val) {
		Node temp = new Node(val);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		else {
			temp.next = head.next;
			head.next = temp;
			int x = temp.data;
			temp.data = head.data;
			head.data = x;
			
		}
		return head;
	}
	
	//insert in the end of the cir linkedlist.
	static Node insert_end(Node head, int val) {
		Node temp = new Node(val);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		Node curr = head;
		while(curr.next != head) {
			curr = curr.next;
		}
		temp.next = head;
		curr.next = temp;
		return head;
	}
	
	//insert in the given position of the cir linkedlist.
	static Node insert_pos(Node head, int pos, int val) {
		Node temp = new Node(val);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		Node curr = head;
		for(int i = 0; i < pos-2; i++)
			curr = curr.next;
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}
	
	//delete first node in the cir linkedlist.
	static Node delete_begin(Node head) {
		if(head == null)
			return null;
		else if(head.next == null)
			return null;
		else
			head.data = head.next.data;
			head.next = head.next.next;
			return head;
	}
	
	//delete last node in the cir linkedlist.
	static Node delete_end(Node head) {
		if(head == null)
			return null;
		else if(head.next == null)
			return  null;
		else {
			Node curr = head;
			while(curr.next.next != head)
				curr = curr.next;
			curr.next = head;
			return head;
		}
	}
	
	//delete node of the given position in cir linkedlist.
	static Node delete_pos(Node head, int pos) {
		if(head == null)
			return null;
		else if(head.next == null)
			return null;
		else {
			Node curr = head;
			for(int i = 0; i < pos-2; i++)
				curr = curr.next;
			curr.next = curr.next.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = head;
		head = insert_begin(head, 11);
		head = insert_end(head, 44);
		head = insert_pos(head, 4, 22);
		head = delete_begin(head);
		head = delete_end(head);
		head = delete_pos(head, 3);
		print(head);
	}

}
