class node2 {
	int data;
	node2 next;
	node2 prev;
	node2(int x){
	data = x;
	next = null;
	prev = null;
	}
};


public class DDL {
	
	static node2 insertBegin(node2 head, int val) {
		node2 temp = new node2(val);
		temp.next = head;
		if(head != null) {
			head.prev = temp;
		}
		return temp;
	}
	
	public static void printList(node2 head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node2 head = new node2(10);
		head.next = new node2(20);
		head.next.next = new node2(30);
		head.next.next.next = new node2(11);
		DDL.insertBegin(head, 55);
		DDL.printList(head);
	}

}
