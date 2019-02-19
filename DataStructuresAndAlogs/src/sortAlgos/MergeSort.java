/**
 * 
 */
package sortAlgos;

/**
 * @author Srikanth
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	void print(int[] arr)
	{
		for(int i:arr) {
			System.out.print(" "+i);
		}
	}
	public void merge(int arr[],int l,int r,int m)
	{
		//sizes of the array
		int n1=m-l+1;
		int n2=r-m;
		
		int left[]=new int[n1];
		int right[]=new int[n2];
		
		//copy 
		for(int i=0;i<n1;i++)
		{
			left[i]=arr[l+i];
			
		}
		//copy 
				for(int j=0;j<n2;j++)
				{
					right[j]=arr[m+1+j];
					
				}
				
				int k=l;
				int i=0,j=0;
				while(i<n1 &&j <n2)
				{
					if(left[i]<=right[j])
					{
						arr[k]=left[i];
						i++;
					}
					else
					{
						arr[k]=right[j];
						j++;
					}
					k++;
				}
				while(i<n1)
				{
					arr[k]=left[i];
					i++;
					k++;
				}
				while (j < n2) 
		        { 
		            arr[k] = right[j]; 
		            j++; 
		            k++; 
		        } 
		
	}
	public void sort(int []arr,int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge( arr,l,r,m);
		}
	}
	public static void main(String[] args) {
		MergeSort obj=new MergeSort();
	int arr[]= {5,4,3,2,1};
	obj.print(arr);
	obj.sort(arr,0, arr.length-1);
	System.out.println("\n");
	obj.print(arr);
	}

}
