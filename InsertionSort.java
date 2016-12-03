public class InsertionSort {

	public static void insertionSort (int[] A){
		for (int j=1; j<A.length; j++){
			int key=A[j];
			int i=j-1;
			while ((i>=0) && (A[i]>key)){
				A[i+1]=A[i];
				i=i-1;	
			}
			A[i+1]=key;
		}
		
	}
	
	public static void printArray (int[] A){
		for (int i=0; i<A.length; i++){
			System.out.print(A[i]+" ");
		}
	}
	
	int size;
	  
	  public int binarySearch(int key, int []A) {
	           int low = 0;
	           int high = size - 1;
	            
	           while(high >= low) {
	               int middle = (low + high) / 2;
	               if(A[middle] == key) {
	                   return middle;
	               }
	               if(A[middle] < key) {
	                   low = middle + 1;
	               }
	               if(A[middle] > key) {
	                   high = middle - 1;
	               }
	          }
	          return -1;
	     	
	  }	
	
	public static void main (String[] args){
		int [] myArray ={19, 3, 47, 21, 17, 6,1};
		System.out.println("Before sort the list...");
		printArray(myArray);
		insertionSort(myArray);
		System.out.println();
		System.out.println("After sort the list...");
		printArray(myArray);	
	}
	
}
