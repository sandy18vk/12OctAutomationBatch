package intterview_program;

public class Reverse_Words {

	public static void main(String[] args) {

//		String str1 = "    i am selenium with the Automation   ";
//
//		str1 = str1.trim();
//
//		String[] word = str1.split(" +");
//
//		StringBuffer sb = new StringBuffer();
//
//		for (int i = word.length - 1; i >= 0; i--) {
//
//			sb.append(word[i]).append(" ");
//			
//		}
//
//		System.out.println(sb);
		
		
		String s="This is string";
		String[] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
	
	}

}
