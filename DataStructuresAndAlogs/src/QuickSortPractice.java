
public class QuickSortPractice {

	public static void main(String args[])
	{
		int arr[]= {10,90,30,80,40,50,70};
		sort(arr, 0, arr.length-1);
		System.out.println("sorted array"); 
		printArray(arr); 
	}
	
	public static void sort(int[] arr,int low,int high )
	{
		if(low<high)
		{
			int p=divide(arr,low, high);
			sort(arr,low,p-1);
			sort(arr,p+1,high);
		}
		 
	}  
	
	private static int divide(int[] arr, int low,int high) {
		int pivot=arr[high];
		int min_idx=low-1;
		for(int i=low;i<high;i++)
		{
			if(arr[i]<=pivot)
			{
				min_idx++;
				int temp=arr[min_idx];
				arr[min_idx]=arr[i];
				arr[i]=temp;
				
			}
			
		}
		// swap arr[i+1] and arr[high] (or pivot) 
				int temp = arr[min_idx+1]; 
				arr[min_idx+1] = arr[high]; 
				arr[high] = temp; 
		return min_idx+1;
	}

	/* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }
}
