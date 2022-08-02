import java.util.*;
class Rect{
	int len,wid;
	void insert(int l , int w){
		len = l; 
		wid = w;
	}
	void display(){
		System.out.println(len*wid);
	}
}
class AreaRect{
	public static void main(String[] args){
		Rect r1= new Rect();
		Rect r2= new Rect();
		r1.insert(5,10);
		r1.display();
		
		r2.insert(5,6);
		r2.display();
	}
}