
import java.lang.*;
import java.util.*;
import Marvellous.Matrix;

class MyMatrix extends Matrix
{
	public MyMatrix(int a,int b)
	{
		super(a,b);
	}
	public int Maximum()
	{
	    int  iMax=Arr[0][0];
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				if(Arr[i][j]>iMax)
				{
				iMax=Arr[i][j];
				}
			}
				
			
		}
		return iMax;
	}
}


class program332
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
		 int iRet=mobj.Maximum();
		 System.out.println("Maximum elements is :"+iRet);
		}	 
}

