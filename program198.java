import java.lang.*;
import java.util.*;

class Bitwise
{

	public int OnBit(int iNo) //4 bit on karane
	{
	    int iMask=0X00000008;
		
		int iResult=0;
		iResult=iNo | iMask;
	
		return iResult;
	}
	
}
class program198
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number ");
		int value=sobj.nextInt();
		Bitwise bobj=new Bitwise();
	    int bRet=bobj.OnBit(value);
	     System.out.println("Updated numberis :"+bRet);
	}
}

/*


*/