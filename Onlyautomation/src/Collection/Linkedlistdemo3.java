package Collection;

import java.util.LinkedList;

public class Linkedlistdemo3 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add("maruti");
		l.add("maruti");
		l.add("octa");
		l.add("marcos");

		System.out.println(l);

		l.addFirst("honda");
		l.addLast("hyundai");

		System.out.println(l);

		System.out.println(l.getFirst());
		System.out.println(l.getLast());

		l.removeFirst();
		l.removeLast();

		System.out.println(l);

	}

}
