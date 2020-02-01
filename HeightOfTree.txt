import java.util.*;
public class HeightOfTree {
	static Node root;
	static class Node
	{
		int key;
		Node left;
		Node right;
		Node(int d)
		{
			key=d;
			right=null;
			left=null;
			
		}
	}
   public static void insert(int item)
   {
	   root=insertItem(root,item);
   }
   public static Node insertItem(Node root,int key)
   {
	   
	   if(root==null)
	   {
		   root=new Node(key);
		   return root;
	   }
	   if(key<root.key)
	   {
		   root.left=insertItem(root.left,key);
	   }
	   else if(key>root.key)
	   {
		   root.right=insertItem(root.right,key);
	   }
	   return root;
   }
  
   public static void inOrder(Node root)
   {
	   if(root!=null)
	   {
		   inOrder(root.left);
		   System.out.println(root.key);
		   inOrder(root.right);
	   }
   }
    int height(Node node)
   {
	   if(node==null)
	   {
		   return 0;
	   }
	   else
	   {
	   int ldepth=height(node.left);
	   int  rdepth=height(node.right);
	   if(ldepth>rdepth)
		   return (ldepth+1);
	   else 
		   return (rdepth+1);
	   }
	   
   }
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HeightOfTree h=new HeightOfTree();
		int n =sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int item=sc.nextInt();
			h.insert(item);
		}
		h.inOrder(root);
      int h1= h.height(root);
      System.out.println("Height of Binary Search Tree is :"+h1);
	}

}
