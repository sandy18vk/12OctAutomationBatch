package Interface;

public class Mainclass {

	public static void main(String[] args) {
		
		
		Implementationclass im=new Implementationclass();
		//im.m1();// abstract in I1 , completed in IM class
       // im.m2();//overriden method from I1 to IM class
      //  im.m4(); // own method of Implementationclass
        Implementationclass.m3();// calling static method from implementation class
        
       // im.m10();
     //   im.m11();
	//System.out.println(Interface1.a);
	//System.out.println(Interface2.a);
	}

}
