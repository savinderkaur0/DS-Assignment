import java.util.*;
public class PythaGoras {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number of test cases");
	  int test=sc.nextInt();
	  System.out.println("Enter number of elements in the array");
	  int len=sc.nextInt();
	  int arr[]=new int[len];
	  for(int i=0;i<len;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  int flag=0;
	  for(int i=0;i<len;i++)
	  {
		  for(int j=i+1;j<len;j++)
		  {
			  for(int k=j+1;k<len;k++)
			  {
				 if(Math.pow(arr[i], 2)+Math.pow(arr[j], 2)==Math.pow(arr[k], 2)||Math.pow(arr[j], 2)+Math.pow(arr[k], 2)==Math.pow(arr[i], 2)||Math.pow(arr[i], 2)+Math.pow(arr[k], 2)==Math.pow(arr[j], 2))
				 {
					 flag++;
				 }
			  }
		  }
	  }
	  if(flag>=1)
	  {
		  System.out.println("Yes");
	  }
	  else
	  {
		  System.out.println("No");
	  }
  }
}
