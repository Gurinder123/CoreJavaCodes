package basics;

class Parent {
	public void method(String str) {
		System.out.println("Parent " + str);
	}
}

public class MethodOverriding extends Parent {

	public void method(String str) {
		System.out.println("Child " + str);
	}

	public static void main(String[] args) {

		MethodOverriding meth = new MethodOverriding();
		meth.method("Hello");
	}
}
