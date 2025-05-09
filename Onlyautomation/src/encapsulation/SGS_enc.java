
package encapsulation;

public class SGS_enc {

	public static void main(String[] args) {

		SGS_encapsulation op = new SGS_encapsulation();

	System.out.println(op.getAge()); // 12
		op.setAge(90);
		System.out.println(op.getAge());
		
		op.setMobile(976382452);
		System.out.println(op.getMobile());
		
		op.setName("oops");
		System.out.println(op.getName());
		
		
		
	}

}
