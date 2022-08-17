
import java.lang.*;
import java.util.*;
import Marvellous.Matrix;

class MyMatrix extends Matrix
{
	public MyMatrix(int a,int b)
	{
		super(a,b);
	}
	public int Minimum()
	{
	    int  iMin=Arr[0][0];
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				if(Arr[i][j]<iMin)
				{
				iMin=Arr[i][j];
				}
			}
				
			
		}
		return iMin;
	}
}


class program333
{
     public static void main(String arg[])
	 {
		 Scanner sobj=new Scanner(System.in);
		 System.out.println("Enter row");
		 int x=sobj.nextInt();
		 
		 System.out.println("Enter colums");
		 int y=sobj.nextInt();
		 
		MyMatrix mobj=new MyMatrix(x,y);
		 mobj.Accept();
		 mobj.Display();
		 int iRet=mobj.Minimum();
		 System.out.println("Minimum elements is :"+iRet);
		}	 
}

