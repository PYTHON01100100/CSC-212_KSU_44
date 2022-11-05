package video;

public class TestStack
{
	public static void main(String[] args)
	{
		Stack<Integer> st = new LinkedStack<Integer>();
		
		for (int i = 1 ; i <= 8 ; i++)
			st.push(i);
		
		simplePrintStack(st);
		
		/*
		int n = 8;
		st.push(8);
		st.push(1);
		st.push(8);
		st.push(3);
		st.push(8);
		simplePrintStack(st);
		System.out.println(removeAll(st, n) ? n + " Deleted" : n + " Not found");
		printStackRec(st);
		simplePrintStack(st);
		*/

		//printStackReverseRec(st);
		//reverseStack(st);
		reverseStackRec(st);
		System.out.println("After Stack");
		simplePrintStack(st);
	}

	public static <T> void simplePrintStack(Stack<T> st)
	{
		if (st.empty())
			System.out.println("Empty Stack");
		else
		{
			T x;
			Stack<T> tmp = new LinkedStack<T>();

			while (!st.empty())
			{
				x = st.pop();
				tmp.push(x);

				System.out.print(x + (st.empty() ? "\n" : ", "));
			}

			System.out.println("---------------");
		
			while (! tmp.empty())
				st.push(tmp.pop());
		}
	}

	public static <T> boolean search(Stack<T> st, T e)
	{
		boolean found = false;
		T x;
		Stack<T> tmp = new LinkedStack<T>();

		while(! st.empty())
		{
			x = st.pop();
			tmp.push(x);

			if (x.equals(e))
				found = true;
		}

		while (! tmp.empty())
			st.push(tmp.pop());

		return found;
	}

	public static <T> boolean remove(Stack<T> st, T e)
	{
		boolean found = false;
		T x;
		Stack<T> tmp = new LinkedStack<T>();
		
		while(! st.empty() && ! found)
		{
			x = st.pop();

			if (x.equals(e))
				found = true;
			else
				tmp.push(x);
		}

		while (! tmp.empty())
			st.push(tmp.pop());

		return found;
	}

	public static <T> boolean removeAll(Stack<T> st, T e)
	{
		boolean found = false;
		T x;
		Stack<T> tmp = new LinkedStack<>();
		
		while(! st.empty())
		{
			x = st.pop();

			if (x.equals(e))
				found = true;
			else
				tmp.push(x);

		}

		while (! tmp.empty())
			st.push(tmp.pop());

		return found;
	}

	public static <T> int removeAllCount(Stack<T> st, T e)
	{
		int count = 0;
		T x;
		Stack<T> tmp = new LinkedStack<>();
		
		while(! st.empty())
		{
			x = st.pop();

			if (x.equals(e))
				count++;
			else
				tmp.push(x);

		}

		while (! tmp.empty())
			st.push(tmp.pop());

		return count;
	}


	public static <T> void printStackRec(Stack<T> st)
	{
		if (! st.empty())
		{
			T x = st.pop();
			System.out.print(x + (st.empty() ? "\n" : ", "));

			printStackRec(st);

			st.push(x);
		}
	}

	public static <T> void printStackReverseRec(Stack<T> st)
	{
		Stack<T> tmp = new LinkedStack<T>();
		printStackReverseRec(st,tmp);
	}

	private static <T> void printStackReverseRec(Stack<T> st, Stack<T> tmp)
	{
		if (! st.empty())
		{
			T x = st.pop();
			tmp.push(x);

			printStackReverseRec(st,tmp);

			st.push(tmp.pop());
			System.out.print(x + (! tmp.empty() ? ", " : "\n"));
		}
	}

	public static <T> void reverseStack(Stack<T> st)
	{
		Stack<T> tmp1 = new LinkedStack<T>();
		Stack<T> tmp2 = new LinkedStack<T>();

		while(! st.empty())
			tmp1.push(st.pop());

		while(! tmp1.empty())
			tmp2.push(tmp1.pop());

		while(! tmp2.empty())
			st.push(tmp2.pop());
	}

	public static <T> void reverseStackRec(Stack<T> st)
	{
		Queue<T> tmp = new LinkedQueue<T>();
		reverseStackRec(st, tmp);
	}

	private static <T> void reverseStackRec(Stack<T> st, Queue<T> tmp)
	{
		T x;
		
		if (! st.empty())
		{
			x = st.pop();
			tmp.enqueue(x);
			
			reverseStackRec(st,tmp);
			
			st.push(tmp.serve());
		}
	}
}