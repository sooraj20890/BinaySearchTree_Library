
public class Main {

	public static void main(String[] args) {
		myBST aBST=new myBST();
		aBST.mainAdd(10);
		aBST.mainAdd(9);
		aBST.mainAdd(8);
		aBST.mainAdd(15);
		aBST.mainAdd(7);
		aBST.mainAdd(12);
		aBST.mainAdd(17);
		aBST.mainAdd(11);
		aBST.mainAdd(14);
		aBST.mainAdd(13);
		aBST.mainAdd(18);
		aBST.mainAdd(19);
		aBST.mainAdd(20);
		if(aBST.mainSearch(117))
		{
			System.out.println("is there");
		}
		else
		{
			System.out.println("not there");
		}
		System.out.println("height of graph: " + aBST.mainHeight());
		System.out.println("diameter of graph: " +aBST.mainDiameter());
	}

}
