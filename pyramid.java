package zoryboard;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=s.nextInt();
		for(int i=1; i<=n; i++)
		{
		   for(int j=1; j<=n-i; j++)
		   {
			   System.out.print(" ");
		   }
		   for(int j=1; j<=i; j++)
		   {
		   System.out.print((char)(j+64));
		   }
		    for(int j=i-1; j>=1; j--)
		    {
		   System.out.print((char)(j+64));
		    }
		    System.out.println();
		}
	}

}
