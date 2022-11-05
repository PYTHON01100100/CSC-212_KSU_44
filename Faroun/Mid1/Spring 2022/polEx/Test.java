package polEx;

public class Test
{
	public static void main(String[] args)
	{
		LinkedPol p = new LinkedPol();
		p.set(4,0);
		p.set(0,-1);
		p.set(2,3);
		p.set(1,4);
		p.set(5,2);
		
		p.remove(2);
		
		for (int d = p.getHighestDeg() ; d >= 0 ; d--)
			System.out.print(d + " : " + p.getCoef(d) + ", ");
	}
}