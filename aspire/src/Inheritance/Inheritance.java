package Inheritance;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		
		System.out.println("super class obj");
		a.i = 10;
		a.j = 20;
		a.show();
		
		System.out.println("sub class obj");
		b.i = 5;
		b.j = 15;
		b.k = 12;
		b.showK();
		
		System.out.println("super class value re-printing"+ a.i);
		
		
	}

}

class A{
	int i,j;
	public void show() {
		System.out.println("i and j" + i + "and" + j);
	}
}

class B extends A{
	int k;
	public void showK() {
		System.out.println("i and j and K "+ i + "and" + j + "and" + k);
		System.out.println("result"+(i+j+k));
	}
}




