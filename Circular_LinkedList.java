class node1{
	int data;
	node1 next;
	node1(int x) {
		data = x;
		next = null;
	}
};

public class Circular_LinkedList {
	//Inert begin in the circular linked list...
	static node1 Insert_Begin(node1 head, int val) {
		node1 temp = new node1(val);
		if(head == null) {
			temp.next = temp;
			return temp;
			}
		else {
			temp.next = head.next;
			head.next = temp;
			int swap = head.data;
			head.data = temp.data;
			temp.data = swap;
		}
		return head;
	}
	
	//Delete head node of the circular linked list...
	static node1 Delete_head(node1 head) {
		if(head == null) {
			return null;
		}
		head.data = head.next.data;
		head.next = head.next.next;
		return head;
	}
	
	//print the elements of the Circular linked list...
	public static void PrintList(node1 head) {
		if(head != null) {
			System.out.print(head.data + " ");
			for(node1 ptr = head.next; ptr != head; ptr = ptr.next)
				System.out.print(ptr.data + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node1 head = new node1(10);
		node1 first = new node1(20);
		node1 second = new node1(30);
		node1 third = new node1(40);
		head.next = first;
		first.next = second;
		second.next = third;
		third.next = head;
		head = Insert_Begin(head, 50);
		Delete_head(head);
		PrintList(head);
	}

}
