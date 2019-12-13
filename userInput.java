import java.util.*;
public class userInput {
	int y[]=new int[4];
	int x;
public void userIn() {
System.out.println("Enter the limit");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	System.out.println("Enter the array elements");
	
	for(int a=0;a<y.length;a++) {
		x=sc.nextInt();
	}
	
}
public void sort() {
	for(int p=0;p<y.length;p++) {
		for(int q=p+1;q<y.length;q++) {
			if(y[p]>y[p+1]) {
			int temp=0;
			y[p]=y[q];
			y[q]=temp;
			
			}	
		}
	}
	System.out.println("The sorted array is");
for(int i=0;i<y.length;i++) {
	System.out.println(y[i]);
}
}

public static void main(String[] args) {
		userInput i = new userInput();
		i.userIn();
		i.sort();
	}


}