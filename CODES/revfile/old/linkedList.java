public class linkedList<T> {
	private Node<T> head,current;
	public linkedList() {head=current=null;}
	public boolean empty() {return head==null;} public boolean full() {return false;} public boolean last() {return current.next==null;}
	public void findFirst() {current=head;} public void update(T v) { current.data=v;} public void findNext() {current=current.next;}
	public T retrieve() {return current.data;}
	public void insert(T v) {
		if(head==null)
			head=current=new Node<T>(v);
		else {
		Node<T> t;
		t=current.next;
		current.next=new Node<T>(v);
		current=current.next;
		current.next=t;
		}
	}
	public void remove() {
		if(head.next==null) {
			head=current=null;
		}
		head=current=head.next;
	}
	public void display() {
		findFirst();
		while(!last()) {
			System.out.println(retrieve());
			current=current.next;
	}
		System.out.println(retrieve());
		findFirst();		
	}
	public void displayTheCurrent() {
		System.out.println(retrieve());
	}


}
