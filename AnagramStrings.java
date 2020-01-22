import java.util.*;
public class AnagramStrings {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  String s1=sc.next();
	  String s2=sc.next();
	  char ch[]=s1.toCharArray();
	  char ch1[]=s2.toCharArray();
	  Arrays.sort(ch);
	  Arrays.sort(ch1);
	  int len=s1.length();
	  int len1=s2.length();
	  int count=0;
	  if(len!=len1)
	  {
		  System.out.println("No");
	  }
	  else
	  {
		  for(int i=0;i<len;i++)
		  {
			  if(ch[i]==ch1[i])
			  {
				  count++;
			  }
		  }
		  if(count==len)
		  {
			  System.out.println("Yes");
		  }
		  else
		  {
			  System.out.println("No");
		  }
	  }
  }
}
