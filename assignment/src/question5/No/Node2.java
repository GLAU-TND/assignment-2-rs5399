package question5.No;

import question5.Student2;

public class Node2 {

		private Student2 s;
		private Node2 next;
		public Node2(Student2 s)
		{
			this.s=s;
			next=null;
		}
		public Student2 getS()
		{
			return s;
		}
		public void setS(Student2 s) {
			this.s=s;
		}
		public Node2 getNext()
		{
			return next;
		}
		public void setNext(Node2 next)
		{
			this.next = next;
		}
	}

