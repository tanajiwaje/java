
import java.lang.*;
import java.util.*;


class program335
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
         
          mobj.SwapRow();
          System.out.println("Data after swapping is:");
          mobj.Display();		  
		}	 
}

