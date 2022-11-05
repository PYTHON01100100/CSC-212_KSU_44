package comparetoEx;

public class MyLinkedList<T extends Comparable<T>>
{
	Node<T> head;
	
	public MyLinkedList()
	{
		head = null;
	}

	public void addLast(T data)
	{
		if (head == null)
			head = new Node<T>(data);
		else
		{
			Node<T> save = head;
			
			while(save.getNext() != null)
				save = save.getNext();
			
			save.setNext(new Node<T>(data));
		}
	}
	
	public void printList()
	{
		Node<T> save = head;
		
		while(save != null)
		{
			System.out.println(save.getData());
			save = save.getNext();
		}
	}
	
	public int countMore(double g)
	{
		Node<T> save = head;
		int n;
		int count = 0;
		
		while(save != null)
		{
			n = save.getData().compareTo((T) new Student(0, g, ""));
			
			if (n > 0)
				count++;
			
			save = save.getNext();
		}
		
		return count;
	}
}