package refpack;

// a single method in interface is considered as abstract method
// an interface which as single abstract method is said to be functional interface 
// lambda is a shortcut for defining an implementation of a functional interface

interface Greeting{
  void greet(String s);
  //void greetmsg(); // it will throw an error , if you try to add another method to functional interface.
}

public class lamdaClass {

	public static void main(String[] args) {
		// usual way of creating obj to implement interfaces...
		//MorningInter obj = new MorningInter();
		//obj.greet();

		//using lambda expression 
		// Lambda expression can be stored in a variable, if the variable type is an interface which has only one method
		Greeting wish = (s) ->{System.out.println("Happy morning"+ "\t" + s +"!!");}; 
		wish.greet("Team");
	}

}

//class MorningInter implements Greeting{
//	public void greet(){
//		System.out.println("Happy morning everyone...!");
//	}
//}