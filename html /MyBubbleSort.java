public class MyBubbleSort {

	public static void main(String[] args) 
	{
		MyBubbleSort k=new MyBubbleSort();
		int array[]={5,6,4,1,7,3};
		k.bubble_sort(array);
System.out.println(array);
		

	}
public void bubble_sort(int array[])
{
	int n =array.length;
	
	for(int m=n;m>=0;m--)
	{
	for(int i=0;i<n-1;i++)
	{
		int k=1;
		if(array[i]>array[k++])
		{
			swapNumber(i,k,array);
		}
	
		}
	}
	}
public  array swapNumber(int i,int j, int[] array)
{
	int tmp;
	tmp=array[i];
	array[i]=array[j];
	array[j]=tmp;
	
}
}
