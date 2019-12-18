package linkedlist;

public class LinkedList {
	Node head;
	public void adding(int data) {
		Node node = new Node();
		// data is coming from user
		node.data = data;
		node.address = null;
		// if head is pointing to null
		if (head == null) {
			head = node;
		} else {
			// creating temp node
			Node temp = head;
			while (temp.address != null) {
				temp = temp.address;
			}
			temp.address = node;
		}
	}
	public void insertAtStart(int data) {
		Node node = new Node();		
		node.data = data;
		node.address = null;
		node.address=head;
		head=node;		
	}
	public void insertAt(int index,int data) {
		Node node = new Node();		
		node.data = data;
		node.address = null;
		if(index==0)
		{
			insertAtStart(data);
		}		
		Node n=head;
		for (int i = 0; i < index-1; i++) {
			n=n.address;
		}
		node.address=n.address;
		n.address=node;		
	}
	public void deleteAt(int index) {
		if(index ==0)
		{
			head=head.address;
		}
		else {
			Node n=head;
			Node n1=null;
			for (int i = 0; i < index-1; i++) {
				n=n.address;
			}
			n1=n.address;
			n.address=n1.address;
			n1=null;
		}
	} 
	public void show() {
		Node node = head;
		while (node.address != null) {
			System.out.println(node.data);
			node = node.address;
		}
		System.out.println(node.data);
	}
}
