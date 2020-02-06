import java.util.*;
public class BalancedParantheses {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   for(int i=0;i<t;i++)
	   {
		   String sct=sc.next();
		   char ch[]=sct.toCharArray();
		   int count=0;
		   for(int j=0;j<ch.length-1;j++)
			   if(ch[j]=='(' && ch[j+1]==')')
			   {
				   count=count+2;
			   }
		   System.out.println(count);
	   }
   }
}
