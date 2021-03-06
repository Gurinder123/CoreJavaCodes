package collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	String name;
	int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name;
	}

	@Override
	public int compareTo(Employee o) {
		Employee emp = (Employee) o;
		// sort by name
		return this.name.compareTo(emp.name);
		// sort by id
		// return this.id - emp.id;
	}
}

public class ArrayListSortWithComparable {
	public static void main(String r[]) {
		List<Employee> ls = new ArrayList<>();

		ls.add(new Employee("Gurinder", 1));
		ls.add(new Employee("Gaurav", 2));
		ls.add(new Employee("Ankit", 3)); // Storing Employee Objects in
											// ArrayList
		ls.add(new Employee("Gurinder", 3));
		ls.add(new Employee("Rohit", 5));

		// sorting the arraylist contains Employee
		Collections.sort(ls);
		System.out.println(ls); // getting name and id from overridden
								// toString() otherwise it will print the
								// hexadecimal code of the particular object
	}
}
