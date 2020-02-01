import java.util.*;
public class MinElemStack {
 static Node top;
 static class Node
 {
	 Node next;
	 int data;
	 Node(int d)
	 {
		 data=d;
	 }
 }
 public static void push(int item)
 {
	 Node newnode=new Node(item);
	 if(top==null)
	 {
		 top=newnode;
		 newnode.next=null;
	 }
	 else
	 {
       newnode.next=top;
       top=newnode;
	 }
 }
 public void display()
 {
	 Node front=top;
	 while(front!=null)
	 {
		 System.out.println(front.data);
		 front=front.next;
	 }
 }
 public void pop()
 {
	 Node front=top;
	 int data=top.data;
	 System.out.println("Element popped:"+data);
	 top=top.next;
 }
 public void minElement()
 {
	 Node curr=top;
	 int min=curr.data;
	 while(curr!=null)
	 {
		 if(curr.data<min)
		 {
			 min=curr.data;
		 }
		 curr=curr.next;
	 }
	 System.out.println("Minimum Element in th stack is:"+min);
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MinElemStack s=new MinElemStack ();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		  int item=sc.nextInt();
		  s.push(item);
		}
    
     // s.pop();
      //s.display();
      s.minElement();
	}

}
