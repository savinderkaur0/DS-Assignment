import java.util.*;
public class PalindromeLinkList {
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
	public static  PalindromeLinkList insert( PalindromeLinkList li,int item)
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
	public void checkPal(PalindromeLinkList li)
	{
		Stack<Integer> s1=new Stack<Integer>();
		boolean pal=true;
		Node curr=head;
		while(curr!=null)
		{
			s1.push(curr.data);
			curr=curr.next;
		}
		while(head!=null)
		{
			int num=s1.pop();
			if(head.data==num)
			{
				pal=true;
			}
			else
			{
				pal=false;
				break;
			}
			head=head.next;
		}
		if(pal==true)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 PalindromeLinkList li=new PalindromeLinkList();
		 for(int i=0;i<n;i++)
		 {
			 int num=sc.nextInt();
			 li.insert(li,num);
		 }
		 li.checkPal(li); 
  }
}
