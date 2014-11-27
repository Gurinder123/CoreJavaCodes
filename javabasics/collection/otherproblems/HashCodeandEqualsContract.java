package collection.otherproblems;

import java.util.HashSet;

class Student {
	int rollNo;
	String name;

	Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	// it will create a unique hashcode for each Student object
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.rollNo;
	}

	// it will check for duplicate rollno in each Student object
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student st = (Student) obj;
		return this.rollNo == st.rollNo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + rollNo;
	}
}

public class HashCodeandEqualsContract {
	public static void main(String r[]) {
		HashSet<Student> hs = new HashSet<>();

		hs.add(new Student(1, "Gurinder"));
		hs.add(new Student(2, "Rahul"));
		hs.add(new Student(3, "James"));
		hs.add(new Student(4, "Ramesh"));
		hs.add(new Student(5, "Ravi"));
		hs.add(new Student(5, "Raghu"));

		System.out.println(hs);
	}
}
