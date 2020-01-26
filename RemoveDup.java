import java.util.*;
public class RemoveDup {
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
	public static RemoveDup insert(RemoveDup li,int item)
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
	public static void display(RemoveDup li)
	{
		Node last=li.head;
		while(last.next!=null)
		{
			System.out.println(last.data);
			last=last.next;
		}
		System.out.println(last.data);
	}
	public static void removeDuplicate(RemoveDup li)
	{
		Node curr=li.head;
		while(curr!=null)
		{
			Node temp=curr;
			while(temp!=null && temp.data==curr.data)
			{
				temp=temp.next;
			}
			curr.next=temp;
			curr=curr.next;
		}
	}
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 RemoveDup li=new RemoveDup();
	 for(int i=0;i<n;i++)
	 {
		 int num=sc.nextInt();
		 li.insert(li,num);
	 }
	 li.removeDuplicate(li);
	 li.display(li);
 }
}
