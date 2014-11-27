package constructors;

public class ConstructorChaining {

	public ConstructorChaining() {
		// this basically used for constructor chaining and will call the
		// matching arguement Constructor
		this("Metallica", 1);
		System.out.println("Non Arguement");
	}

	public ConstructorChaining(String s, int n) {
		this(1);
		System.out.println(s + " Arguement " + n);
	}

	public ConstructorChaining(int n) {
		System.out.println("int Arguement " + n);
	}

	public static void main(String r[]) {
		ConstructorChaining con = new ConstructorChaining();

	}
}
