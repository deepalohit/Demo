package overloading;

public class interfaceDemo implements UKbank ,Brazilbank{
int a=2,b=2,c,z;
	public void addInterest() {
		z=a+b;	
}
	public void addMoney() {
		c=a-b;
		
	}
	public void removeMoney() {
		int z1=a*b;
		System.out.println("Using return type" +z1);
	}
	public static void main(String[] args) {
		interfaceDemo i= new interfaceDemo();
		i.removeMoney();
		//UKbank b= new UKbank();
		
		System.out.println(UKbank.cube(2));
	}

}
