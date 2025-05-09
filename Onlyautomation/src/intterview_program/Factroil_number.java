package intterview_program;

public class Factroil_number {
	
	public static void main(String[] args) {
		
		int a = 5; // 5*4*3*2*1 = 120
		
		int fact=1;
		
		for(int i=1; i<=a;i++) {
			
			fact = fact*i;
			
		}
		System.out.println("The number of  factorial: "  +fact);
		
		
	}

}
