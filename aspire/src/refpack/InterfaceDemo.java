package refpack;

interface Draw{
	int m = 4; // default variables declared inside interface are public , static and final.
	void draw();
	default void msg(){System.out.println("default method");}  
	static int demo(int x) {
		return x+x;
	}
}

class Circle implements Draw{
	public void draw() {
		System.out.println("circle class implemented");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		obj.draw();
		obj.msg();
		int result = Draw.demo(3);
		System.out.println("Result:"+ result);
		
	}

}
