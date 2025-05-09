package Casting;

public class CastingInimplicit {

	
		byte b=123;
		short s=3773;
		int t=877;
		long l=566566;
		double d=67.78;
		float f=76.09f;
		char s1='r';
		boolean b1=true;
		String d1="Velocity";
		
		
		void m1() {
			d=t;  // implicit casting L to H
//			System.out.println(d);
//			f=l;
//			System.out.println(f);
//			f=s1;
//			System.out.println(f);
			d=s1;
			System.out.println(d);
			s1=(char) 1239;
			System.out.println(s1);
			
//			boolean b1=true;
//			
//			b1=t; // not possible implicitly as well as explicitly
//			t=b1;
//			
//			String s="this is india";
//			
//			s=t;  // not possible implicitly as well as explicitly
//			t=s;
//			
//			t=(int) d; // explicit casting H to L
//			System.out.println(t);
//		l=(long) d;
//		System.out.println(l);
//		b=(byte) d;
//		System.out.println(b);
//		
		}
	
		public static void main(String[] args) {
			CastingInimplicit c=new CastingInimplicit();
			c.m1();
		}
		
	}		

	


