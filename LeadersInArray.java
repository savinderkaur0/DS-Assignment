import java.util.*;
public class LeadersInArray {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 int b[]=new int[20];
	 int right=a[n-1];
	 int large=a[0];
	 int k=0;
	 for(int i=0;i<n;i++)
	 {
		 if(a[i]>=large)
		 {
			 large=a[i];
			 b[k]=large;
			 k++;
		 }
	 }
	 b[k]=right;
	 k++;
     for(int i=0;i<k;i++)
     {
    	 System.out.println(b[i]);
     }
	
 }
}
