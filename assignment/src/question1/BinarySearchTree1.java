package question1;

class Node
{
	int data;
	Node left,right;
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}

public class BinarySearchTree1
{
	Node root;
	BinarySearchTree1()
	{
		root=null;
	}
	void printpostorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		printpostorder(node.left);
		printpostorder(node.right);
		System.out.print(node.data+" ");
	}
	public void printInorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		printInorder(node.left);
		System.out.println(node.data+" ");
		printInorder(node.right);
	}
	
	void printpreorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		System.out.print(node.data+" ");
		printpreorder(node.left);
		printpreorder(node.right);
	}
	 void printpostorder()  {     printpostorder(root);  } 
	 void printInorder()	{		printInorder(root);		}
	 void printpreorder()   {     printpreorder(root);  } 
	 public static void main(String[] args) 
	    { 
	        BinarySearchTree1 tree = new BinarySearchTree1(); 
	        tree.root = new Node(1); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(3); 
	        tree.root.right.left = new Node(4);
	        tree.root.right.right = new Node(5);
	  
	        System.out.println("Preorder traversal of binary tree is "); 
	        tree.printpreorder(); 
	        System.out.println("Inorder traversal of binary tree is");
			tree.printInorder();
	        System.out.println("Postorder traversal of binary tree is "); 
	        tree.printpostorder(); 
	    } 

}
