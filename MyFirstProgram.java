import java.util.*;
public class MyFirstProgram {
	public static void main(String[] args) {  
	      System.out.print("enter values of a and b\n");
	      Scanner sc=new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      int big = a;
	    if(b>a){
	        big = b;    
	    }
	    System.out.print("the biggest number is "+big);
	} 
}
