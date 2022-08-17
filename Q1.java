import java.lang*;
import java.util.*;
class Bitwise
{
	public boolean CheckBit(int no)
	{
		int iMask=15;
		int iResult=0;
		
		iResult=no & iMask;
		
		if(iResult==0)
        {
			return false;
		}	
		else
		{
			return true
		}
	}
}
class Q1
{
	public static void main(String arg[])
	{
	  Scanner sobj=new Scanner(System.in);
      int value=sobj.nextInt();
	  Bitwise bobj=new Bitwise();
	  boolean bRet=bobj.CheckBit(value);
	  if(bRet==true)
	  {
		  System.out.println("bit is on");
	  }
	  else
	  {
		  System.out.println("bit is off");
	  }
	  
      	  
	}
}