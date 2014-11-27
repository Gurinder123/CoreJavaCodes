package patterns;

// only one object per jvm is a singleton class
public class SingleTonExample {
	static SingleTonExample single = new SingleTonExample();

	// No class can make its object outside this class because of private
	// Constructor
	private SingleTonExample() {
	}

	static SingleTonExample getInstance() {
		return single;
	}
}
