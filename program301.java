import java.lang.*;
import java.io.*;
import java.util.*;

class program301
{
     public static void main(String arg[])
	 {
		 Scanner sobj=new Scanner(System.in);
		 System.out.println("Enter String ");
		 String str=sobj.nextLine();
		 
		 char arr[]=str.toCharArray();
         int iCnt=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>='a' && arr[i]<='z')
			 {
				 iCnt++;
			 }
		 }
         		 System.out.println("Nummber of small case letter are :"+iCnt);
	 }
	
}