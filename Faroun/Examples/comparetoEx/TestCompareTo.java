package comparetoEx;

public class TestCompareTo
{
	public static void main(String[] args)
	{
		MyLinkedList<Student> l1 = new MyLinkedList<Student>();
	
		l1.addLast(new Student(1, 5, "A"));
		l1.addLast(new Student(2, 4, "B"));
		l1.addLast(new Student(3, 3, "C"));
		l1.addLast(new Student(4, 2, "D"));
		l1.addLast(new Student(5, 1, "E"));

		l1.printList();
		
		System.out.println(l1.countMore(3));
	}
}