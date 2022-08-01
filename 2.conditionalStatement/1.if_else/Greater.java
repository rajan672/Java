import java.util.*;
class Greater{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value = ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd value = ");
		int b = sc.nextInt();
		if(a>b){
			System.out.println(a + "greater is " + a);
		}else{
			System.out.println("greater is " +b);
		}
	}
}