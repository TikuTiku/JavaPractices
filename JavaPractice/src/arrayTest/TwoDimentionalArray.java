package arrayTest;

public class TwoDimentionalArray {

	public static void main(String[] args) 
	{
		int a[][]={{2,4,8},{3,6,9},{4,8,12}};
		System.out.println("matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("transposed matrix");
			for(int x=0;x<3;x++)
			{
				for(int y=0;y<3;y++)
				{
					System.out.print(a[y][x]+" ");
					
				}
				System.out.println("");
			}
			
		
		

	}

}
