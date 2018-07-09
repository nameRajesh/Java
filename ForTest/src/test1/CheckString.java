package test1;

public class CheckString {
	
	public static void main(String[] args) {
		
		String s = "abcdef";
		String a = reverseString(s);
		System.out.println(a);
	}

	private static String reverseString(String s) {
		
		StringBuffer sb = new StringBuffer();
		for(int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

}
