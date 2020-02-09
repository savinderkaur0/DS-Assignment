import java.util.*;
import java.util.Arrays;
public class SmallestLargest {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  Arrays.sort(a);
int mid=n/2;
	 for(int i=0, j=n-1;i<n-1 && j>0;i++,j--)
	 {
		
		 if(i==mid)
		 {
			 System.out.println(a[mid]);
			 break;
		 }
		 else
		 {
			 System.out.println(a[i]);
			 System.out.println(a[j]);
		 }
	 }
  }
}
