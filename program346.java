import java.lang.*;
import java.util.*;

class program346
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=sobj.nextInt();
		int sum=0;
		
		while(true)
		{
		while(no!=0)
		{
			sum=sum+(no%10);
			no=no/10;
		}
		no=sum;
		sum=0;
		if(no<10)
		{
			break;
		}
		}
		System.out.println("Number is:"+no);
		
	}
}
