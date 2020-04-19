package question1;

class Node {
	int data;
	Node left,right;
	public Node(int item)
	{
		data=item;
		left=right=null;
	}
}

public class Leftbinarytree {
	Node root;
	static int max_level=0;
	void leftview(Node node, int level)
	{
		if(node==null)
			return;
		if(max_level<level)
		{
			System.out.print(" "+node.data);
			max_level=level;
		}
		leftview(node.left,level+1);
		leftview(node.right, level+1);
	}
		void leftview()
		{
			leftview(root,1);
		}
		public static void main(String args[])
		{
			Leftbinarytree Tree=new Leftbinarytree();
			Tree.root=new Node(1);
			Tree.root.left=new Node(2);
			Tree.root.right=new Node(3);
			Tree.root.right.left=new Node(4);
			Tree.root.right.right=new Node(5);
			Tree.leftview();
		
	}

}

