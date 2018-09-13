package writer;

import java.util.Scanner;

public class MaxSum {

	public static void main(String[] args)
	{
		
		int t;
		Scanner n=new Scanner(System.in);
		t=n.nextInt();
		for(int i=0;i<=t;i++)
		{
			int oddsum=0,evensum=0,y;
			int p=n.nextInt();
			
			for(int j=0;j<p;j++)
			{
				y=n.nextInt();
				if(j%2==1)
				{
					oddsum=oddsum+y;
					
				}
				else
				{
					evensum=evensum+y;
				}
				
			}
			
			
			if(oddsum>evensum)
			{
				System.out.println(oddsum);
			}
			else
				System.out.println(evensum);
			
			
		}
		
		
	}

}
