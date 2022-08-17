
import java.lang.*;
import java.util.*;

/*
Hello

*/


class program340
{
     public static void main(String arg[])
	 {
	   Scanner sobj=new Scanner(System.in);
        
		System.out.println("Enter the String ");
		String str=sobj.nextLine();
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
		for(int j=0;j<=i;j++)
		{
			System.out.print(ch[j]+" ");
		
		}
		System.out.println(" ");
		}
		
		for(int i=ch.length-1;i>=0;i--)
		{
		for(int j=0;j<=i;j++)
		{
			System.out.print(ch[j]+" ");
		
		}
		System.out.println(" ");
		}
		
		
		for(int i=0;i<ch.length-1;i++)
		{
		for(int j=0;j<=i;j++)
		{
			System.out.print(ch[j]+" ");
		
		}
		System.out.println(" ");
		}
		
		for(int i=ch.length-1;i>=0;i--)
		{
		for(int j=0;j<=i;j++)
		{
			System.out.print(ch[j]+" ");
		
		}
		System.out.println(" ");
		}
       	   
	 }	 
}

