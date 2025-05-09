package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		//ArrayList<Generics> refvariable = new ArrayList<Generics>();
		
		//RTP
		
//		List<String> ref= new ArrayList<String>();
//		
//		List<Object> arr1=new ArrayList<Object>(); // all type data
//		
//		List arr3 = new ArrayList(); // all type data

		ArrayList al=new ArrayList();
		
		al.add("selenium");
		al.add(null);
		al.add(null);
		
		// to add the data in list/al
		System.out.println(al);
		System.out.println(al);
		al.add(1, "velocity");
		System.out.println(al);
		
		System.out.println(al.size());
		al.remove("selenium");
		al.remove(2);
		System.out.println(al);
		
		al.add(2, "sandy");
		System.out.println(al);
		
		al.get(1);
		System.out.println(al.get(1));
		
		al.set(2, "boom");
		System.out.println(al);
		
		// contains method 
		
		System.out.println(al.contains("boom"));
	    
		ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Mango");

        // Check if list1 contains all elements of list2
        boolean result = list1.containsAll(list2); // compare to both the list1 and list2 

        System.out.println(result);  //
        
		System.out.println(al.isEmpty());
	
		System.out.println("using diff for loops");
		for(int i=0; i<al.size();i++) {
		
			System.out.println(al.get(i));
		}
		
//	   for(Object f:al) {
//		   System.out.println(f);
//	   }	   
//		   Iterator it= al.iterator();
//		   		while(it.hasNext()) {
//			   System.out.println(it.hasNext());
//		   }
		
		ArrayList<Integer> givenList = new ArrayList<>();
        givenList.add(1);
        givenList.add(2);
        givenList.add(4);
        givenList.add(5);

//        int n = 5;  // We expect numbers from 1 to 5
//
//        for (int i = 1; i <= n; i++) {
//            if (!givenList.contains(i)) {
//                System.out.println("Missing number is: " + i);
//            }
//   }
	
       for(int num: givenList ) {
    	   if (givenList.contains(num)) {
    		   System.out.println("Missing number is: " + num);   
       }
       }
		
	}


}