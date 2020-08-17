package Polymorphism;
//Static method dispatch
///method overloading
class overload{
	int add (int a, int b) {
		return(a+b);
	}
int add(int a, int b, int c) {
	return(a+b+c);
	}
double add(float a , float b) {
	return(a+b);
}
}
public class compile_time {
public static void main(String args[]) {
	overload load=new overload();
	System.out.println(load.add(15,10));
	System.out.println(load.add(25.5f, 30.0f));
	System.out.println(load.add(10, 15, 20));
}}

