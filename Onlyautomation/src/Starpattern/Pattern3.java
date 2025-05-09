package Starpattern;

public class Pattern3 {
	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) { //

			for (int j = 5; j >= i; j--) {
				System.out.print("* ");

			}
			System.out.println();
		}
		
		
	}

}

// i=1 1<=5  true 1+1=2   for i loop            //  j=5 5>=1 true 5-1=4
// i=2 2<=5  true 2+1=3                         //  j=4 4>=1 true 4-1=3
// i=3 3<=5  true 3+1=4                         //  j=3 3>=1 true 3-1=2
// i=4 4<=5  true 4+1=5                         //  j=2 2>=1 true 2-1=1
// i=5 5<=5  true --5+1=6                         //  j=1 1>=1 true --1-1=0
// i=6 6<=5  false                              //  j=0 0>=1 false