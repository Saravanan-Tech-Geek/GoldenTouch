package aspire;

public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'H';
		int ascii = ch; // it is possible to store char to int directly 
		// You can also cast char to int
		int num = 69;
		char character = (char) num ;
		System.out.println("The ASCII value of " + num + " is: " + character);
		int castAscii = (int) ch;
		System.out.println("The ASCII value of " + ch + " is: " + ascii);
		System.out.println("The ASCII value of " + ch + " is: " + castAscii);
	}

}
