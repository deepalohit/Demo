	package collections;
import java.util.*;
public class arrayList {

	public static void main(String[] args) {

		ArrayList a= new ArrayList();
		a.add(10);
		a.add("Deepa");
		a.add(12.33);
		System.out.println(a.get(2));
		System.out.println(a.get(0));
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			ArrayList <String> ar= new ArrayList<String> ();
			ar.add("Hubli");
			ar.add("DWD");
		}
	}

}
