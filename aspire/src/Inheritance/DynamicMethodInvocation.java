package Inheritance;
/*As the output shows, the version of callme( ) executed is determined by the type
of object being referred to at the time of the call. Had it been determined by the type of the
reference variable, r, you would see three calls to A’s callme( ) method.*/

public class DynamicMethodInvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA(); // object of type A
		BB b = new BB(); // object of type B
		CC c = new CC(); // object of type C
		AA r; // obtain a reference of type A
		r = a; // r refers to an A object
		r.callme(); // calls A's version of callme
		r = b; // r refers to a B object
		r.callme(); // calls B's version of callme
		r = c; // r refers to a C object
		r.callme(); // calls C's version of callme
	}

}

class AA {
	void callme() {
		System.out.println("Inside A's callme method");
	}
}

class BB extends AA {
// override callme()
	void callme() {
		System.out.println("Inside B's callme method");
	}
}

class CC extends AA {
// override callme()
	void callme() {
		System.out.println("Inside C's callme method");
	}
}