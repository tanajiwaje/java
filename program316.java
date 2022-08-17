import java.lang.*;
import java.io.*;
import java.util.*;

class program316
{
     public static void main(String arg[])
	 {
		 Scanner sobj=new Scanner(System.in);
		 System.out.println("Enter String ");
		 String str=sobj.nextLine();
		 
		 str=str.toLowerCase();
		 char arr[]=str.toCharArray();
		 int Frequency[]=new int[26];
		 
		 System.out.println("Enter String ");
		 String str1=sobj.nextLine();
		 
		 str1=str1.toLowerCase();
		 char arr1[]=str1.toCharArray();
		 int Frequency1[]=new int[26];
		 int i=0;
		 for(i=0;i<arr.length;i++)
		 {
			 Frequency[arr[i]-'a']++;
		 }
		 
		 int iMax=0;
		 int iPos=0;
		 for(i=0;i<Frequency.length;i++)
		 {
			 if(Frequency[i]>iMax)
			 {
				 iMax=Frequency[i];
				 iPos=i;
			 }
		 }
		 System.out.println((char)(iPos+'a')+"  occur  "+iMax+"  number of times in the world");
	}
}