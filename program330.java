import java.lang.*;
import java.util.*;


class Demo
{
	int row,col,Arr[][];
	Demo(row,col)
	{
		this.row=row;
		this.col=col;
	}
	public Accept()
	{
	int Arr[][]=new int[row][col];
		int i=0,j=0;
	System.out.println("Enter Elements");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
    }
    public Display()
	{
		System.out.println("Enter of array is:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
			   System.out.print(Arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}	
}
class program329
{
     public static void main(String arg[])
	 {
		 Scanner sobj=new Scanner(System.in);
		 
		 System.out.println("Enter row");
		 int row=sobj.nextInt();
		 
		 System.out.println("Enter colums");
		 int col=sobj.nextInt();
		 
		 Demo obj=new Demo(row,col);
		 obj.Accept();
		 obj.Display();
		 
		
	
		
		
		Arr=null;
		System.gc();
		 
	 }	 
}