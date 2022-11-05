package polEx;

public class LinkedPol implements Pol
{
	private Node head;
	
	public LinkedPol()
	{
		head = null;
	}

	@Override
	public int getHighestDeg()
	{
		if (head == null)
			return 0;
		else
			return head.deg;
	}

	@Override
	public double getCoef(int d) //search
	{
		//line 2
		Node p = head;
		
		//line 3
		while(p != null && p.deg > d)
			//line 4
			p = p.next;
		
		//line 5
		if (p == null || p.deg != d)
			return 0;
		else
			//line 8
			return p.coef;
	}

	@Override
	public void set(int d, double c) //insert in order
	{
		//line 2
		if (head == null || head.deg < d)
		{
			Node tmp = new Node(d,c);
			//line 4
			tmp.next = head;
			
			//line 5
			head = tmp;
		}
		else
		{
			Node p = head;
			Node q = null;
			
			//line 9
			while(p != null && p.deg > d)
			{
				//line 10
				q = p;
				
				//line 11
				p = p.next;
			}
			
			//line 13
			if (p != null && p.deg == d)
			{
				//line 14
				return;
			}
			else
			{
				Node tmp = new Node(d,c);
				//line 17
				tmp.next = p;
				
				//line 18
				q.next = tmp;
			}	
		}
	}

	@Override
	public void remove(int d) //remove target
	{
		//line 2
		if (head != null && d == head.deg) //delete first node
		{
			//line 3
			head = head.next;
		}
		else
		{
			Node p = head.next;
			Node q = head;
			
			//line 7
			while(p != null && p.deg != d)
			{
				//line 8
				q = p;
				
				//line 9
				p = p.next;
			}

			//line 11
			if (p != null && p.deg == d)
			{
				//line 12
				q.next = p.next;
			}
		}
	}
}