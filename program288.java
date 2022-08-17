import java.lang.*;
import java.util.*;
import java.io.*;


class program288
{
	public static void main(String arg[])
	{
		try
		{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Please enter file name");
		String Filename=sobj.nextLine();
		
		File fobj=new File(Filename);
		if(fobj.exists())
		{
			BufferedReader bobj=new BufferedReader(new FileReader(fobj));
			String str;
			while((str=bobj.readLine())!=null)
			{
				System.out.print(str);
			}
		}
		else
		{
			System.out.println("no such file");
		}
		
		}
		catch(IOException obj)
		{     
		  System.out.println("hello");
		}
	}
}