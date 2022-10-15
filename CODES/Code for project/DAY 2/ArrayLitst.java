
public class ArrayLitst<TWordInformation>{
	private WordInformation[] nodes;
	private int size, max, cur,m,k,NoOfW;
	public ArrayLitst(int n) {
		max=n;
		size=0;
		NoOfW=0;
		cur=-1;
		nodes=(WordInformation[])new Object[n];
	}
	public boolean empty() {return NoOfW==0;} 
	//public boolean full() {return NoOfW==max;} public boolean last() {return cur==size-1;}
	public void findFirst() {cur=0;} public void findNext() {cur=cur+1;} 	
	//public void update(WordInformation v) { nodes[cur]=v;}
	public WordInformation retrieve() {return nodes[cur];}
	public void insert2(WordInformation v) {
		if(v.word.length()<max)
		 nodes[v.word.length()]=v;
		NoOfW++;
		cur=v.word.length();
	}
	/*
	public void insert(WordInformation v) {
		for(int i=size-1;i>cur;i--)
			nodes[i+1]=nodes[i];
		nodes[++cur]=v;
		size++;
	}
	*/
	/*
	public void remove() {
		for(int i=cur+1;i<size;i++)
			nodes[i-1]=nodes[i];
		
		size--;
		if(size==0)
			cur=-1;
		else if(cur==size)
		cur=0;
		
	}
	*/
}
