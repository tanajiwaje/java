import java.lang.*;
import java.util.*;

class Student
{
	public int R_ID;
	public String Name;
	public int Roll_No;
	public int Marks;
	public int Salary;
	
	public static int Increment;
	
	static
	{
		Increment=0;
	}
	
	Student(String name,int rno,int marks,int salary)
	{
		this.R_ID=Increment++;
		this.Name=name;
		this.Roll_No=rno;
		this.Marks=marks;
		this.Salary=salary;
	}
	
	public void DisplayAll()
	{
		System.out.println(this.R_ID+"\t"+this.Name+"\t"+this.Roll_No+"\t"+this.Marks+"\t"+this.Salary);
	}
}

class DBMS
{
	LinkedList<Student> lobj;
	
	DBMS()
	{
		lobj=new LinkedList<>();
	}
	public void StartDBMS()
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("welcome to virtual DBMS");
		String str="";
		
		while(true)
		{
			System.out.print("DBMS >");
			str=sobj.nextLine();
			
			String Query=str.toLowerCase();

			String tokens[]=Query.split(" ");
	
			
			int Querysize=tokens.length;

			if("exit".equals(tokens[0]))
			{
				return;
			}
			else if(Querysize==1)
			{
				if("help".equals(tokens[0]))
				{
					 System.out.println("Your are in Virtual DBMS System");
					 System.out.println("............................................");
					 System.out.println("Display All Data:select * from student");
					 System.out.println("Insert Value    :insert into table_name name rno marks salary");
					 System.out.println("Find            :where Student_name ");
					 System.out.println("Find            :where id Student");
					 System.out.println("Find Average    :where salary average");
					 System.out.println("Find maximum    :where salary Maximum");
					 System.out.println("Find minimum    :where salary Minimum");
					 System.out.println("Find Count    :where salary count");
	                 System.out.println("Exit            :Exit");
	                 System.out.println("............................................");
                }
			}
			
			else if(Querysize==2)
			{
				if("where".equals(tokens[0]))
				{
					 
						//int i=Integer.parseInt(tokens[1]);
						DisplaySpecific(tokens[1]);

				}
			}
			else if(Querysize==3)
			{
				if("where".equals(tokens[0]))
				{
					if("student".equals(tokens[2]))
					{
						int i=Integer.parseInt(tokens[1]);
						DisplaySpecific(i);
					}
				    else if("salary".equals(tokens[1]))
						{
							if("average".equals(tokens[2]))
							{
								 AggregateAvg();
							}
							else if("maximum".equals(tokens[2]))
							{
								 AggregateMax();
							}
							else if("minimum".equals(tokens[2]))
							{
								 AggregateMin();
							}
							else if("count".equals(tokens[2]))
							{
								 AggregateCount();
							}
							
						}
				}
		    }
			
			else if(Querysize==4)
			{
				if("select".equals(tokens[0]))
				{
					if("*".equals(tokens[1]))
					{
						if("from".equals(tokens[2]))
						{
							if("student".equals(tokens[3]))
							{
								DisplayData();
							}
						}
					}
				}
			}
			
			else if(Querysize==7)
			{
				if("insert".equals(tokens[0]))
				{
					if("into".equals(tokens[1]))
					{
						if("student".equals(tokens[2]))
						{
							int i1=Integer.parseInt(tokens[4]);
                            int i2=Integer.parseInt(tokens[5]);
                            int i3=Integer.parseInt(tokens[6]);							
							InsertData(tokens[3],i1,i2,i3);
						}
					}
				}
			}
	    }
	}
	

	public void InsertData(String name,int rno,int marks,int salary)
	{
		Student sobj=new Student(name,rno,marks,salary);
	    lobj.add(sobj);
	}
	
	public void DisplayData()
	{
		for(Student src:lobj)
		{
			src.DisplayAll();
		}
	}

    public void DisplaySpecific(int id)
	{
		for(Student str:lobj)
		{
			if(str.R_ID==id)
			{
				str.DisplayAll();
				break;
			}
		}
	}
	
	public void DisplaySpecific(String name)
	{
		for(Student str:lobj)
		{
			if(name.equals(str.Name))
			{
			  str.DisplayAll();
			  break;
			}
		}
	}
	
	public void DeleteSpecific(int rid)
	{   
	    int index=0;
		for(Student str:lobj)
		{
			if(str.R_ID==rid)
			{
			   lobj.remove(index);	
			}
			index++;
		}
	}
	
	public void DeleteSpecific(String name)
	{   
	    int index=0;
		for(Student str:lobj)
		{
			if(name.equals(str.Name))
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
        for(Student str:lobj)
		{
			if(str.Salary>iMax)
			{
				iMax=str.Salary;
			}
		}
            System.out.println("Maximum salary is :"+iMax);		
	}
	
	public void AggregateMin()
	{
		int iMin=(lobj.getFirst().Salary);
		for(Student str:lobj)
		{
			if(str.Salary<iMin)
			{
				iMin=str.Salary;
			}
		}
		System.out.println("Minimum salary is:"+iMin);
	}
	
	public void AggregateAvg()
	{
		int iSum=0;
		for(Student str:lobj)
		{
			iSum=iSum+str.Salary;
		}
		System.out.println("Average of an Salary is:"+iSum/(lobj.size()));
	}
	
	public void AggregateCount()
	{
		int iCnt=0;
		for(Student str:lobj)
		{
			iCnt++;
		}
		System.out.println("Count of an code is :"+iCnt);
	}
}
class VirtualDBMS
{
	public static void main(String arg[])
	{
		DBMS obj=new DBMS();
		obj.StartDBMS();
		System.out.println("Thanks for using DBMS as virtual");
	}
}
