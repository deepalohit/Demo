package array;

public class BubbleSort {
	static  void bubbleSort() {
		  int arr[] ={3,6,35,2,45,5};  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  

	    }  
	public static void main(String[] args) {
         bubbleSort();//sorting array elements using bubble sort           
         //System.out.println("Array After Bubble Sort");  
         
 }  

	}


