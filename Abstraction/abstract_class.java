package Abstraction;
abstract class office{
	
	public void name() {
		System.out.println("Perficient");
	}
	//A method which is declared as abstract and
	//it does not have implementation is known as an abstract method. 
	abstract  void feedback();
}
class abstract_class extends office{
public void feedback() {
	System.out.println("VISION EXECUTION VALUE");		
	}
	public static void main(String args[]) {
		office off=new abstract_class();
		off.name();
		off.feedback();
	}
	}
