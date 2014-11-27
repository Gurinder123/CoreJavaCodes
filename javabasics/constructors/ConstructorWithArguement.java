package constructors;

public class ConstructorWithArguement {

	// Constructor with string Arguement
	public ConstructorWithArguement(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("I am String Arguement Hello " + s);
	}

	// Constructor with primitive int Arguement
	public ConstructorWithArguement(int s) {
		// TODO Auto-generated constructor stub
		System.out.println("I am int Arguement Hello " + s);
	}

	public static void main(String s[]) {

		/*
		 * below line is a compilation fail because it will search for default
		 * constructor for making new object
		 */
		// ConstructorWithArguement con = new ConstructorWithArguement();

		/*
		 * Now its a fine constructor for making new object because we have a
		 * constructor with string arguement
		 */
		ConstructorWithArguement con1 = new ConstructorWithArguement(
				"Metallica");

		/*
		 * Now its a fine constructor for making new object because as we have a
		 * constructor with primitive int arguement
		 */

		ConstructorWithArguement con2 = new ConstructorWithArguement(123);

	}

}
