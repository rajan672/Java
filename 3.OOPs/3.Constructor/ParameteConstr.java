class Student{
	int id;
	String name;
	
	Student(int i , String n){
		id = i;
		name = n;
	}
	void display(){
		System.out.println(id + " " + name);
	}
}
class ParameteConstr{
	public static void main(String[] args){
		Student s1 = new Student(101,"Rajan");
		Student s2 = new Student(102,"Raj"),s3 = new Student(103,"Rio");;
		s1.display();
		s2.display();
		s3.display();
	}
}