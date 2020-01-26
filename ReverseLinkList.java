import java.util.*;
public class ReverseLinkList {
	static Node head;
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	public static ReverseLinkList insert(ReverseLinkList li,int item)
	{
		Node newnode=new Node(item);
		if(head==null)
		{
			li.head=newnode;
			newnode.next=null;
		}
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newnode;
		}
		return li;
		
	}
	public static void display(ReverseLinkList li)
	{
		Node last=li.head;
		while(last.next!=null)
		{
			System.out.println(last.data);
			last=last.next;
		}
		System.out.println(last.data);
	}
	public static void reverse(ReverseLinkList li)
	{
		Node curr=li.head;
		Node prev=null;
		Node next1=null;
		while(curr!=null)
		{
			next1=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next1;
		}
		while(prev.next!=null)
		{
			System.out.println(prev.data);
			prev=prev.next;
		}
		System.out.println(prev.data);
	}
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 ReverseLinkList li=new ReverseLinkList();
	 for(int i=0;i<n;i++)
	 {
		 int num=sc.nextInt();
		 li.insert(li,num);
	 }
     li.reverse(li);
 }
}
