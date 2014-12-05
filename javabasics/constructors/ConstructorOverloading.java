package constructors;

public class ConstructorOverloading {

	// Default Constructor
	public ConstructorOverloading() {
		System.out.println("Default Constructor");
	}

	// Constructor with string Arguement
	public ConstructorOverloading(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("I am String Arguement Hello " + s);
	}

	// Constructor with primitive int Arguement
	public ConstructorOverloading(int s) {
		// TODO Auto-generated constructor stub
		System.out.println("I am int Arguement Hello " + s);
	}

	public static void main(String s[]) {

		/*
		 * It will search for default constructor for making new object
		 */
		ConstructorOverloading con = new ConstructorOverloading();

		/*
		 * Now its a fine constructor for making new object because we have a
		 * constructor with string arguement
		 */
		ConstructorOverloading con1 = new ConstructorOverloading("Metallica");

		/*
		 * Now its a fine constructor for making new object because as we have a
		 * constructor with primitive int arguement
		 */

		ConstructorOverloading con2 = new ConstructorOverloading(123);

	}

}
