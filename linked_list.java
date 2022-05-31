class node{
	int data;
	node next;
	node(int x) {
		data = x;
		next = null;
	}
};


public class linked_list {
	public static void main(String[] args) {
		node head = new node(10);
		head.next = new node(20);
		head.next.next = new node(30);
		head.next.next.next = new node(11);
		head = insertBegin(head, 22);
		head = insertBegin(head, 22);
		head = insertBegin(head, 22);
		head = insertEnd(head, 55);
		head = insertEnd(head, 66);
		// = deleteFirstNode(head);
		//head = deleteLastNode(head);
		//head = insertAtPos(head, 3, 67);
		//head = DeleteAtPos(head, 4);
		RemoveDuplicate(head);
		printMiddle(head);
		print_Nth_from_end(head, 3);
		printRecursive(head);		
	}
	
	//traversing the list iteratively...
	public static void printList(node head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
	//traversing the recursively...
	public static void printRecursive(node head) {
		while(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printRecursive(head.next);
	}
	
	 //insertion of node in beginning...
	static node insertBegin(node head, int x) {
		node curr = new node(x);
		if(head == null) {
			return curr;
		}
		curr.next = head;
		return curr;
	}
	
		//insertion a node in a given postion...
		static node insertAtPos(node head,int pos, int val) {
			node temp = new node(val);
			node curr = head;
			pos--;
			while(pos != 1) {
				curr = curr.next;
				pos--;
			}
			temp.next = curr.next;
			curr.next = temp;
			return head;
		}
	
	//insertion of node at the end of the list...
	static node insertEnd(node head, int x) {
		node value = new node(x);
		node curr = head;
		if(head == null) {
			return value;
		}
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = value;
		return head;
	}
	
	//print mid-Node of the list...
	public static void printMiddle(node head) {
		if(head == null) {
			return;
		}
		node first = head, second = head;
		while(first != null && first.next != null) {
			second = second.next;
			first = first.next.next;
		}
		System.out.println("the middle node of this list is : "+ second.data);
	}
	
	//print Nth node from end....
	static void print_Nth_from_end(node head, int pos) {
		if(head == null) {
			return;
		}
		node first = head.next, second = head;
		for(int i = 0; i < pos-1; i++) {
			first = first.next;
		}
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		System.out.println("Nth node from end is : "+ second.data);
	}
	
	//Remove the duplicate int the list...
	public static void RemoveDuplicate(node head) {
		node curr = head;
		while(curr != null && curr.next != null) {
			if(curr.data == curr.next.data) {
				//node temp = curr.next;
				curr.next = curr.next.next;
			}
			else
				curr = curr.next;
		}
	}
	
	//deletion of node in the beginnig of list...
	static node deleteFirstNode(node head) {
		if(head == null) {
			return null;
		}
		head = head.next;
		return head;
	}
	
	//deletion of last node of the list...
	static node deleteLastNode(node head) {
		if(head == null || head.next == null) {
			return null;
		}
		node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}
	
	//deletion of node of given postion....
	static node DeleteAtPos(node head, int pos) {
		if(head == null){
			return null;
		}
		node temp = head;
		pos--;
		while(pos != 1) {
			temp = temp.next;
			pos--;
		}
		temp.next = temp.next.next;
		return head;
	}
	
	//reverse the list...
	public static void ReverseList(node head) {
		
	}
	
}
