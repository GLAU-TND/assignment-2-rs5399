package question5;
import java.util.Scanner;

public class Student2 {
	String name;
	int rollno,backlog,appearingcount;
	public Student2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Name:");
		this.name=sc.next();
		System.out.print("Roll no:");
		this.rollno=sc.nextInt();
		System.out.print("Backlog_count:");
		this.backlog=sc.nextInt();
		System.out.print("Appearing_count:");
		this.appearingcount=sc.nextInt();
		sc.close();
		
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public String toString()
	{
		return "name=" + name + "rollno" +  rollno + "backlog" + backlog + "appearingcount" + appearingcount; 
	}
	public int  getBacklog()
	{
		return backlog;
	}
	public void setBacklog(int backlog)
	{
		this.backlog=backlog;
	}
	public int getAppearingcount()
	{
		return appearingcount;
	}
	public void setAppearingcount(int appearingcount)
	{
		this.appearingcount=appearingcount;
	}
}

