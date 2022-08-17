import java.lang.*;
import java.util.*;

class program349
{
	public static void main(String arg[])
	{
	   Scanner sobj=new Scanner(System.in);

        System.out.println("Enter Number");
        long iNo=sobj.nextInt();
		
		System.out.println("Enter starting polong");
        long iStart=sobj.nextInt();
		
		System.out.println("Enter ending polong");
        long iEnd=sobj.nextInt();
		
		long iMask1=0xffffffff;
		long iMask2=0xffffffff;
		long iMask=0;
		
		iMask1=iMask1<<(iStart-1);
		iMask1=iMask2>>(32-iEnd);
		
		iMask=iMask1 & iMask2;
		System.out.println("imask :"+iMask);
		long iResult=0;
		iResult=iNo&iMask;
		
		
		if(iResult==iNo)
		{
			System.out.println("First niible is completely on ");
			
		}
		else
		{
			System.out.println("First niible of");
		}
		
	}
}