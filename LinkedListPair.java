import java.util.*;
public class LinkedListPair {
	static Node head;
	static class Node
	{
		Node next;
		Node prev;
		int data;
		Node(int d)
		{
			data=d;
			prev=null;
			next=null;
		}
	}
	public static LinkedListPair insert(LinkedListPair li,int item)
	{
		Node newnode=new Node(item);
		if(head==null)
		{
			newnode.prev=null;
			head=newnode;
		}
		else
		{
			Node  last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newnode;
			newnode.prev=last;
		}
		return li;
	}
	public static void display(LinkedListPair li)
	{
		Node curr=li.head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	public static void pair(LinkedListPair li,int sum)
	{
		Node curr=li.head;
		while(curr!=null)
		{
			Node curr1=curr.next;
			while(curr1!=null)
			{
				if(curr.data+curr1.data==sum)
				{
					System.out.println("("+curr.data+","+curr1.data+")");
				}
				curr1=curr1.next;
			}
			curr=curr.next;
		}
	}
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  LinkedListPair li=new LinkedListPair();
	  int n=sc.nextInt();
	  for(int i=0;i<n;i++)
	  {
		  int item=sc.nextInt();
		  li.insert(li,item);
	  }
	  //li.display(li);
	  System.out.println("enter the value:");
	  int sum=sc.nextInt();
	  li.pair(li,sum);
  }
}
