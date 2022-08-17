import java.lang.*;
import java.io.*;
import java.util.*;

class program307
{
     public static void main(String arg[])
	 {
		 Scanner sobj=new Scanner(System.in);
		 System.out.println("Enter String ");
		 String str=sobj.nextLine();
		 
		 String newstr=str.replaceAll("\\s+"," ");
		 String newstr2=newstr.trim();
		 
		 String arr[]=newstr2.split(" ");
		 
		 int iPos=0;
		 int iMax=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i].length()>=iMax)
			 {
				 iMax=arr[i].length();
				 iPos=i;
			 }
			 
		 }
		 System.out.println("length of largest word is :"+iMax);
		 System.out.println("length of largest word is :"+arr[iPos]);
	 }
	
}