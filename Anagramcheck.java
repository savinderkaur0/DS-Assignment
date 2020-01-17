import java.util.*;
public class Anagramcheck {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 String name1=sc.next();
	 String name2=sc.next();
	 char a[]=name1.toCharArray();
	 char b[]=name2.toCharArray();
	 int len=name1.length();
	 int len1=name2.length();
	 for(int i=0;i<len;i++)
	 {
		 for(int j=i+1;j<len;j++)
		 {
			 if(a[i]>a[j])
			 {
				 char temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
		 }
	 }
	 for(int i=0;i<len1;i++)
	 {
		 for(int j=i+1;j<len1;j++)
		 {
			 if(b[i]>b[j])
			 {
				 char temp=b[i];
				 b[i]=b[j];
				 b[j]=temp;
			 }
		 }
	 }
	 int count=0;
	 if(len!=len1)
		 System.out.println("Not Anagrams");
	 else 
	 {
		 for(int i=0;i<len;i++)
		 {
			 if(a[i]==b[i])
			 {
				count++; 
			 }
		 }
		 if(count==len)
			 System.out.println("Anagrams");
		 else
		 {
			 System.out.println("Not Anagrams");
		 }
	 }
 }
}
