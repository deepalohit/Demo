package array;

import java.util.*;
public class ArraySum {
int limit,sum=0,i;
int ar[]=new int[4];
public void total() {
	//System.out.println("Enter the limit");
	Scanner sc=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
//	limit=sc.nextInt();
	System.out.println("Enter 4 array elements");
	for(ar[i]=0;ar[i]<=3;ar[i]++) {
		ar[i]=sc2.nextInt();
sum=sum+ar[i];
	}
	System.out.println("Sum of array" +sum);
}
	public static void main(String[] args) {
		ArraySum s=new ArraySum();
		s.total();
	}

}
