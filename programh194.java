import java.lang.*;
import java.util.*;

class Bitwise
{
   public boolean ChechBit(int no)
   {
   int iMask=4;
   int iResult=0;

   iResult=no&iMask;
   if(iResult==0)
   {
   	return false;
   }
   else
   {
   	return true;
   }
}
}

class programh194
{
	public static void main(String arg[])
	{
	Scanner sobj=new Scanner(System.in);
	System.out.print("");
	int value=sobj.nextInt();

	Bitwise bobj=new Bitwise();
	boolean bRet=bobj.ChechBit(value);
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