package intterview_program;

public class Reverse_Number {
	
	public static void main(String[] args) {
		
		int num= 121;
		int number=num;
		   int rev=0;
			 while(num!=0) {
				 int rem= num%10; //4
				 rev=rev*10+rem; // 654
				 num=num/10; //1234
				 
			 }
			 System.out.println(rev);
			 
			 if(number==rev) {
				 System.out.println("Number is palindrom");
			 }else
				 System.out.println("Number is not palindrom");
	}

}
