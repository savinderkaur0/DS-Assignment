import java.util.*;
import java.util.HashMap;
public class PhoneQuery {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 sc.nextLine();
	 HashMap<String,String> h=new HashMap<>();
	 for(int i=0;i<n;i++)
	 {
		 String value=sc.nextLine();
		 String key=sc.nextLine();
		 h.put(value,key);
	 }
     System.out.println("Enter number of queries:");
     int q=sc.nextInt();
     for(int i=0;i<q;i++)
     {
    	 System.out.println("Enter name:");
    	 String name=sc.next();
        if(h.containsKey(name))
        {
        	
        	System.out.println(name+"="+h.get(name));
        }
        else
        {
        	System.out.println("not found");
        }
       
     }
 }
}
