
public class localGlobalVars {
String name;
int age;
public localGlobalVars(String firstName,int ageLimit) {
	System.out.println(" Variable try" + firstName +""+ageLimit);
}
	public static void main(String[] args) {
		localGlobalVars v= new localGlobalVars("Deepa" , 30);
		
		
	}

}
