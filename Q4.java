import java.util.*;
public class Q4 {
	static class node 
	{ 
		int key; 
		node left, right; 
	}; 
	static node newNode(int item) 
	{ 
		node temp = new node(); 
		temp.key = item; 
		temp.left = temp.right = null; 
		return temp; 
	} 
	static node insert(node node, int key) 
	{ 
		if (node == null) 
			return newNode(key); 
		if (key < node.key) 
			node.left = insert(node.left, key); 
		else if (key > node.key) 
			node.right = insert(node.right, key); 
		return node; 
	} 
	static int maxDepth(node node) 
	{ 
		if (node == null) 
			return 0; 
		else
		{ 
			int lDepth = maxDepth(node.left); 
			int rDepth = maxDepth(node.right); 
			if (lDepth > rDepth) 
				return (lDepth + 1); 
			else
				return (rDepth + 1); 
		} 
	} 
	static int maxHeight(int a[], int n) 
	{ 
		node rootA = null; 
		rootA = insert(rootA, a[0]); 
		for (int i = 1; i < n; i++) 
			rootA = insert(rootA, a[i]); 
		node rootB = null; 
		rootB = insert(rootB, a[n - 1]); 
		for (int i = n - 2; i >= 0; i--) 
			rootB =insert(rootB, a[i]); 
		int A = maxDepth(rootA) - 1; 
		int B = maxDepth(rootB) - 1; 
		return Math.max(A, B); 
	} 
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Input : ");
		String str=sc.next()+sc.nextLine();
		String str1[]=str.split(" ");
		int n=str1.length;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		 arr[i]=Integer.parseInt(str1[i]);
		}
		System.out.println("Output : ");
		System.out.println(maxHeight(arr, n)); 
	} 
}
