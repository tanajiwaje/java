import java.lang.*;
import java.util.*;

class program356
{
	public static void main(String arg[])
	{
	   Scanner sobj=new Scanner(System.in);
	   
       System.out.println("Enter First String");
       String str=sobj.nextLine();
	   
	   char Arr[]=str.toCharArray();
	   int Frequency=0;
	   HashMap<Character,Integer>hobj=new HashMap<>();
	   
	   for(char ch:Arr)
	   {
		   if(hobj.containsKey(ch))
		   {
			   Frequency=hobj.get(ch);
			   hobj.put(ch,Frequency+1);
		   }
		   else
		   {
			   hobj.put(ch,1);
		   }
	   }

          Set<Character>setobj=hobj.keySet();
		  System.out.println(setobj);
	}
}