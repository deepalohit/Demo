package overloading;

public class overloadingSample {
public void sum() {
	System.out.println("Sample sum prg without parameters");
	
}
public void sum(int a ,int b) {
	System.out.println("sum of 2 numbers" +(a+b));
}
public void sum(int a,int b,int c) {
	System.out.println("sum of 3 numbers"+(a+b+c));
}
public void sum(float a, float b) {
	System.out.println("sum of 2 float numbers" +(a+b));
}
public void main() {
	System.out.println("Main method overloaded");
}
	public static void main(String[] args) {

		overloadingSample s= new overloadingSample();
		s.sum();
		s.sum(2, 2);
		s.sum(2.5f, 2.5f);
		s.sum(2, 2, 2);
		s.main();
	}

}
