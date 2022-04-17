package annogenericspack;

import java.lang.reflect.Field;

//https://fluvid.com/videos/detail/8EL-9T-R-KFdv1qVZ#.Yke1FAoTh8c.link
//https://fluvid.com/videos/detail/_LkeEcqk51u3_7pX7#.YlD1E-q_t1s.link
public class AnnotationGenerics {
	public static void main(String[] args) {
		ToothBrush<Paste> pick = ColgateContainer.getBrush();		
		System.out.println(pick.getItem());
	}
}

class ColgateContainer{
	public static ToothBrush<Paste> getBrush() {
		try {
		ToothBrush<Paste>  brush=new ToothBrush<>();
		Class c=brush.getClass();
		Field field=c.getDeclaredField("item");
		field.setAccessible(true);
		Inject in=(Inject)field.getAnnotation(Inject.class);
		if(in!=null) {
			String classname=in.className();
			Paste paste=(Paste)Class.forName(classname).newInstance();
			brush.setItem(paste);
		}
		return brush;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}


abstract class Paste{}
class Colgate extends Paste{}
class Pepsodent extends Paste{}


//Generic PaintBrush
class ToothBrush<T>{
	@Inject(className = "annogenericspack.Colgate")
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}