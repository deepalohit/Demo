
package array;
import java.util.*;

public class readNprint {
	int limit,k;
	int elements[]=new int[4];
public void read() {
	//System.out.println("Enter the limit");
	
	//limit=sc.nextInt();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array elements");
	for(k=1;k<=3;k++) {
				elements[k]= sc.nextInt();
	}
}
public void print() {
	//System.out.println("The array limit is" +limit);
	System.out.println("The array elements are");
	for(int k=1;k<=3;k++) {
		System.out.println(elements[k]);
	}
}
public static void main(String[] args) {
		readNprint p= new readNprint();
		p.read();
		p.print();

	}

}
