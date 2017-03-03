package Bridgeit.java.com;



public class BinarySearch {
	 
    public int binarySearch(int[] inputArr, int key) {
         
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
         
        BinarySearch mbs = new BinarySearch();
        
        int[] arr = {2, 4, 3, 8, 1, 7, 14, 9};
        MyBubbleSort s=new MyBubbleSort();
      arr=  s.bubblesort(arr);
        
        System.out.println("Key 8's position: "+mbs.binarySearch(arr, 8));
        int[] arr1 = {6,34,78,123,432,900};
        
    }
}