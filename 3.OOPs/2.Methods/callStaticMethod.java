import java.util.*;
class demo{
	static int a=17; //static variables
	static void show(){ //static methods
		System.out.println("Value of A = " + a);
	}
}
class callStaticMethod{
	public static void main(String[] args){
		//1. by using the class name with '.' operater
		demo.show();
		//2. by creating an object of that class
		demo d= new demo(); //demo() is a default constructure
		d.show();
		
	}
}