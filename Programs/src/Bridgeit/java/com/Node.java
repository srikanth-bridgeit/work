package Bridgeit.java.com;

public class Node 
{
public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNextRef() {
		return nextRef;
	}
	public void setNextRef(Node refNode) {
		this.nextRef = refNode;
	}
private int value;
private Node nextRef;
	public int compareTo(int arg) 
	{
		// TODO Auto-generated method stub
		if(arg == this.value)
		{
			return 0;
		}
		else
		{
			return 1;
		}
		
	}

}
