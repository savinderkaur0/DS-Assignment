import java.util.*;
public class RotateLinkedList {
	static Node head;
	public static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
		}
	}
	public   RotateLinkedList insert(  RotateLinkedList rl,int item)
	{
		Node newnode=new Node(item);
		if(rl.head==null)
		{
			head=newnode;
		}
		else
		{
			Node last=rl.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newnode;
			newnode.next=null;
		}
		return rl;
	}
	public static   RotateLinkedList rotateByK(RotateLinkedList rl, int k)
	{
		  RotateLinkedList rll=new RotateLinkedList();
		Node curr=head;
		int count=0;
	     while(curr!=null)
	     {
	    	 count++;
	    	 curr=curr.next;
	     }
	     int a[]=new int[count];
	     Node temp=head;
	     for(int i=0;i<count;i++)
	     {
	    	 a[i]=temp.data;
	    	 temp=temp.next;
	     }
	     for(int m=0;m<k;m++)
	     {
	     int first=a[0];
	     for(int i=0;i<count-1;i++)
	     {
	    	 a[i]=a[i+1];
	     }
	     a[a.length-1]=first;
	     }
	     for(int l=0;l<count;l++)
	     {
	    	 rll.insert(rll,a[l]);
	     } 
	     return rll;
	}
	public static void display(  RotateLinkedList rl)
	{
		Node curr=rl.head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  RotateLinkedList rl=new RotateLinkedList();
	  int n=sc.nextInt();
	  for(int i=0;i<n;i++)
	  {
		  int item=sc.nextInt();
		  rl.insert(rl,item);
	  }
	  int k=sc.nextInt();
	 rl= rl.rotateByK(rl,k);
	  System.out.println("After rotating:");
	  rl.display(rl);
  }
}
