package collections;
import java.util.*;

public class LinkedlistConcept {

	public static void main(String[] args) {

		LinkedList <String> ll=new LinkedList();
		ll.add("Hubli");
		ll.add("DWD");
		ll.addFirst("Blore");
		ll.addLast("Mumbai");
		ll.add(1,"insertedValue");
		ll.addFirst("Deepa");
		ll.addLast("Dhanvith");
		ll.remove(0);
		System.out.println(ll);
		//printing methods
		System.out.println("***Using for loop display");
for (int i=0;i<ll.size();i++) {
	System.out.print(ll.get(i));
}
System.out.println("*** using advanced for loop");
for(String str:ll) {
	System.out.print(str);
}
	System.out.println("*** using iterator method");
	Iterator<String> it=ll.iterator();
	while(it.hasNext()) {
		System.out.print(it.next());
	}
	System.out.println("Using while method");
	int num=0;
	while(ll.size()>num) {
		System.out.print(ll.get(num));
		num++;
	}
	}

}
