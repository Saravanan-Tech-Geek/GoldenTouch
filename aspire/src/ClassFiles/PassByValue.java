package ClassFiles;

public class PassByValue {	
	
	public static void main(String[] args) {
		Laddu laddu=new Laddu();//complex type
		
		PassByValue vd=new PassByValue();
		
		//PASS BY VALUE
		System.out.println("before passing ..:"+laddu.size);
		vd.Pbv(laddu.size);
		System.out.println("after passing ..:"+laddu.size);
		
		
		//PASS BY REFERENCE
		
		System.out.println("PBR-before passing ..:"+laddu.size);
		vd.pbr(laddu);
		System.out.println("PBR-after passing ..:"+laddu.size);
		
	}
	
	void Pbv(int size) {
		size=5;
	}
	
	void pbr(Laddu lad) {
		lad.size=5;
	}
}
class Laddu{
	
	int size=10;//primitive type
}