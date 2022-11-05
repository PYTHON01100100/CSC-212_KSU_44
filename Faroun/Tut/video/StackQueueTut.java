package video;

import java.util.Random;

public class StackQueueTut
{
	public static void main(String[] args)
	{
		/*
		Queue<Character> q = new LinkedQueue<Character>();
		Queue<Character> oq = new LinkedQueue<Character>();
		Queue<Character> eq = new LinkedQueue<Character>();
		
		for (char i = 'A' ; i <= 'E' ; i++)
			q.enqueue(i);

		split(q, oq, eq);
		simplePrintQueue(q);
		simplePrintQueue(oq);
		simplePrintQueue(eq);
		 */
		
		Stack<Integer> st = new LinkedStack<Integer>();
		Random r = new Random();
		
		for(int i = 1; i <= 10 ; i++)
			st.push(r.nextInt(5));
	
		simplePrintStack(st);
		System.out.println(search(st, 2));
		simplePrintStack(st);
	}

	public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
	{
		split(q, oq, eq,1);
	}
	
	private static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq, int i)
	{
		T x;
		
		if (i <= q.length())
		{
			x = q.serve();

			if (i % 2 == 0) //even
				eq.enqueue(x);
			else //Odd
				oq.enqueue(x);

			q.enqueue(x);
	
			split(q, oq, eq,i+1);
		}
	}
	
	public static <T> void remove(LinkedPQ<T> pq, int p)
	{
		PQElement<T> x;
		LinkedPQ<T> tempQ = new LinkedPQ<T>();

		int l = pq.length();
		
		for (int i = 0 ; i < l ; i++)
		{
			x = pq.serve();
			
			if (x.p >= p)
				tempQ.enqueue(x.data, x.p);
		}

		while(tempQ.length() != 0)
		{
			x = tempQ.serve();
			pq.enqueue(x.data,x.p);
		}
	}
	
	public static <T> boolean search(Stack<T> st, T e)
	{
		if (! st.empty())
		{
			T x = st.pop();
			boolean flag;

			if (e.equals(x))
				flag = true;
			else
				flag = search(st, e);
			
			st.push(x);

			return flag;
		}
		else
			return false;
	}
	
	//////////////////////////////
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
	
	public static <T> void simplePrintStack(Stack<T> st)
	{
		if (st.empty())
			System.out.println("Empty Stack");
		else
		{
			T x;

			Stack<T> tmp = new LinkedStack<T>();
			
			while(! st.empty())
			{
				x = st.pop();
				tmp.push(x);

				System.out.print(x + (st.empty() ? "\n":", "));
			}
			
			System.out.println("---------------");
			
			while(! tmp.empty())
				st.push(tmp.pop());
		}
	}
}
