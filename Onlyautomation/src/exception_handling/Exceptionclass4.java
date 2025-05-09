package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptionclass4 {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		// handle
		try {
			FileReader f=new FileReader("text.csv");
		}catch(FileNotFoundException r) {
			r.printStackTrace();
		}
		
		
		FileReader f=new FileReader("text.csv");
		
		System.out.println("main");
		
		

	}

}
