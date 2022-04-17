package ch7;

public class LambdaDemo {
	public static void main(String[] args) {
		
		new LambdaDemo().new MyImp().met();
		
		//anonymous inner class 
		new MyInter(){
			@Override
			public void met() {
				System.out.println("anonymous way of calling....");
			}
		}.met();
		
		//lamda method
		
		MyInter obj = ()->{System.out.println("lambda way of calling....");};
		obj.met();
		
		MyInter2 obj2 = (s,i)->{System.out.println("lambda way of calling...."+ s +":"+ i);};
		obj2.met("Saravanan",1997);
		
	}
	class MyImp implements MyInter {
		@Override
		public void met() {
			System.out.println("inner class implemented MyInter");
		}
	}
	
	
}
//functional interface - an interface with only one method is called functional interface
interface MyInter{
	public void met();
}


interface MyInter2{
	public void met(String s,int i);
}