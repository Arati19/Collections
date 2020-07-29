package Collection_demo;

import java.util.ArrayList;
import java.util.Collections;

public class List_demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> mylist = new ArrayList<>();
		mylist.add(1);
		mylist.add(10);
		mylist.add(7);
		mylist.add(488);
		mylist.add(245);
		mylist.add(979);
	
	 Integer  i = Collections.max(mylist);
	 System.out.println("Maximum Number in Collections is : " + i);
//		ArrayList<Integer>  i = mylist ;
//	while (Collections.max(mylist) != null){
//		System.out.println("Maximum Number in Collections is : " + i);
//	   mylist++;
//	} 
//	
//	
	 int a = mylist.size();
	 a--;
	 while(a>=0){
		 System.out.println(" Numbers in Collections are : " + mylist.get(a));
		 a--;
	 }
	}   
	
}
