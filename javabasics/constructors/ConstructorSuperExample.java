package constructors;

class Parent {
	Parent(String s) {
		// default first line is super(); fill by the compiler itself and it
		// will call its super class Constructor which is object class
		System.out.println(s);
	}
}

public class ConstructorSuperExample extends Parent {

	ConstructorSuperExample() {
		super("Metallica"); // it will call the super class constructor with
							// matching arguements
		// TODO Auto-generated constructor stub
		System.out.println("is a Awsome band");
	}

	public static void main(String r[]) {
		ConstructorSuperExample con = new ConstructorSuperExample();

	}
}
