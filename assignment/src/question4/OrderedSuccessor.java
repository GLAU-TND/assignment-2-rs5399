package question4;


public class OrderedSuccessor {
		static class Node 
		{ 
		    int key;  
		    Node left; 
		    Node right; 
		    Node parent; 
		} 
		static Node insert(int key, Node root,  
		                            Node parent) 
		{ 
		    if(root == null) 
		    {  
		        Node node = new Node(); 
		        if(node != null) 
		        { 
		            node.key = key; 
		            node.left = node.right = null; 
		            node.parent = parent; 
		            return node; 
		              
		        } 
		    }
		    	else if(key == root.key) 
		        System.out.printf("Duplicates are not allowed in BST."); 
		       
		    else if(key > root.key) 
		        root.right = insert(key, root.right, root); 
		      
		    else
		        root.left = insert(key, root.left, root);  
		    return root; 
		}  
		static Node search(int key, Node root) 
		{
		    if(root == null) 
		        return null;  
		    else if( key == root.key) 
		        return root;  
		    else if(key > root.key) 
		        return search(key, root.right);
		    else
		        return search(key, root.left);  
		} 
		static Node preOrderSuccessor(int key,  
		                              Node root) 
		{ 
		    Node node = search(key, root); 
		    if(node == null) 
		    { 
		        System.out.printf("%d do not exists in BST.\n", key); 
		        return null; 
		    } 
		    if(node.left != null) 
		        return node.left; 
		  
		    else if(node.right != null) 
		        return node.right; 
		  
		    else
		    { 
		        Node temp = node.parent; 
		        while(temp != null) 
		        { 
		            if(key < temp.key && temp.right != null) 
		                break; 
		            temp = temp.parent; 
		        }
		        return temp != null ? temp.right : null; 
		    } 
		} 
		static void preOrder(Node root) 
		{ 
		    if(root != null) 
		    { 
		        System.out.printf("%d ", root.key); 
		        preOrder(root.left); 
		        preOrder(root.right); 
		    } 
		}
		public static void main(String args[]) 
		{ 
		    Node ROOT = null; 
		    int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; 
		  
		    int n = a.length;  
		    for(int i = 0 ; i < n; i++) 
		    { 
		        ROOT = insert(a[i], ROOT, null);  
		    } 
		    System.out.printf("\nPre-Order Traversal : "); 
		    preOrder(ROOT);
		    System.out.printf("\n====================================="); 
		    System.out.printf("\n%-10s%s\n", "Key",  
		                    "Pre-Order Successor"); 
		    System.out.printf("=====================================\n"); 
		    Node successor = null; 
		    for(int i = 0 ; i < n; ++i) 
		    {
		        successor = preOrderSuccessor(a[i], ROOT); 
		  
		        if(successor != null) 
		            System.out.printf("%-10d%d\n", a[i], 
		                                 successor.key); 
		        else 
		            System.out.printf("%-10dDo Not Exist.\n", a[i]); 
		    } 
		} 
		} 

