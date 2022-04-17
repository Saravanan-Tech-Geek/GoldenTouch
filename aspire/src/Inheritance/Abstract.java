package Inheritance;

//A Simple demonstration of abstract.
abstract class AAA {
	abstract void callme();

//concrete methods are still allowed in abstract classes
	void callmetoo() {
		System.out.println("This is a concrete method.");
	}
}

class BBB extends AAA {
	void callme() {
		System.out.println("B's implementation of callme.");
	}
}

class Abstract {
	public static void main(String args[]) {
		BBB b = new BBB();
		b.callme();
		b.callmetoo();
	}
}