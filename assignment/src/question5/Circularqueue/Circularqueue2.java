package question5.Circularqueue;

import question5.No.Node2;


public class Circularqueue2 {
	Node2 front,temp,end;
	public Circularqueue2()
	{
		front=null;
		temp=null;
		end=null;
	}
	public Node2 getFront()
	{
		return front;
	}
	public void setFront(Node2 front)
	{
		this.front=front;
	}
	public Node2 getTemp()
	{
		return temp;
	}
	public void setTemp(Node2 temp)
	{
		this.temp=temp;
	}
	public void enqueue(Node2 newNode)
	{
		if(front==null)
		{
			temp=front=newNode;
			return;
		}
		if(temp.getNext()==null)
		{
			temp.setNext(newNode);
			newNode.setNext(temp);
			end=newNode;
			return;
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
	}
	public void printQueue()
	{
		temp=front;
		try {
			do {
				System.out.println(temp.getS().toString());
				temp=temp.getNext();
			}
			while(temp!=front && temp!=null);
		}
		catch(NullPointerException ignored)
		{
		}
	}
	public void remove(String name)
	{
		temp=front;
		if(temp.getS().getName().equals(name) && temp.getS().getBacklog()==0){
			temp=front=front.getNext();
		}
		while(!temp.getNext().getS().getName().equals(name))
		{
			temp=temp.getNext();
			if(temp==front)
				return;
		}
		if(temp.getS().getBacklog()==0)
		{
			temp.setNext(temp.getNext().getNext());
			return;
		}
		System.out.println("Student backlog is not 0 or student entry not found.");
	}
	public void process(String name)
	{
		temp=front;
		if(((String) temp.getS().getName()).contentEquals(name))
		{
			System.out.println(temp.getS().toString());
			System.out.println(temp.getS().getBacklog() - temp.getS().getAppearingcount());
		}
		while(!((String) temp.getS().getName()).contentEquals(name))
		{
			temp=temp.getNext();
			if(temp==front)
			{
				return;
			}
			System.out.println(temp.getS().toString());
			System.out.println(temp.getS().getBacklog() - temp.getS().getAppearingcount());
		}
	}
	
	

}

