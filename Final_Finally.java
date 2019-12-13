
public class Final_Finally {
static int a=10;
public static void add() {
	int c=a+a;
	System.out.println(c);
}
public static final void arratDemo() {
	 try{
	int a[]=new int[2];
	 a[0]=1;
	 a[1]=2;
	 a[2]=3;
			 System.out.println(a[2]);
		 	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
	 finally {
		 System.out.println("Finally i learnt something :)");
	 }
}
public static final void div() {
	System.out.println("Final method");
}
	public static void main(String[] args) {
add();
	div();
	arratDemo();
	}

}
