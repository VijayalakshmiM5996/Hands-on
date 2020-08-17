package Polymorphism;
//dynamic method dispatch
//override 
class override{
	void display() {
		System.out.println("Name :  Vijayalakshmi");
	}
}
class runtime extends override{
	void display() {
		System.out.println("Age : 23");
		System.out.println("Designation : ATC");
	}
	}
	public class run_time {
	public static void main(String args[]) {
	override or=new override();
	or.display();
	runtime rt= new runtime();
	rt.display();
	}
}
