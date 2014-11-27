package collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

class Student {
	String name;
	int rollNo;

	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollNo + " " + name;
	}
}

public class ArrayListExample2 {
	public static void main(String r[]) {
		List<Student> ls = new ArrayList<>();

		ls.add(new Student("Gurinder", 1));
		ls.add(new Student("Gaurav", 2));
		ls.add(new Student("Rahul", 3)); // Storing Employee Objects in
											// ArrayList
		ls.add(new Student("Gurinder", 3));
		ls.add(new Student("Rohit", 5));

		System.out.println(ls); // getting name and roll number from overridden
								// toString() otherwise it will print the
								// hexadecimal code of the particular object
	}
}
