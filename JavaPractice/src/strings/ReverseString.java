package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		//Using StringBuffer Class
		/*String str="Subhash";
		StringBuffer sfr=new StringBuffer(str);
		System.out.println(sfr.reverse());*/
		String storeString,rev="";
		Scanner in =new Scanner(System.in);
		 storeString=in.nextLine();
		int length=storeString.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+storeString.charAt(i);
			
		}
		System.out.println("reverse of enetered string  " +rev);
		

	}

}
