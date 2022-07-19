package collections;
import java.util.*;
public class AllCollectionsTypes {

	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Pune");
		city.add("Banglore");
		System.out.println(city);
		
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> vecna = new Vector<Integer>();
		vecna.addElement(10);
		vecna.addElement(20);
		vecna.addElement(30);
		System.out.println(vecna);
		
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> names = new LinkedList<String>();
		names.add("ABC");
		names.add("XYZ");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\n");
		System.out.println("HashSet");
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(100);
		hash.add(200);
		hash.add(300);
		System.out.println(hash);

		System.out.println("\n");
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();
		link.add(1000);
		link.add(2000);
		link.add(3000);
		System.out.println(link);
	}

}
