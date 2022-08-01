import java.util.*;
class Greater3value{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("1st value = ");
		int a = sc.nextInt();
		System.out.println("2nd value  = ");
		int b = sc.nextInt();
		System.out.println("3rd value = ");
		int c = sc.nextInt();
		if(a>b && a>c){
			System.out.println("Greater value is " +a);
		}else if(b>a && b > c){
			System.out.println("Greater value is " +b);
		}else{
			System.out.println("Greater value is " +c);
		}
	}
}