package sortAlgos;

public class MainClass {
	public static void main(String args[])
	{
		MainClass obj=new MainClass();
		int insertSortInput[]= {0,66,23,23,2,1,55,5,88,-1};
		obj.selectionSort(insertSortInput);
		System.out.println("Selection Sort \n");
		obj.print(insertSortInput);
		
		int bubbleSortInput[]= {0,66,23,23,2,1,0,2,33,44,55,66,0,55,5,88,-1};
		obj.selectionSort(bubbleSortInput);
		System.out.println("\n\nBubble Sort \n");
		obj.print(bubbleSortInput);
		

		int bubbleSortRect[]= {0,66,23,23,2,1,0,2,33,44,55,66,0,55,5,88,-1,2,3,4,5,77,88,99,2};
		obj.bubbleSortRec( bubbleSortRect, bubbleSortRect.length);
		System.out.println("\n\nBubble SortRec \n");
		obj.print(bubbleSortRect);
		
		int insertionSort[]= {66,23,23,2,1,0,2,33,44,55,66,0,55,5,88,-1,2,3,4,5,77,88,99,2};
		obj.insertionSort(insertionSort);
		System.out.println("\n\n insertionSort \n");
		obj.print(insertionSort);
		
		int insertionSortrec[]= {66,23,2,3,1};
		obj.insertionSortRecursive(insertionSortrec,insertionSortrec.length);
		System.out.println("\n\n insertionSortrec \n");
		obj.print(insertionSortrec);
	}
	
	void selectionSort(int arr[])
	{
		int n=arr.length;
		int i,j;
		int min_idx;
		for (i=0;i<n-1;i++)
		{
			min_idx=i;
			for (j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_idx]) {
					min_idx=j;
				}
			}
			if(min_idx!=i)
			{
				int temp;
				temp=arr[i];
				arr[i]=arr[min_idx];
				arr[min_idx]=temp;
				}	
		}
	}
	
	void bubbleSort(int arr[])
	{
		int n=arr.length;
		int i,j;
		for (i=0;i<n;i++)
		{
			for (j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1]) {
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
	
		}
		
		
	}
	void bubbleSortRec(int arr[],int size) {
		if(size==1)
		{
			return ;
		}
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp;
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		bubbleSortRec(arr, size-1);
	}
	
	
	void insertionSort(int arr[])
	{
		int i,j;
		int key;
		for (i=1;i<arr.length;i++)
		{
			key=arr[i];
			j=i-1;
			while(j>0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	
	}
	void insertionSortRecursive(int arr[], int n) 
	{ 
	    // Base case 
	    if (n <= 1) 
	        return; 
	  
	    // Sort first n-1 elements 
	    insertionSortRecursive( arr, n-1 ); 
	  
	    // Insert last element at its correct position 
	    // in sorted array. 
	    int last = arr[n-1]; 
	    int j = n-2; 
	  
	    /* Move elements of arr[0..i-1], that are 
	      greater than key, to one position ahead 
	      of their current position */
	    while (j >= 0 && arr[j] > last) 
	    { 
	        arr[j+1] = arr[j]; 
	        j--; 
	    } 
	    arr[j+1] = last; 
	} 
	
	void print(int[] arr)
	{
		for(int i:arr) {
			System.out.print(" "+i);
		}
	}

}
