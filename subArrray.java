package subArray;
import java.util.*;
public class subArrray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-k+1;i++)
		{
			int large=a[i];
			for(int j=i+1;j<i+k;j++)
			{
				if(j<a.length)
				{
				if(a[j]>large)
				{
					large=a[j];
				}
				}
				
			}
			System.out.println(large);
		}
	}

}
