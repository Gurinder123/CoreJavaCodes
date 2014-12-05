package basics;

public class MethodOverloading {

	void method1() {
		System.out.println("Without arguement");
	}

	void method1(int n) {
		System.out.println("With arguement int " + n);
	}

	void method1(String s) {
		System.out.println("With arguement String " + s);
	}

	public static void main(String[] args) {
		MethodOverloading meth = new MethodOverloading();
		meth.method1();
		meth.method1(12345);
		meth.method1("Master");

	}
}
