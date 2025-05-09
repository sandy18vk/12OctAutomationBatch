package core_Java_Testprg;

public class Variables_memory {

	int a = 10;
	static int b = 20;

	Variables_memory() {
		a = 21;
		b = 22;
	}

	Variables_memory(int k1) {
		a = 31;
		b = 32;

	}

	Variables_memory(char k3) {
		a = 51;
		b=52;
		
	}

	public static void main(String args[]) {
		Variables_memory re=new Variables_memory();
		System.out.println(re.a);
		System.out.println(re.b);
		Variables_memory rt=new Variables_memory(20);
		System.out.println(rt.a);
		System.out.println(rt.b);
		Variables_memory rs=new Variables_memory('m');
		System.out.println(rs.a);
		System.out.println(rs.b);
		

	}

}
