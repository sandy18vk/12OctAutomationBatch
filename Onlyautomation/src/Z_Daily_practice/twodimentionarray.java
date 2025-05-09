package Z_Daily_practice;

public class twodimentionarray {

	public static void main(String[] args) {
		
		//declaration array
		
		// approach 1
		int a[][]=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		// appro 2
		
		int a1[][]= {{1,2,3}, {4,5,6},{7,8,9}};
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		System.out.println(a[2][1]);
		System.out.println();
		
		//noraml for
		
		for(int i=0; i<=a.length-1;i++ ) {
			for(int j=0;j<=a[i].length-1;j++) {
				
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		// for-each loop
		
		for(int d[]: a) {
			
			for(int f:d ) {
				System.out.print(f +"  ");
			}
			System.out.println();
		}
		

	}

}
