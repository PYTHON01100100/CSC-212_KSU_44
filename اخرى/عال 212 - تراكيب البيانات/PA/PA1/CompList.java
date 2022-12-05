
public interface CompList<T extends Comparable<T>> {
	public boolean empty();

	public boolean full();

	public void findFirst();

	public void findNext();

	public void findPrevious();
	
	public boolean last();
	
	public boolean first();

	public T retrieve();

	public void update(T e);

	public void insert(T e);

	public void remove();
    
	public int compareToPrevious();
	
	public void swap();
	

}
