package overloading;

public class interfaceDemo1 implements Shapes,Shapes1 {
public void triangle() {
	System.out.println("Method of shapes interface");
}
	public void circle() {
		System.out.println("Method of circle");
	}
	public void square() {
		System.out.println("Method of square ,shapes");
	}
	public static void main(String[] args) {
		interfaceDemo1 i=new interfaceDemo1();
		i.triangle();
		i.circle();
		i.square();
		
		
	}

}
