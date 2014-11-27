package collection.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {
	public static void main(String r[]) {
		List<String> names = new LinkedList<>(); // String type LinkedList :)
		names.add("Rahul");
		names.add("Ravi"); // adding elements into linkedlist
		names.add("Gurinder");

		// Printing Elements
		System.out.println(names);

	}
}
