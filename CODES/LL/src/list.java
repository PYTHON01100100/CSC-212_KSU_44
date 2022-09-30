
public interface list<T> {
	public void update(T v); public void insert(T v); public void findFirst(); public void findNext();	public void remove();
	public T retrieve();
	public boolean empty(); public boolean full(); public boolean last();
}
