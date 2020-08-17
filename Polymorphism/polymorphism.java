package Polymorphism;
//dynamic method dispatch
 
class compile{
	void display() {
		System.out.println("Name :  Vijayalakshmi M");
	}
}
class run extends compile{
	void display() {
		System.out.println("Designation : ATC");
	}
	int age(int a) {
		return(a);
	}

	int age(int current, int doy) {
		return(current-doy);
	}
	
}
public class polymorphism {
	public static void main(String args[]) {
	compile or=new compile();
	or.display();
	run rt= new run();
	rt.display();
	 System.out.println("Age : "+rt.age(24));
	 //System.out.println("Age : "+rt.age(2020, 1996));
	
	
	
	}
}
