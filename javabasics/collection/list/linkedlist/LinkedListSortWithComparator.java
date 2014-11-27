package collection.list.linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Car {
	String name;
	int modelid;

	Car(String name, int modelid) {
		this.name = name;
		this.modelid = modelid;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return modelid + " " + name;
	}
}

// We need Separate class for Implementing Comparator
class NameSort implements Comparator<Car> {

	@Override
	public int compare(Car obj1, Car obj2) {

		Car c1 = (Car) obj1;
		Car c2 = (Car) obj2;

		// sort by name
		// return c1.name.compareTo(c1.name);

		// sort by id
		return c1.modelid - c2.modelid;
	}
}

public class LinkedListSortWithComparator {
	public static void main(String r[]) {
		List<Car> ls = new LinkedList<>();

		ls.add(new Car("Maruti", 5));
		ls.add(new Car("Skoda", 2));
		ls.add(new Car("Mercedes", 4)); // Storing Car Objects in
										// LinkedList
		ls.add(new Car("Jaguar", 3));
		ls.add(new Car("Tata", 1));

		// sorting the linkedlist contains Car
		Collections.sort(ls, new NameSort());
		System.out.println(ls); // getting name and modelid from overridden
								// toString() otherwise it will print the
								// hexadecimal code of the particular object
	}
}
