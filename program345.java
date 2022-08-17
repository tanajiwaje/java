
import java.lang.*;
import java.util.*;

/*
Hello

*/


class program345
{
     public static void main(String arg[])
	 {
	   Scanner sobj=new Scanner(System.in);
        
		System.out.println("Enter Number");
		//int no=sobj.nextInt();
		
		
		
		char arr[]=(Integer.toString(sobj.nextInt())).toCharArray();
		
		
		
	    for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println(" ");
		}
		
		
       	   
	 }	 
}

