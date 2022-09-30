package lists;

public class TestList
{
	public static void main(String[] args)
	{
		LinkedList<String> l = new LinkedList<String>();
		l.insert("A"); 	l.insert("B");
		l.findFirst();

		String str1 = l.retrieve();
		l.insert(str1);
		l.findFirst();
		l.insert("C");	l.insert("D");
		l.findFirst();
		l.insert("E");
		l.findNext();
		l.remove();
		l.findFirst();
		
		while(! l.last()) 
		{
			String str2 = l.retrieve();
			l.update(str1);
			str1 = str2;
			l.findNext();
		}
		
		l.findFirst();
		l.insert(l.retrieve());
		l.findFirst();
		l.update("C");
		printList(l);
	}
	
	public static <T> void printList(LinkedList<T> l1)
	{
		l1.findFirst();

		while(! l1.last())
		{
			System.out.println(l1.retrieve());
			l1.findNext();
		}

		System.out.println(l1.retrieve());
	}
}