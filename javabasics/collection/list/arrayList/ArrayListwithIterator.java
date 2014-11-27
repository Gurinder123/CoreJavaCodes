package collection.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListwithIterator {
	public static void main(String r[]) {
		List<String> names = new ArrayList<>(); // String type List :)
		names.add("Rahul");
		names.add("Ravi"); // adding elements
		names.add("Gurinder");
		names.add("Ramesh"); // adding elements
		names.add("Kunal");
		names.add("Jaimes"); // adding elements
		names.add("Rani");

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
