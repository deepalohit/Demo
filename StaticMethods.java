
public class StaticMethods {
static int id=22;
String name="Deepa";
public void add() {
	System.out.println("Add method");
}
public static void minus() {
	System.out.println("Static minus method");
}
	public static void main(String[] args) {
minus();
System.out.println("static variable " +id);
StaticMethods.minus();
System.out.println(StaticMethods.id);
	}

}
