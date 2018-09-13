package writer;

import java.util.Arrays;
import java.util.Scanner;

public class GoogleCode {

	public static void main(String[] args) 
	{
	//int T;
	Scanner n=new Scanner(System.in);
	//T=n.nextInt();
	for(int i=0;i<1;i++)
	{
		
		String str=n.nextLine();
		
		String[] arr=str.split(" ");
//		for(int j=0;j<arr.length;j++)
//		{
//			System.out.println(arr[j]+"");
//		}
		Arrays.sort(arr);
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]+"");
		}
		
	}

	}

}
