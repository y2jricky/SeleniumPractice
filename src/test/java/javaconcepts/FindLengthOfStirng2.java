package javaconcepts;

public class FindLengthOfStirng2 {
	public static void main(String[] args) {
		
		String s = "BISWAJOTJKjkjkaksj";
		int  len = findStrLength(s);
		System.out.println(len);

	}
	
	public static int findStrLength (String s) {
		int count = 0;
		char [] chArr = s.toCharArray();
		for (char c : chArr ) {
			count++;
		}
		return count;
	}

}
