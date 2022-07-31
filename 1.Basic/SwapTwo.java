import java.util.*;
class SwapTwo{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value = ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd value = ");
		int b = sc.nextInt();
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("After swapping....");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}