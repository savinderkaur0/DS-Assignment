import java.util.*;

public class Q2 {
	void findCommon(int ar1[], int ar2[], int ar3[]) 
	{
		int i = 0, j = 0, k = 0; 
		while (i < ar1.length && j < ar2.length && k < ar3.length) 
		{
			if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) 
			{ System.out.print(ar1[i]+" "); i++; j++; k++; } 
			else if (ar1[i] < ar2[j]) 
				i++; 
			else if (ar2[j] < ar3[k]) 
				j++; 
			else
				k++; 
		} 
	} 
	public static void main(String args[]) 
	{ 
		Q2 ob = new Q2(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("Input : ");
		String str=sc.next()+sc.nextLine();
		String str1[]=str.split(" ");
		int n=str1.length;
		int ar1[]=new int[n];
		for(int i=0;i<n;i++)
		{
		 ar1[i]=Integer.parseInt(str1[i]);
		}
		String str2=sc.next()+sc.nextLine();
		String str3[]=str2.split(" ");
		int n1=str3.length;
		int ar2[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
		 ar2[i]=Integer.parseInt(str3[i]);
		} 
		String str4=sc.next()+sc.nextLine();
		String str5[]=str4.split(" ");
		int n2=str5.length;
		int ar3[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
		 ar3[i]=Integer.parseInt(str5[i]);
		} 
		System.out.print("Output : "); 
		ob.findCommon(ar1, ar2, ar3); 
	} 
}
