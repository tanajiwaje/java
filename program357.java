import java.lang.*;
import java.util.*;

class program357
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
		  iMax=0;
		for(char value:setobj)
		{
			System.out.println(value + " Occures "+hobj.get(value)+"  times");
			
		}
	}
}