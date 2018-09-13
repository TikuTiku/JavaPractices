package mostGeneralPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		int f1,f2=0,f3=1;
		for(int i=0;i<=num;i++)
		{
			System.out.println(f3);
			f1=f2;
			f2=f3;
			f3=f1+f2;
			
		}
		

	}

}
