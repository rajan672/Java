import java.util.*;
class PrintAllEven{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter value of j = ");
		int j = sc.nextInt();
		for (int i = 0; i<=j; i++){
			if(i%2 == 0){
				System.out.println(i + " is Even.");
			}
		}
	}
}