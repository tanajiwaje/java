import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program292
{
    public static void main(String arg[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);
             System.out.println("Please direcorot /folder name");
			 String foldername=sobj.nextLine();
			 
			 File dobj=new File(foldername);
			 
			 File allfiles[]=dobj.listFiles();
			 for(int i=0;i<allfiles.length;i++)
			 {
				 System.out.println(allfiles[i].getName());
			 }
            
        }
        catch( IOException obj)
        {
            System.out.println(obj);
        }
    }
}