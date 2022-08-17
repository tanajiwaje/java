
import java.lang.*;
import java.util.*;

/*
Hello

*/


class program341
{
     public static void main(String arg[])
	 {
	   Scanner sobj=new Scanner(System.in);
        
		System.out.println("Enter Number");
		int no=sobj.nextInt();
		
		
		String str=Integer.toString(no);
		char arr[]=str.toCharArray();
		
		
		
	    for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println(" ");
		}
		
		
       	   
	 }	 
}

