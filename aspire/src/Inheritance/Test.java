package Inheritance;
//https://www.codingninjas.com/blog/2021/07/03/what-is-compile-time-and-run-time-polymorphism-in-java/

//refer above link for Polymorphism

//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Test obj = new Test();
//		obj.amethod();
//	}
//	public void amethod() {
//		double io = 0334;
//		System.out.println(io);
//		
//		float i = 69.5f;
//		char c = (char)i;
//		System.out.println(c);
//		
//		char cs = 'A';
//		int ii = (int) cs;
//		System.out.println("char conversion"+ii);
//		
//	}
//
//}

//Java Runtime Polymorphism with Data Member
//A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.
//In the example given below, both the classes have a data member speedlimit. We are accessing the data member by the 
//reference variable of Parent class which refers to the subclass object. Since we are accessing the data member which is
//not overridden, hence it will access the data member of the Parent class always. 

class Test {
	int speedlimit = 90;
}

class Honda3 extends Test {
	int speedlimit = 150;

	public static void main(String args[]) {
		Test obj = new Honda3();
		System.out.println(obj.speedlimit);// 90
	}
}