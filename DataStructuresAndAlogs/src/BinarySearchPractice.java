
public class BinarySearchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1,2,3,4,5,6,7,8,9,10};
			System.out.println(search (arr,0,arr.length-1,102));
			System.out.println(itterativeBinarySearch (arr,0,arr.length-1,10));
			
	}
	public static int search(int[] arr,int l,int r,int ele)
	{
		int mid=(l+r)/2;
		if(r>=l)
		{
			if(ele==arr[mid])
			{
				return mid;
			}
			else if(ele<arr[mid])
			{
				return search(arr,l,mid-1,ele);
			}
			else
			{
				return search(arr,mid+1,r,ele);
			}
		}
		return -1;
	}
	
	public static int itterativeBinarySearch(int[] arr,int l,int r,int ele)
	{
		
		while(r>=l)
		{
			int m=(l+r)/2;
			if(ele==arr[m])
			{
				return m;
			}
			else if(ele>arr[m])
			{
				l=m+1;
			}
			else
			{
				r=m-1;
			}
		
		}
		return -1;
	}

}
