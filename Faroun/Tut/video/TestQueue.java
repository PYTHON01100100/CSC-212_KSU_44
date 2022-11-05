package video;

public class TestQueue
{
	public static void main(String[] args)
	{
		String name = "AbdAlAzeez";
		Queue<Character> q = new LinkedQueue<Character>();

		for (int i = 0 ; i < name.length() ; i++)
			q.enqueue(name.charAt(i));

		simplePrintQueue(q);

		//reverseQueueRec(q);

		//System.out.println("After reverse");
		//simplePrintQueue(q);

		//printQueueReverseRec(q);
		//System.out.println(search(q, 'z'));
		
		//remove(q, 'A');
		removeAll(q, 'A');
		simplePrintQueue(q);
		//
		//simplePrintQueue(q);
	}

	public static <T> void simplePrintQueue(Queue<T> q1)
	{
		if (q1.length() == 0)
			System.out.println("Empty Queue");
		else
		{
			T x;

			for (int i = 0 ; i < q1.length() ; i++)
			{
				x = q1.serve();
				q1.enqueue(x);

				System.out.print(x + (i == q1.length()-1 ? "\n":", "));
			}
			
			System.out.println("---------------");
		}
	}

	public static <T> boolean search(Queue<T> q, T e)
	{
		boolean found = false;
		T x;
		
		for (int i = 0 ; i < q.length() ; i++)
		{
			x = q.serve();
			q.enqueue(x);

			if (x.equals(e))
				found = true;
		}

		return found;
	}

	public static <T> boolean remove(Queue<T> q,T e)
	{
		int l = q.length();
		boolean found = false;
		T x;

		for (int i = 0 ; i < l ; i++)
		{
			x = q.serve();
			
			if (x.equals(e) && found == false)
				found = true;
			else
				q.enqueue(x);
		}

		return found;
	}

	public static <T> boolean removeAll(Queue<T> q,T e)
	{
		int l = q.length();
		boolean found = false;
		T x;

		for (int i = 0 ; i < l ; i++)
		{
			x = q.serve();
			
			if (x.equals(e))
				found = true;
			else
				q.enqueue(x);
		}

		return found;
	}

	public  static <T> void printQueueRec(Queue<T> q)
	{
		printQueueRec(q,0);
	}

	private static <T> void printQueueRec(Queue<T> q,int i)
	{
		if (i != q.length())
		{
			T x = q.serve();
			q.enqueue(x);
			System.out.print(x + (i == q.length()-1 ? "\n":", "));

			printQueueRec(q, i+1);
		}
	}

	public static <T> void printQueueReverseRec(Queue<T> q)
	{
		printQueueReverseRec(q,0);
	}
	
	private static <T> void printQueueReverseRec(Queue<T> q,int i)
	{
		if (i != q.length())
		{
			T x = q.serve();
			q.enqueue(x);

			printQueueReverseRec(q, i+1);
			
			System.out.print(x + (i != 0 ? ", ":"\n"));
		}
	}
	
	public static <T> void reverseQueue(Queue<T> q)
	{
		Stack<T> st = new ArrayStack<T>(q.length());
		T x;
		int l = q.length();

		for (int i = 0 ; i < l ; i++)
		{
			x = q.serve();
			st.push(x);
		}

		while(! st.empty())
			q.enqueue(st.pop());
	}

	public static <T> void reverseQueueRec(Queue<T> q)
	{
		Stack<T> st = new ArrayStack<T>(q.length());
		reverseQueueRec(q, st);
	}

	private static <T> void reverseQueueRec(Queue<T> q,Stack<T> st)
	{
		if (q.length() != 0)
		{
			st.push(q.serve());
			reverseQueueRec(q,st);
			q.enqueue(st.pop());
		}
	}
}