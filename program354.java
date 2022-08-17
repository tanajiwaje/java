import java.lang.*;
import java.util.*;

class program354
{
	public static void main(String arg[])
	{
	   Scanner sobj=new Scanner(System.in);

       System.out.println("Enter First String");
       String str1=sobj.nextLine();
	   
	   System.out.println("Enter Second String");
       String str2=sobj.nextLine();
	   
	   if(str1.length()!=str2.length())
	   {
		   System.out.println("String are not in rotation");
		   return;
	   }
	   
	   String str3=str1+str1;
	   
	   if(str3.contains(str2))
	   {
		   System.out.println("rotaion");
		   
	   }
	   else
	   {
		   System.out.println("not rotaion");
		   
	   }
	
	}
}