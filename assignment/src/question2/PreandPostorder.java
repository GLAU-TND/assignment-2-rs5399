package question2;
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

public class PreandPostorder {
		Node root;
		PreandPostorder()
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
		 void printpreorder()   {     printpreorder(root);  } 
		 public static void main(String[] args) 
		    { 
		        PreandPostorder tree = new PreandPostorder(); 
		        tree.root = new Node(1); 
		        tree.root.left = new Node(2); 
		        tree.root.right = new Node(3); 
		        tree.root.right.left = new Node(4);
		        tree.root.right.right = new Node(5);
		  
		        System.out.println("Preorder traversal of binary tree is "); 
		        tree.printpreorder(); 
		        
		        System.out.println("\nPostorder traversal of binary tree is "); 
		        tree.printpostorder(); 
		    } 
		} 

