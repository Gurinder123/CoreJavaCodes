package patterns;

interface Guitar {
	void tune();
}

class Gibson implements Guitar {

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("Tune From Gibson");
	}
}

class Yamaha implements Guitar {

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("Tune From Yamaha");
	}
}

class Explorer implements Guitar {

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("Tune From Explorer");
	}
}

class GuitarFactory {

	// use getTune method to get object of type Guitar
	public Guitar getTune(String TuneType) {
		if (TuneType == null) {
			return null;
		}
		if (TuneType.equalsIgnoreCase("Yamaha")) {
			return new Yamaha();
		} else if (TuneType.equalsIgnoreCase("Gibson")) {
			return new Gibson();
		} else if (TuneType.equalsIgnoreCase("Explorer")) {
			return new Explorer();
		}
		return null;
	}
}

public class FactoryPattern {
	public static void main(String[] args) {
		GuitarFactory tuneFactory = new GuitarFactory();

		// get an object of Circle and call its draw method.
		Guitar tune1 = tuneFactory.getTune("Yamaha");

		// call draw method of Circle
		tune1.tune();

		// get an object of Circle and call its draw method.
		Guitar tune2 = tuneFactory.getTune("Gibson");

		// call draw method of Circle
		tune2.tune();

		// get an object of Circle and call its draw method.
		Guitar tune3 = tuneFactory.getTune("Explorer");

		// call draw method of Circle
		tune3.tune();
	}
}
