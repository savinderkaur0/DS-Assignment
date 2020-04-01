import java.util.*;
public class Q3 {
	static int fact(int num) 
	{ 
		int fact = 1; 
		
		while(num > 1) 
		{ 
			fact *= num; 
			num -= 1; 
		} 
		return fact; 
		} 
	static int count(int n) 
	{ 
		return fact(2 * n)/(fact(n) * fact(n + 1)) ; 
	} 
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input : ");
		String str=sc.next()+sc.nextLine();
		String str1[]=str.split(" ");
		int n=str1.length;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		 arr[i]=Integer.parseInt(str1[i]);
		}
		int i,k; 
		System.out.println("Output : ");
		for(k = 0; k < n; k++) 
		{ 
			int s = 0; 
			for(i = 0; i < n; i++) 
			{ 
				if (arr[i] < arr[k]) 
					s += 1 ; 
			} 
			int leftBST = count(s) ; 
			int rightBST = count(n - s - 1) ; 
			int totalBST = rightBST * leftBST ; 
			System.out.print(totalBST + " ") ; 
		} 
	} 
}
