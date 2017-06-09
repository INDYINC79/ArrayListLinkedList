package myArrayList;

public class MyLinkedList {
	public Node head;

	public int size() {
		int n = 0;
		Node current = this.head;
		while (current != null) {
			n++;
			current = current.next;
		}
		return n;
	}
	
	public Object get(int idx) {
		if (idx < 0) {
			throw new IndexOutOfBoundsException();
		}
		int n = 0;
		Node current = this.head;
		while (current != null) {
			if (n == idx) {
				return current.val;
			}
			n++;
			current = current.next;
		}
		throw new IndexOutOfBoundsException();
	}
	
	public void set(int idx, Object o) {
		if (idx < 0) {
			throw new IndexOutOfBoundsException();
		}
		int n = 0;
		Node current = this.head;
		while (current != null) {
			if (n == idx) {
				current.val = o;
				return;
			}
			n++;
			current = current.next;
		}
		throw new IndexOutOfBoundsException();
	}
	
	public int append(Object o) {
		if (this.head == null) {
			this.head = new Node();
			this.head.val = o;
			return 1;
		}
		int n = 1;
		Node current = this.head;
		Node prev = null;
		while (current != null) {
			n++;
			prev = current;
			current = current.next;
		}
		prev.next = new Node();
		prev.next.val = o;
		return n;
	}
	
	public void insert(int idx, Object obj){
		
		Node insertNode = new Node();
		if (idx < 0 || idx > this.size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if(idx == 0){
			insertNode.val = obj;
			insertNode.next = this.head;
			this.head = insertNode;
		}
		
		Node current = this.head;
		Node prev = null;
		int counter = 0;
		
		if(idx == this.size()){
			this.append(obj);
		}else{
			while(counter <= idx){
				if(counter == idx){
					insertNode.next = current;
					insertNode.val = obj;
					prev.next = insertNode;
				}
				counter ++;
				prev = current;
				current = current.next;
			}
		}
	}
	
	public int remove(int idx){
		int counter = 0;
		
		while(counter <= idx){
			counter ++;
			
			Node current = this.head;
			Node prev = null;
			
			prev = current;
			current = current.next;
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		list.append("hi");
		list.append("yo");
		list.append("bye");
		list.append("here");
		list.set(0, "au revoir");
		System.out.println(list.head.val);
		list.insert(4, "First");
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
	}
}

class Node {
	public Object val;
	public Node next;
}