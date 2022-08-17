import java.lang.*;
import java.util.*;

class Bitwise
{

	public int ToggleBit(int iNo,int iPos) //4 bit on karane
	{
		if(iPos<=0 || iPos>32)
		{
			System.out.println("Invalid position");
			return 0;
		}
	    int iMask=0X00000001;
		int iResult=0;
		
		iMask=iMask<<(iPos-1);
		
		iResult=iNo^iMask;
		return iResult;
	}
	
}
class program202
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number ");
		int value=sobj.nextInt();

        System.out.println("Enter Position");
		int pos=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
	    int iRet=bobj.ToggleBit(value,pos);
		System.out.println("toggle is :"+iRet);
	   
	}
}

/*


*/