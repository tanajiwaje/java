import java.io.*;
import java.util.*;

class program325
{
    public static void main(String arg[])
    {
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int irow=sobj.nextInt();
		
	    System.out.println("Enter number of colums");
		int icol=sobj.nextInt();
		
		int Arr[][]=new int[irow][icol];
		
		int i=0,j=0,iSum=0;
		
		System.out.println("Enter the elements");
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr.length;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
        for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr.length;j++)
			{
			    if(Arr[i][j]%2==0)
				{
					iSum=iSum+Arr[i][j];
				}
			}
			
		} 	
       System.out.println("Even is :"+iSum);		
    }
}