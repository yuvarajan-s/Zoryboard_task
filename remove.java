package zoryboard;

import java.util.Arrays;
import java.util.Scanner;

public class remove {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string:");
		String st=s.next();
		 char str[] = st.toCharArray();
	     int n = str.length;
	     int index = 0,j=0;
	        for (int i = 0; i < n; i++)
	        {
	           
	            for (j=0; j < i; j++)
	            {
	                if (str[i] == str[j])
	                {
	                    break;
	                }
	            }
	            if ( j == i)
	            {
	                str[index++] = str[i];
	            }
	        }
	        
	        System.out.println(String.valueOf(Arrays.copyOf(str, index)));

	}

}
