package Inheritance;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second sec = new Second(1,2,3);
		sec.show();
	}

}

class First{
	int i , j;
	First(int a,int b){
		i = a;
		j = b;
	}
	public void show() {
		System.out.println("show"+i +" "+j);
	}
}

class Second extends First{
	int k;
	Second(int a , int b ,int c){
		super(a,b);
		k = c;
	}
	public void show() {
		super.show();
		System.out.println("show K value"+" "+k);
	}
}