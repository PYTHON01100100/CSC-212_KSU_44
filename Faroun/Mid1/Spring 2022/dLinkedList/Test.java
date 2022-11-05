package dLinkedList;

public class Test
{

	public static void main(String[] args)
	{
		DoubleLinkedList<Character> l1 = new DoubleLinkedList<Character>();
		DoubleLinkedList<Character> l2 = new DoubleLinkedList<Character>();
		
		for (char i = 'A' ; i <= 'D' ; i++)
			l1.insert(i);

		for (char i = 'E' ; i <= 'H' ; i++)
			l2.insert(i);

		printList(l1);
		printList(l2);
		DoubleLinkedList<Character> l3 = concat(l1, l2, 3);
		
		printList(l3);
		
	}

	public static <T> DoubleLinkedList<T> concat(DoubleLinkedList<T> l1,DoubleLinkedList<T> l2, int k)
	{
		DoubleLinkedList<T> l3 = new DoubleLinkedList<T>();
		
		//line 2
		l1.findFirst();
		
		//line 3
		for (int i = 0 ; i < k; i++)
		{
			//line 4
			l3.insert(l1.retrieve());
			
			//line 5
			l1.findNext();
		}

		//line 6
		while(! l2.last())
			//line 7
			l2.findNext();
		
		//line 8
		for (int i = 0 ; i < k; i++)
		{
			//line 9
			l3.insert(l2.retrieve());
			
			//line 10
			l2.findPrevious();
		}
		
		//line 11
		return l3;
	}
	
	public static <T> void printList(DoubleLinkedList<T> l1)
	{
		l1.findFirst();

		while(! l1.last())
		{
			System.out.print(l1.retrieve() + " ");
			l1.findNext();
		}

		System.out.println(l1.retrieve());
	}
}
