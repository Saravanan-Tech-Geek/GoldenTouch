package ClassFiles;

public class RetrunMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetrunMethods obj = new RetrunMethods();
		
		int a = obj.call();
		
		System.out.println(a);
		
		
		System.out.println(obj.call(1));
		
		System.out.println(obj.getName(100));
	}
	
	int call() {
		return 100;
	}
	
	short call(int i) {
		if(i==10) {
			return 10;
		}
		else {
			return 100;
		}
	}
	
	boolean run() {
		return true;
	}
	
	String getName(int rollno) {
		switch(rollno) {
		case 100:{
			return "abdulllah";
			//break;
		}
		case 200:{
			return "amar";
			//break;
		}
		default:{
			return "noman";
		}
		}
	}

}
