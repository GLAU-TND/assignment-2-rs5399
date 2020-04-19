package question5.main1;

import java.util.Scanner;

import question5.Student2;
import question5.Circularqueue.Circularqueue2;
import question5.No.Node2;


public class Mymain1 {
		@SuppressWarnings("resource")
		public static void main(String args[])
		{
			Circularqueue2 obj=new Circularqueue2();
			Node2 node;
			for(int i=0;i<5;i++)
			{
				node=new Node2(new Student2());
				obj.enqueue(node);
			}
			obj.printQueue();
			obj.remove(new Scanner(System.in).next());
			obj.printQueue();
			obj.process(new Scanner(System.in).next());
			}
		
		}

