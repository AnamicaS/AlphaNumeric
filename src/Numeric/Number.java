package Numeric;

public class Number {

	public static void main(String[]args) {
		String  value="95edfgj47";
		
		String num=" ";
		for( int i=0;i<value.length();i++) {
			char c=value.charAt(i);
			if(c<='0'&&c<='9') {
				System.out.println(c+" ");
			}
				
			System.out.println();
		}
		
	}

}
