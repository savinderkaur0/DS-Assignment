import java.util.*;
public class RecursiveRemove {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int test=sc.nextInt();
	  for(int i=0;i<test;i++)
	  {
		  String str=sc.next();
		  String s=" ";
		  char ch[]=str.toCharArray();
		  int len=str.length();
		 if(ch[0]!=ch[1])
			 //System.out.println(ch[0]);
			 s=s+ch[0];
		 for(int j=1;j<len-1;j++)
		 {
			 if(ch[j]!=ch[j+1] && ch[j]!=ch[j-1])
			 {
				 //System.out.println(ch[j]);
				 s=s+ch[j];
			 }
		 }
		 if(ch[len-1]!=ch[len-2])
		 {
			 //System.out.println(ch[len-1]);
			 s=s+ch[len-1];
		 }
		 System.out.println(s);;
	  }
  }
}
