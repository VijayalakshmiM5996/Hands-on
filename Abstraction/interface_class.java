package Abstraction;
interface Abstraction {
 abstract void display();
 }
interface Multiple_Inheritance{
	void show();
	void display();
}
class interface_class implements Abstraction, Multiple_Inheritance {
	public void display() {
		System.out.println("Abstraction");
	}
	public void show() {
		System.out.println("Multiple_Inheritance");
	}	
	public static void main(String args[]) {
		interface_class i= new interface_class();
		i.display();
		i.show();
	
	}
}