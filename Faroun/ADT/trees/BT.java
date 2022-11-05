package trees;

public class BT<T>
{
	private BTNode<T> root, current;
	
	public BT()
	{
		root = current = null;
	}
	
	public boolean empty()
	{
		return root == null;
	}
	
	public T retrieve() 
	{
		return current.data;
	}
	
	public void update(T val)
	{
		current.data = val;
	}

	public void traverse(Order ord)
	{
		switch(ord)
		{
			case preOrder 	: 	preOrder(root);
								break;
								
			case inOrder 	:	inOrder(root);
								break;
								
			case postOrder 	:	postOrder(root);
		}
	}

	private void preOrder(BTNode<T> p)
	{
		if (p != null)
		{
			preOrder(p.left);
			System.out.println(p.data);
			preOrder(p.right);
		}
	}

	private void inOrder(BTNode<T> p)
	{
		if (p != null)
		{
			inOrder(p.left);
			System.out.println(p.data);
			inOrder(p.right);
		}
	}

	private void postOrder(BTNode<T> p)
	{
		if (p != null)
		{
			postOrder(p.left);
			System.out.println(p.data);
			postOrder(p.right);
		}
	}

	public boolean insert(Relative rel, T val) 
	{
		switch(rel) 
		{
		   case Root:		if(!empty()) 
			   					return false;
							current = root = new BTNode<T>(val);
							return true;
						
		   case Parent:		return false;
		   
		   case LeftChild:	if(current.left != null) 
			   					return false;
							current.left = new BTNode<T>(val);
							current = current.left;
							return true;
							
		   case RightChild:	if(current.right != null) 
			   					return false;
							current.right = new BTNode<T> (val);
							current = current.right;
							return true;
							
		   default:			return false;
		}
	}
	
	public void deleteSubtree()
	{
		if(current == root)
		{
			current = root = null;
		}
		else 
		{
			BTNode<T> p = current;
			
			find(Relative.Parent);
		
			if(current.left == p)
				current.left = null;
			else 
				current.right = null;

			current = root;
		}
	}

	public boolean find(Relative rel)
	{
		switch (rel)
		{
			case Root:			current = root;
								return true;
		   
			case Parent:		if(current == root) 
									return false;
								current = findParent(current, root);
								return true;
		   
			case LeftChild:		if(current.left == null) 
									return false;
				
								current = current.left;
								return true;
			   
			case RightChild:	if(current.right == null) 
									return false;
								current = current.right;
								return true;
		   
			default:			return false;
		}
	}
	
	private BTNode<T> findParent(BTNode<T> p, BTNode<T> t)
	{
		LinkedStack<BTNode<T>> stack = new LinkedStack<BTNode<T>>();
		BTNode<T> q = t;

		while(q.right != p && q.left != p) 
		{
			if(q.right != null)
				stack.push(q.right);
			
			if(q.left != null)
				q = q.left;
			else
				q = stack.pop();
		}

		return q;
	}
	
	private BTNode<T> findParentRec(BTNode<T> p, BTNode<T> t)
	{
		if(t == null)
			return null;

		if(t.right == null && t.left == null)
			return null;
		else if(t.right == p || t.left == p)
			return t;	// parent is t
		else
		{
			BTNode<T> q = findParentRec(p, t.left);
		
			if (q != null)
				return q;
			else
				return findParentRec(p, t.right);
		}
	}
	
	public int size()
	{
		return size(root);
	}
	
	private int size(BTNode<T> b)
	{
		if (b == null)
			return 0;
		else
			return 1 + size(b.left) + size(b.right);
	}
	
	public int countLeafs()
	{
		return countLeafs(root);
	}
	
	private int countLeafs(BTNode<T> b)
	{
		if (b == null)
			return 0;
		//else if (b.left == null && b.right == null)
		else if(isLeaf(b))
			return 1;
		else
			return countLeafs(b.left) + countLeafs(b.right);	
	}

	public int countSemiLeafs()
	{
		return countSemiLeafs(root);
	}
	
	private int countSemiLeafs(BTNode<T> b) //One child only
	{
		if (b == null)
			return 0;
		else if (b.left == null && b.right != null)
			return 1 + countSemiLeafs(b.right);
		else if (b.left != null && b.right == null)
			return 1 + countSemiLeafs(b.left);
		else
			return countLeafs(b.left) + countLeafs(b.right);	
	}

	public int countParent()
	{
		return countParent(root);
	}
	
	private int countParent(BTNode<T> b)
	{
		if (b == null)
			return 0;
		else if (b.left != null || b.right != null)
			return 1 + countParent(b.left) + countParent(b.right);
		else
			return countParent(b.left) + countParent(b.right);
	}

	private boolean isLeaf(BTNode<T> b)
	{
		if (b.left == null && b.right == null)
			return true;
		else
			return false;
	}	
}