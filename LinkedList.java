public class LinkedList {
	
	static class Node{
		public int data;
		public Node next = null;}
	
	
	 static public Node create(int p) {
		Node x = new Node();
		x.data = p;
		return x;
	}
	
	static void add(Node head,int data) {
		Node p = create(data);
		Node q = head;
		while(q.next!= null) q = q.next;
		q.next = p;
	}
	
	static void delete(Node head,int position) {
		Node q = head;
		for(int i = 1;i<position-1;i++) q = q.next;
		q.next = q.next.next;
		
	}
	static void display(Node head) {
		Node q = head;
		while(q!=null) {
			System.out.println(q.data);
			q = q.next;};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node();
		head = create(60);
		add(head,25);
		add(head,30);
		add(head,60);
		add(head,70);
		add(head,90);
		display(head);
		delete(head,2);
		display(head);
		
		
	}

}
