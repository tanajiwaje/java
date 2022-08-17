
import java.lang.*;
import java.util.*;

/*
Hello

*/


class program338
{
     public static void main(String arg[])
	 {
	   Scanner sobj=new Scanner(System.in);
        
		System.out.println("Enter the String ");
		String str=sobj.nextLine();
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
		for(int j=0;j<ch.length;j++)
		{
		    System.out.print(ch[i]+" ");
		}
		System.out.println(" ");
		}
       	   
	 }	 
}

