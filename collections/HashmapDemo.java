package collections;
import java.util.*;

public class HashmapDemo {

	public static void main(String[] args) {
HashMap<Integer,String> hp= new HashMap<Integer,String>();
hp.put(10,"Hubli");
hp.put(20,"Hyd");
hp.putIfAbsent(30, "Dwd");
hp.put(10,"Deepa");
System.out.println("Hash map elements");
System.out.println("Removing Deepa" +hp.remove(10));
//hp.remove(20);
for(Map.Entry m:hp.entrySet()) {
	System.out.println(m.getKey()+ " "+m.getValue());
}
		
	}

}
