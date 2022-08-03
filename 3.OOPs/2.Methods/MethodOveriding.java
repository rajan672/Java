import java.util.Scanner;
class Examples{
	int a,d,e;
	double b;
	String c;
	//In terms of 'types of paremeter'
	public void pass(int a){
		System.out.println("Value of A = " +a);
	}
	public void pass(int a , double b ){
		System.out.println("Value of A = " +a);
		System.out.println("Value of B = " +b);
	}
	public void pass(int a , double b , String c){
		System.out.println("Value of A = " +a);
		System.out.println("Value of B = " +b);
		System.out.println("Value of C = " +c);
	}
	
	//in terms of 'number of parameters'
	public void pass(int a , int d){
		System.out.println("Value of A = " +a);
		System.out.println("Value of B = " +d);
	}
	public void pass(int a , int d , int e ){
		System.out.println("Value of A = " +a);
		System.out.println("Value of B = " +d);
		System.out.println("Value of B = " +e);
	}
}
class MethodOveriding{
	public static void main(String[] args){
		Examples e1 = new Examples();
		e1.pass(12);
		e1.pass(15,12.32);
		e1.pass(6,23.3,"Rajan");
		
		e1.pass(10,20);
		e1.pass(40,50,60);
	}
}