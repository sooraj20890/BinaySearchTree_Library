
public class myBST {
	private Node root;
	private Node head;
	private Node temp1;
	private boolean isThere=Boolean.FALSE;
    public void mainAdd(int a)
    {
    	if(head != null && root !=null)
    	{
    		root=head;
    	}
    	myAdd(a);
    	
    }
	public void myAdd(int a)
	{
		if(root==null)
		{
			root=new Node();
			root.setData(a);
			System.out.println("root is: "+root.getData());
			root.setlLink(null);
			root.setrLink(null);
			head=root;//this line makes head point to the location of root so if you change root after this point head will keep recording the changes
		}
		else
		{
			if(root.getData()>a)
			{
				if(root.getlLink()==null)
				{
					temp1=new Node();
					temp1.setData(a);
					temp1.setlLink(null);
					temp1.setrLink(null);
					System.out.println("left child of root:"+root.getData() + "is:" + temp1.getData() );
					root.setlLink(temp1);
					
				}
				else
				{
					root=root.getlLink();
					myAdd(a);
				}
			}
			if(root.getData()<a)
			{
				if(root.getrLink()==null)
				{
					temp1=new Node();
					temp1.setData(a);
					temp1.setlLink(null);
					temp1.setrLink(null);
					System.out.println("right child of root:"+root.getData() + "is:" + temp1.getData() );
					root.setrLink(temp1);
					
				}
				else
				{
					root=root.getrLink();
					myAdd(a);
				}
			}
		}
	}
	 public boolean mainSearch(int a)
	    {
	    	if(head != null && root !=null)
	    	{
	    		root=head;
	    	}
	    	mySearch(a);
	    	return isThere;
	    }
	public void mySearch(int a)
	{
		if (root==null) {
			isThere = false;
		}
		else {
			if (root.getData()>a) {
				if(root.getlLink()==null)
				{
					isThere = false;
				}
				else
				{
					root=root.getlLink();
					mySearch(a);
				}
			}
			else if(root.getData()==a)
			{
				isThere = true;
			}
			if (root.getData()<a) {
				if(root.getrLink()==null)
				{
					isThere = false;
				}
				else
				{
					root=root.getrLink();
					mySearch(a);
				}
			}
		}
		
		
	}
    
	public int mainHeight()
	{
		Node tempNode=head;
		return myHeight(tempNode);
	}
	public int myHeight(Node aNode)
    {
    	if (aNode==null) {
			return 0;
		}
    	else if( (aNode.getlLink()!=null && aNode.getrLink()==null)||
    			(aNode.getlLink()==null && aNode.getrLink()!=null)||
    			(aNode.getlLink()!=null && aNode.getrLink()!=null))
    	{
    		int i=myHeight(aNode.getlLink());
    		int j=myHeight(aNode.getrLink());
    		
    		return Math.max(i, j)+1;
    	}
    	else
    	{
    		return 0;
    	}
    }
	public int mainDiameter()
	{
		Node tempNode1=head;
		return myDiameter(tempNode1);
	}
	public int myDiameter(Node aNode)
	{
		if(aNode==null)
		{
			return 0;
		}
		else if( (aNode.getlLink()!=null&& aNode.getrLink()==null)|| (aNode.getlLink()==null&& aNode.getrLink()!=null))
		{
			int k=myHeight(aNode.getlLink());
			int l=myHeight(aNode.getrLink());
			return k+l+1; 
		}
		else if( (aNode.getlLink()!=null&& aNode.getrLink()!=null))
		{
			int k=myHeight(aNode.getlLink());
			int l=myHeight(aNode.getrLink());
			return k+l+2; 
		}
		else
		{
			return 0;
		}
	}
}
