package exception_handling;

import java.io.IOException;

public class ExceptionClass5 {
	
static void m1() throws IOException  {
	
	System.out.println("static method");
	throw new IOException();
	
}
		public static void main(String[] args) throws IOException {
			
			m1();
			throw new IOException();
		}
		

	

}
