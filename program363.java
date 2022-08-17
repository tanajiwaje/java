import java.lang.*;
import java.util.*;

//create table student(RID int,Name varchar(255),Salary int);
//Database table /schema

class Student
{
	public int RID;
	public String Name;
	public int Salary;
    
	private static int Generator;
	
	static
	{
	  Generator=0;
	}
	
    public Student(String str,int value)
	{
		this.RID=++Generator;
		this.Name=str;
		this.Salary=value;
	}	
	
	//Display method for student class
	public void DisplayData()
	{
		System.out.println("|"+this.RID+"|\t|"+this.Name+"|\t|"+this.Salary+"|");
	}
}

class DBMS
{
	public LinkedList<Student> lobj;
	
	public DBMS()
	{
		lobj=new LinkedList<>();
	}
	//Insert into student piyush 1000;
	//start message
	//select * from student;
	public void StartDBMS()
	{ 
	    Scanner scanobj=new Scanner(System.in);
		System.out.println("Marvellous customised DBMS Started Succesfully");
		////////////////////////////////////////////////////////////////////
		String Query="";
		while(true)
		{
			System.out.println("Marvellos DBMS console >>");
			Query=scanobj.nextLine();
			
			String tokens[]=Query.split(" ");
			int QuerySize=tokens.length;
			
			if(QuerySize==1)
			{
				if("Help".equals(tokens[0]))
				{
					System.out.println("This application is use to demonstraint DBMS");
					System.out.println("Exit:Terminate DBMS");
					System.out.println("Display all data : Select * from student");
					System.out.println("Insert data: Insert into student name salary");
				}
				else if("Exit".equals(tokens[0]))
				{
					System.out.println("Thank you for using Marvellosus DBMS ");
				}
				
			}
			else if(QuerySize==2)
			{
			
			}
			else if(QuerySize==4)
			{
				if("select".equals(tokens[0]))
				{
				
					   DisplayAll();
					
				}
			}
			else if(QuerySize==5)
			{
				//insert into student piyush 1000;
				if("Insert".equals(tokens[0]))
				{
					InsertData(tokens[3],Integer.parseInt(tokens[4]));
				}
			}
				
		}
	    
	}	
	//Insert data
	public void InsertData(String str,int value)
	{
		Student sobj=new Student(str,value);
		lobj.add(sobj);
	}
	//Display data
	public void DisplayAll()
    {
		for(Student sref:lobj)
		{
			sref.DisplayData();
		}
	}
//Display by name
	public void DisplaySpecific(int rid)
	{
		for(Student sref:lobj)
		{
			if(sref.RID==rid)
			{
				sref.DisplayData();
				break;
			}
		}
	}
	
	//Display by name
	public void DisplaySpecific(String str)
	{
		for(Student sref:lobj)
		{
			if(str.equals(sref.Name))
			{
				sref.DisplayData();
			}
		}
	}
	
	//Delete by RID
	public void DeleteSpecific(int rid)
	{
		int index=0;
		for(Student sref:lobj)
		{
			if(sref.RID==rid)
			{
			   lobj.remove(index);
			   break;
			}
			index++;
		}
	}
	
	//Delete by name
	public void DeleteSpecific(String str)
	{
		int index=0;
		for(Student sref:lobj)
		{
			if(str.equals(sref.Name))
			{
			   lobj.remove(index);
			   break;
			}
			index++;
		}
	}
	
	public void AggregateMax()
	{
		int iMax=0;
		Student temp=null;
		for(Student sref:lobj)
		{
			if(sref.Salary>iMax)
			{
				iMax=sref.Salary;
				temp=sref;
			}
		}
		System.out.println("information of student having maximum salary:");
		temp.DisplayData();
	}
	
	public void AggregateMin()
	{
		int iMin=(lobj.getFirst().Salary);
		Student temp=lobj.getFirst();
		for(Student sref:lobj)
		{
			if(sref.Salary<iMin)
			{
				iMin=sref.Salary;
				temp=sref;
			}
		}
		System.out.println("information of student having minimum salary:");
		temp.DisplayData();
	}
	
	public void AggregateSum()
	{
	    long iSum=0;
		
		for(Student sref:lobj)
		{
		    iSum=iSum+sref.Salary;
		}
		System.out.println("information of student having summation salary:"+iSum);
		
	}
	
	public void AggregateAvg()
	{
	    long iSum=0;
		
		for(Student sref:lobj)
		{
		    iSum=iSum+sref.Salary;
		}
		System.out.println("information of student having summation salary:"+iSum/(lobj.size()));
		
	}
	
	public void AggregateCount()
	{
		System.out.println("Count is :"+lobj.size());
	}
}

class program363
{
	public static void main(String arg[])
	{
		DBMS dobj=new DBMS();
		
		dobj.StartDBMS();
	
    /*	dobj.InsertData("Piyush",2000);
		dobj.InsertData("Sakshi",3000);
		dobj.InsertData("Sachin",6000);
		dobj.InsertData("Sachin",7000);
		dobj.InsertData("Sachin",4000);
		
		dobj.DisplayAll();
		//dobj.DisplaySpecific(3);
		//dobj.DisplaySpecific("Piyush");
		//dobj.DeleteSpecific(2);
		dobj.DeleteSpecific("Sakshi");
		System.out.println("After delete");
		dobj.DisplayAll();
		dobj.AggregateMax();
		dobj.AggregateMin();
		dobj.AggregateSum();
		dobj.AggregateAvg();
		dobj.AggregateCount();
		*/
	}

}

