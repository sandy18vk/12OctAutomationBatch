package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet<Integer> evennum = new HashSet<Integer>();
		Set<Object> se=new HashSet<>();
		
		evennum.add(2);
		evennum.add(4);
		evennum.add(8);
		evennum.add(2);
		
		System.out.println(evennum);
		// add all()
		HashSet<Integer> num =new HashSet<Integer>();
		num.addAll(evennum);
		num.add(10);
		
		System.out.println(num);
		
		// remove 
		
		num.removeAll(evennum);
		System.out.println(num);
		

	}

}
