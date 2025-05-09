package Z_Daily_practice;

public class Traditional_switch_case {

	public static void main(String[] args) {

		
		  String a="";
		  
		  switch(a) {
		  
		  case "monday" :
			  System.out.println("today is monday"); 
		  break;
		  
		  case "Tue" : 
			  System.out.println("today is Tue"); 
		  break;
		  case "wed" :
			  System.out.println("today is wed");
		  break; 
		  case "Thus" :
			  System.out.println("today is Thus"); 
		  break; 
		  case "Friday" :
		       System.out.println("today is Friday"); 
		       break;
		  
		  
		  default: System.out.println("Today is saturday");
		  
		  }
		  
//***********************************************************************************************************************		 

		
		  System.out.println("Chose the operator: +,-,*,/,%"); int opertaor = '*' ;
		  
		  int a1=2; int b=3;
		  
		  int result='0';
		  
		  switch(opertaor) {
		  
		  case '+': result=a1+b; 
		  System.out.println("Addition:"+result);
		  break; 
		  case'*': result=a1*b; 
		  System.out.println("mul:"+result); 
		  break;
		  case '/': result=a1/b; 
		  System.out.println("div:"+result); 
		  break;
		  default :System.out.println("non of above:"+result); }
		  
//************************************************************************************************		 

		System.out.println("chose the opertaors ");
		int operator = '*';

		int num1 = 20;
		int num2 = 30;

		int result1=switch (operator) {
		case '+' ->num1+num2;
		case '-' ->num1-num2;
		case '*' ->num1*num2;
		
		
		default ->
		throw new IllegalArgumentException("Unexpected value: " + operator);
		};
		System.out.println("the operation :" + result1);

	}
}