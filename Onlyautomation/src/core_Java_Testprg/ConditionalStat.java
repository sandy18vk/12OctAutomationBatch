package core_Java_Testprg;

public class ConditionalStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isAccountActive = true;
		int accountBalance = 600000;
		int amountwid1 = 20000;

		if (isAccountActive) {

			if (accountBalance > amountwid1)  // true
			{
				System.out.println("amount wid");
			} else {
				System.out.println("amount not wid");
		    }
			
		    } else {
		        System.out.println("your account is inactive ");

     	    }
		
	}
}
