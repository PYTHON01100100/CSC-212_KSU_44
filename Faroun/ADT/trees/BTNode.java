package trees;

public class BTNode<T> 
{
	public T data;
	public BTNode<T> left, right;

	public BTNode(T val)
	{
		data = val;
		left = right = null;
	}

	public BTNode(T val, BTNode<T> l, BTNode<T> r)
	{
		data = val;
		left = l;
		right = r;
	}
}