package Bridgeit.java.com;

public class OrderedList {

	private Node head;
	private Node tail;
	public void add(int value)
	{
		Node nd =new Node();
		 nd.setValue(value);
		 if(head==null)
		 {
			 head=nd;
			 tail=nd;
		 }
		 else{
			 tail.setNextRef(nd);
			 tail=nd;
		 }
	}
	public void remove(int value)
	{
		Node tmp=head;
		Node refNode=null;
		System.out.println("......Transversing.....");
		while(true)
		{
			if(tmp==null)
			{
				break;
			}
			if(tmp.compareTo(value)==0)
			{
				refNode=tmp;
				break;
			}
			tmp=tmp.getNextRef();
		}
		if(refNode !=null)
		{
			tmp=refNode.getNextRef();
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

