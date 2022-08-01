import java.util.*;
class AlphabetVowel{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter any alphabet = ");
		//char num1 = 'b'; //sc.nextLine();
		String num1 = sc.nextLine(); //nextLine ...takes string input.
		switch(num1){
			case "a":
				System.out.println(num1 + " is Vowel");
				break;
			case "e":
				System.out.println(num1 + " is Vowel");
				break;
			case "i":
				System.out.println(num1 + " is Vowel");
				break;
			case "o":
				System.out.println(num1 + " is Vowel");
				break;
			case "u":
				System.out.println(num1 + " is Vowel");
				break;
			default:
				System.out.println(num1 + " is Constant.");
		}
	}
}