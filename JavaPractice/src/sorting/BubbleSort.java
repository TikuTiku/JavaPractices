package sorting;

public class BubbleSort {
	static int temp;
	public static int bubbleSort(int a[],int lenth )
	{
		System.out.println("sorted array");
		for(int i=0;i<lenth;i++)
		{
			for(int j=i+1;j<lenth-1;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			System.out.println(a[i]);
		}
		return lenth;
		
	}

	public static void main(String[] args) 
	{
		int a[]={12,25,59,24,5,69};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("sorted array "+bubbleSort(a,a.length));

	}

}
