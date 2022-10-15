
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
	/*
	public void removeOddElems() {
	if(head==null) return;
	Node<T> p=head;
	while(p!=null) {
		p.next=p.next.next; p=p.next;
	
	}
	}
	public <T> void insertAll(linkedList<T> l1, linkedList<T> l2, int i) {
		int x=0;
		l1.findFirst();
		l2.findFirst();
		while(x!=1) {l1.findNext(); x++;}
		Node<T> t=l1.current.next;
		l1.current.next=null;
		while(!l2.empty()) {
		T e=l2.retrieve();
		remove();
		l1.insert(e);
		}
		l1.current.next=t;
	}
	public T mostFrequentElement () {
		T mfe = null ;
		int max = 0;
		Node <T > p = head ;
		while (p!= null ) {
		Node <T > q = p ;
		int count = 0;
		while ( q != null ) {
		if (q.data.equals ( p.data) )
		count ++;
		q = q.next ;
		}
		if ( count > max ) {
		max = count ;
		mfe = p . data ;
		}
		p = p . next ;
		}
		return mfe ;
		}
	*/
	/*
 Operations: We assume all operations operate on a list L.
1. Method findFirst ( )
requires: list L is not empty. input: none
results: first element set as the current element. output: none.
2. Method findNext ( )
requires: list L is not empty. Current is not last. input: none
results: element following the current element is made the current element.
output: none.
3. Method retrieve (Type e)
requires: list L is not empty. input: none
results: current element is copied into e. output: element e.
4. Method update (Type e).
requires: list L is not empty. input: e.
results: the element e is copied into the current node.
output: none.
5. Method insert (Type e).
requires: list L is not full. input: e.
results: a new node containing element e is created and inserted after the current element
in the list. The new element e is made the current element. If the list is empty e is also
made the head element.
output: none.
6. Method remove ( )
requires: list L is not empty. input: none
results: the current element is removed from the list. If the resulting list is empty current is
set to NULL. If successor of the deleted element exists it is made the new current element
otherwise first element is made the new current element.
output: none.
7. Method full (boolean flag)
input: none.
returns: if the number of elements in L has reached the maximum number allowed then
flag is set to true otherwise false.
output: flag.
8. Method empty (boolean flag).
input: none.
results: if the number of elements in L is zero, then flag is set to true
otherwise false.
Output: flag.
9. Method last (boolean flag).
input: none. requires: L is not empty.
Results: if the last element is the current element then flag is set to true
otherwise false.
Output: flag

	 
	 */
}
