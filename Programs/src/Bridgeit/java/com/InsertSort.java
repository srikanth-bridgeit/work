package Bridgeit.java.com;

public class InsertSort {

	public static void main(String[] args)
	{
		int[] array={5,2,6,8,7,1};
        int[]array1=sort(array);
        for(int x=0;x<array1.length;x++)
		{
			
		
		System.out.println(array1[x]);
		}
        
	}
	public static int[] sort(int[] array)
	{
		int temp;
		for(int i=1;i<array.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(array[j]<array[j-1]){
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			
			}
			
		}return array;
	}

}
