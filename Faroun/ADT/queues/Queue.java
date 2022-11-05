package queues;

public interface Queue<T>
{
	public T serve();
	public void enqueue(T e);
	public int length();
	public boolean full();
}