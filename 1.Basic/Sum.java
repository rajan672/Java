import java.util.*;
class Sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); //System.in is a standard input stream  
		System.out.println("Enter 1st values =");
		int a=sc.nextInt(); 
		System.out.println("Enter 2st values =");
		int b=sc.nextInt(); 
		int c = a+b;
		System.out.println("Sum =" + c);
	}
}