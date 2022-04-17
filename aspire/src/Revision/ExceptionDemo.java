package Revision;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before exception...");
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
////		catch(NumberFormatException ne) {
////			
////		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		finally {//finally is always called - whether exception arises or not / whether exception is caught or not
			System.out.println("finally called...");
		}
		System.out.println("after exception...");
	}

}
