package refpack;

class Bird{
	public void sing() {
		System.out.println("ku ku ku ku ku...");
	}
}


// an anonymous inner class will extend any existing inner class or implement any existing interfaces

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird normalobj = new Bird();
		normalobj.sing();
		
		Bird anonymousobj = new Bird() { // created one time use anonymous inner class - as a sub-class of  Bird , since this class doesn't have a name down in the code we can't instantiate another object for this class.
			@Override
			public void sing(){
				System.out.println("keech keech keech...!");
			}
		};
		anonymousobj.sing();
		
		//implement a existing interface
		Runnable runobj = new Runnable() {
			@Override
			public void run() {
				System.out.println("lets start run method...");
			};
		};
		runobj.run();
	}

}

