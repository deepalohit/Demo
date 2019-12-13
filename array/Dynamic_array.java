
package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Dynamic_array {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
int size= sc.nextInt();
String myArray[] = new String[size];
System.out.println("Enter the element of the array");
for(int i=0;i<myArray.length;i++) {
	myArray[i]=sc.next();
}
System.out.println(Arrays.toString(myArray));
ArrayList <String> myList = new ArrayList<String>(Arrays.asList(myArray));
System.out.println("Enter the element to be entered");
String element =sc.next();
myList.add(element);
myArray=myList.toArray(myArray);
System.out.println(Arrays.toString(myArray));
	}

}
