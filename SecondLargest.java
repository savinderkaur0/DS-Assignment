import java.util.*;
public class SecondLargest {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int len=sc.nextInt();
	 int a[]=new int[len];
	 for(int i=0;i<len;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 for(int i=0;i<len;i++)
	 {
		 for(int j=i+1;j<len;j++)
		 {
			 if(a[i]<a[j])
			 {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			 }
		 }
	 }
	 System.out.println("Largest="+a[0]);
	 System.out.println("Second Largest="+a[1]);
 }
}
