import java.util.*;
public class ReverseString {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter number of test cases");
	  int test=sc.nextInt();
	 for(int j=0;j<test;j++)
	 {
		  String str=sc.next();
		  String str1[]=str.split("\\.");
		  String str2="";
		  int len=str1.length;
		  for(int i=len-1;i>0;i--)
		  {
			  str2=str2+str1[i]+".";
		  }
		  str2=str2+str1[0];
		  System.out.println(str2);
		  
	  }
	  
  }
}
