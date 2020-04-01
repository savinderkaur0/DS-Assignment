import java.util.*;
public class Q1 {
	static Node head; 
	static class Node 
	{ 
		int data; 
		Node next; 

		Node(int d)
		{ 
			data = d; 
			next = null; 
		} 
	} 
	Q1 insert(Q1 ob,int data)
	{
		Node newNode= new Node(data);
		newNode.next=null;
		if(ob.head==null)
			ob.head=newNode;
		else
		{
			Node last=ob.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return ob;
	}
	void printList(Node node) 
	{ 
		while (node != null)
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	}
	public static Q1 del(Q1 ob,int index)
	{
		Node current=ob.head, prev=null;
		if(index==0 && current!=null)
		{
			ob.head=current.next;
		}
		return ob;
	}
	static void deleteNode(int key) 
    {  
        Node temp = head, prev = null;  
        if (temp != null && temp.data == key) 
        { 
            head = temp.next;
            return; 
        } 
        while (temp != null && temp.data != key) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
        if (temp == null) return; 
        prev.next = temp.next; 
    }
	public static void main(String args[])
	{
		Q1 ob = new Q1(); 
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
		for(int i=0;i<n;i++)
		{
			int j=arr[i];
			ob.insert(ob,j);
		} 
		System.out.println("Enter element that you want to delete : ");
		int del=sc.nextInt();
		System.out.println("Given Linked List : ");
		ob.printList(head); 
		System.out.println("Deleting npde : "+del);
		ob.deleteNode(del);
		System.out.println("Modified Linked List : ");
		ob.printList(head);
		System.out.println(" ");
		System.out.println("Deleting first nodeModified Linked List : ");
		ob.del(ob, 0);
		ob.printList(head);
	}

}
