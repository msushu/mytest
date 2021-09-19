import java.util.*;
public class FibonacciExample {

	public static void main(String[] args) {
		System.out.println("enter 2 numbers\n");
		Scanner sc=new Scanner(System.in);
		int f1=sc.nextInt();
		int f2=sc.nextInt();
		System.out.println("the series is");
		System.out.println(+f1);
		System.out.println(+f2);
		for(int i=1;i<=5;i++) {	
          int f=f1+f2;
          f1=f2;
          f2=f;
          System.out.println(+f);
	}

}
}
