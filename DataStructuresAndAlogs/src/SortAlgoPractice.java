
public class SortAlgoPractice {

	public static void main(String args[]) {
		int arr[]= {8,7,6,5,4,3,2,1};
		new SortAlgoPractice().sort(arr, 0,arr.length-1);
		System.out.println("Given Array"); 
        printArray(arr); 
        
	}
	/* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	void sort(int arr[],int l,int r)
	{
		if(r>l)
		{
			int m=(l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
			
		}
		
		
	}
	void merge(int arr[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			L[i]= arr[l+i];
		}
		for(int i=0;i<n1;i++)
		{
			R[i]= arr[m+1+i];
		}
		int i=0,j=0,k=l;
		while(i<n1&&j<n2)
		{
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				j++;
				k++;
			}else
			{
				arr[k]=R[j];
				j++;
				k++;
			}
		}
		while(i<n1)
		{
			arr[k]=L[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			arr[k]=R[i];
			k++;
			j++;
		}
		
	}
}
