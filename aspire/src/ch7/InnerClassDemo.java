package ch7;

public class InnerClassDemo {
	public static void main(String[] args) {
		Pepsi pepsi=new Pepsi();
		pepsi.sellCola();
		
		Kalimark kali=new Kalimark();
		kali.sellCola();
	}
	
}


abstract class Cola{
	public abstract void makeCola();
}

class Kalimark{
	static class CampaCola extends Cola{
		@Override
		public void makeCola() {
			System.out.println("static make cola called...");
		}
	}
	class Campa extends Cola{
		@Override
		public void makeCola() {
			System.out.println("non static make cola called....");	
		}
	}
	
	
	public void sellCola() {
		new Cola() {
			@Override
			public void makeCola() {
				System.out.println("cola made through anonymous by kalimark..");
			}
		}.makeCola();
		//new CampaCola().makeCola();
	}
}

class Pepsi{
	public void sellCola() {
		Kalimark.CampaCola cola=new Kalimark.CampaCola();//static inner class call
		cola.makeCola();
		
		Kalimark.Campa cola2=new Kalimark().new Campa();//non static inner class call
		cola2.makeCola();
	}
}







