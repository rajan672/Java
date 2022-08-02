import java.util.*;
class Student{
	int id;
	String name;
	void insert(int i , String n){
		id = i;
		name = n;
	}
	void display(){
		System.out.println(id + " " + name);
	}
}
class CreatMethod{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		//s1.id = 101;
		//s1.name= "Rajan";
		s1.insert(101,"Rajan");
		s1.display();
		
		s2.insert(102, "Sumit");
		s2.display();
	}
}