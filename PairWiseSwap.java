import java.util.*;
public class PairWiseSwap {
	static Node head;
	static class Node
	{
		Node next;
		int data;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static PairWiseSwap insert(PairWiseSwap ps,int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			newnode.next=null;
		}
		else
		{
			Node curr=head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=newnode;
		}
		return ps;
	}
	public static void display()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	public static Node  pairWise(Node head)
	{
		Node curr=head;
		Node curr1=head;
		Node prev=null;
		Node next=null;
		while(curr!=null && curr1.next!=null)
		{
			int num=curr.data;
			curr.data=curr1.next.data;
			curr1.next.data=num;
			curr=curr.next;
			curr=curr.next;
			curr1=curr1.next;
		}
		return head;
	}
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   PairWiseSwap ps=new PairWiseSwap();
	   int n=sc.nextInt();
	  for(int i=0;i<n;i++)
	  {
		  int item=sc.nextInt();
		  ps.insert(ps,item);
	  }
	  ps.pairWise(head);
	  ps.display();
   }
}
