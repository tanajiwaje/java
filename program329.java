import java.lang.*;
import java.util.*;


class Matrix
{
	public int row;
	public int col;
	public int Arr[][];
	
	public Matrix(int row,int col)
	{
		this.row=row;
		this.col=col;
		Arr=new int[row][col];
	}
	
	protected void finalize()
	{
		Arr=null;
		System.gc();
	}
	
	public void Accept()
	{
	  Scanner sobj=new Scanner(System.in);
	  System.out.println("Enter Elements");
	  int i=0,j=0;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
    }
	
    public void Display()
	{
		int i=0,j=0;
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
		 int x=sobj.nextInt();
		 
		 System.out.println("Enter colums");
		 int y=sobj.nextInt();
		 
		 Matrix mobj=new Matrix(x,y);
		 mobj.Accept();
		 mobj.Display();
		 
		}	 
}