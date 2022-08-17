import java.lang.*;
import java.util.*;

class Bitwise
{

	public int OnBit(int iNo) //4 bit on karane
	{
	    int iMask=0X00000048;
		
		
		int iResult=0;
		iResult=iNo ^ iMask;
	
		return iResult;
	}
	
}
class program201
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number ");
		int value=sobj.nextInt();
		int pos=sobj.nextInt();
		Bitwise bobj=new Bitwise();
	    int bRet=bobj.OnBit(value);
	     System.out.println("Updated numberis :"+bRet);
	}
}

/*


*/