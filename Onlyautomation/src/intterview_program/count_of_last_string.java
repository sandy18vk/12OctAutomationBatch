package intterview_program;

public class count_of_last_string {

//		public static int countOfLastWord(String str) {
//			String s=str.trim();
//			int count=0;
//			for(int i=s.length()-1;i>=0;i--) {
//			if(s.charAt(i)!=' ') {
//			count++;
//			}
//			else {
//				break;
//			}
//			
//			}
//			return count;
//			
//		}
//		public static void main(String[] args) {
//			String str="   fly me   to   the moon  ";
//			System.out.println(countOfLastWord(str));
//		}
//		
//		

	public static void main(String[] args) {

		String s = "sky is the blue";
		int count = 0;
		char[] ch = s.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			if (s.charAt(i) != ' ') {
				count++;

			} else {
				break;
			}

		}
		System.out.println(count);
	}

}
