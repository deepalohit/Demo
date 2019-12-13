
public class constructorDemo {
public constructorDemo() {
	System.out.println("This is dafault constructor");
}
public constructorDemo(int a,int b) {
	System.out.println("2 paramater constructor" + (a+b));
}
public constructorDemo(int a, int b,int c) {
	System.out.println("3 parameter constructor" +a+b+c);
}
	public static void main(String[] args) {
		constructorDemo d= new constructorDemo();
		constructorDemo d1= new constructorDemo(2,2);
		constructorDemo d2= new constructorDemo(2,2,2);
	}

}
