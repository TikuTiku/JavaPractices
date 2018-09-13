package mostGeneralPrograms;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		int n=num,input=1;
		while(n>0)
		{
			input=input*n;
			n--;
			
		}
		System.out.println(input);
		

	}

}
