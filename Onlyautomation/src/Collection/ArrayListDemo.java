package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//Declaration
		
		 ArrayList mylist=new ArrayList();   
		
		// List mylist = new ArrayList();
		
//		ArrayList<Integer> mylist1=new ArrayList <Integer>();
//		ArrayList<Byte> mylist2=new ArrayList <Byte>();
//		ArrayList<Long> mylist3=new ArrayList <Long>();
//		ArrayList<Float> mylist4=new ArrayList <Float>();
//		ArrayList<Double> mylist5=new ArrayList <Double>();
//		ArrayList<Character> mylist6=new ArrayList <Character>();
//		ArrayList<Short> mylist7=new ArrayList <Short>();
//		
//		ArrayList<String> mylist=new ArrayList<String>();
		
		 mylist.add("x");
		 mylist.add("y");
		 mylist.add("z");
		 mylist.add("a");
		 mylist.add("b");
		 mylist.add("c");
		 
		 ArrayList mylist1 =new ArrayList();
		 mylist1.addAll(mylist1);
		 System.out.println(mylist);
		 
		
		 
		 mylist1.removeAll(mylist);
		 System.out.println(mylist1);
		 
		 // sort --- collections.sort()
		 
		 System.out.println("elements in the arraylist :"+mylist);
         Collections.sort(mylist);
         System.out.println(mylist);
		 
         Collections.sort(mylist,Collections.reverseOrder());
		 
		 System.out.println(mylist);
		 
		 //shuffling - collection
		 
		 Collections.shuffle(mylist);
		 System.out.println(mylist);
		 
		 
	}

}
