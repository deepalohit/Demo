package collections;
import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable h1=new Hashtable();
		h1.put(1,"D");
		h1.put(2, "E");
		h1.put(3,"U");
		
		Enumeration e = h1.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		Hashtable <Integer,String> h2=new Hashtable<Integer,String>();
		h2.put(9,"P");
		h2.put(8,"O");
		h2.put(7,"T");
			}
}
