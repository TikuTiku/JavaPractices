package mostGeneralPrograms;

public class PalindromeNumber
{
	 static void sortedMethod(int[] arr)
	{
		 	int n=arr.length;
		 	int temp=0;
		 	for(int i=0;i<n;i++)
		 	{
		 		for(int j=1;j<n-i;j++)
		 		{
		 			if(arr[j-1]>arr[j])
		 			{
		 				temp=arr[j-1];
		 				arr[j-1]=arr[j];
		 				arr[j]=temp;
		 			}
		 		}
		 	}
	}
	

	public static void main(String[] args) 
	{
		int arr[]={12,15,5,2,1,68};
		System.out.println("bubble sort before sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println();
		sortedMethod(arr);
		System.out.println("bubble sort after sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
