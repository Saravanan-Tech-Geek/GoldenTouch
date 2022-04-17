package Inheritance;

class Box {
	double width;
	double height;
	double depth;

	// construct clone of an object
	Box(Box ob) { // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// constructor used when all dimensions specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// constructor used when no dimensions specified
	Box() {
		width = -1; // use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // box
	}

	// constructor used when cube is created
	Box(double len) {
		width = height = depth = len;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}

// Here, Box is extended to include weight.
class BoxWeight extends Box {
//	double weight;
//
//// weight of boxa
////constructor for BoxWeight
//	BoxWeight(double w, double h, double d, double m) {
//		width = w;
//		height = h;
//		depth = d;
//		weight = m;
//	}
	
	/*super demo*/
	double weight; // weight of box
	// construct clone of an object
	BoxWeight(BoxWeight ob) { // pass object to constructor
	super(ob);
	weight = ob.weight;
	}
	// constructor when all parameters are specified
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d); // call superclass constructor
		weight = m;
		}
		// default constructor
		BoxWeight() {
		super();
		weight = -1;
		}
		// constructor used when cube is created
		BoxWeight(double len, double m) {
		super(len);
		weight = m;
		}
		}

class MemberAccess {
	public static void main(String args[]) {
//		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
//		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
//		double vol;
//		vol = mybox1.volume();
//		System.out.println("Volume of mybox1 is " + vol);
//		System.out.println("Weight of mybox1 is " + mybox1.weight);
//		System.out.println();
//		vol = mybox2.volume();
//		System.out.println("Volume of mybox2 is " + vol);
//		System.out.println("Weight of mybox2 is " + mybox2.weight);

//		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
//		Box plainbox = new Box();
//		double vol;
//		vol = weightbox.volume();
//		System.out.println("Volume of weightbox is " + vol);
//		System.out.println("Weight of weightbox is " + weightbox.weight);
//		System.out.println();
//		// assign BoxWeight reference to Box reference
//		plainbox = weightbox;
//		vol = plainbox.volume(); // OK, volume() defined in Box
//		System.out.println("Volume of plainbox is " + vol);
		/*
		 * The following statement is invalid because plainbox does not define a weight
		 * member.
		 */
		// System.out.println("Weight of plainbox is " + plainbox.weight);
		/*
		 * It is important to understand that it is the type of the reference
		 * variable�not the type of the object that it refers to�that determines what
		 * members can be accessed. That is, when a reference to a subclass object is
		 * assigned to a superclass reference variable, you will have access only to
		 * those parts of the object defined by the superclass. This is why plainbox
		 * can�t access weight even when it refers to a BoxWeight object. If you think
		 * about it, this makes sense, because the superclass has no knowledge of what a
		 * subclass adds to it. This is why the last line of code in the preceding
		 * fragment is commented out. It is not possible for a Box reference to access
		 * the weight field, because Box does not define one.
		 */

		/* superclass implementation */
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		BoxWeight mybox3 = new BoxWeight(); // default
		BoxWeight mycube = new BoxWeight(3, 2);
		BoxWeight myclone = new BoxWeight(mybox1);
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		System.out.println("Weight of mybox2 is " + mybox2.weight);
		System.out.println();
		vol = mybox3.volume();
		System.out.println("Volume of mybox3 is " + vol);
		System.out.println("Weight of mybox3 is " + mybox3.weight);
		System.out.println();
		vol = myclone.volume();
		System.out.println("Volume of myclone is " + vol);
		System.out.println("Weight of myclone is " + myclone.weight);
		System.out.println();
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
		System.out.println("Weight of mycube is " + mycube.weight);
		System.out.println();
	}
}