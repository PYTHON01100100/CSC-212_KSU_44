package polEx;

public class Node
{
	public int deg;
	public double coef;
	public Node next;
	
	public Node(int deg,double coef)
	{
		this.deg = deg;
		this.coef = coef;
		next = null;
	}
}
