
public class ArrayLitst<T> implements list<T> {
	private T[] nodes;
	private int size, max, cur;
	public ArrayLitst(int n) {
		max=n;
		size=0;
		cur=-1;
		nodes=(T[])new Object[n];
	}
	public boolean empty() {return size==0;} public boolean full() {return size==max;} public boolean last() {return cur==size-1;}
	public void findFirst() {cur=0;} public void findNext() {cur=cur+1;} 	public void update(T v) { nodes[cur]=v;}
	public T retrieve() {return nodes[cur];}
	public void insert2(T v) {
		if(full())
			return;
		 nodes[++cur]=v;
		 size++;
	}
	public void insert(T v) {
		for(int i=size-1;i>cur;i--)
			nodes[i+1]=nodes[i];
		nodes[++cur]=v;
		size++;
	}
	public void remove() {
		for(int i=cur+1;i<size;i++)
			nodes[i-1]=nodes[i];
		
		size--;
		if(size==0)
			cur=-1;
		else if(cur==size)
		cur=0;
		
	}
}
