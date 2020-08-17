package Inheritance;
class Bank {
public void fixed() {
	System.out.println("  * Fixed Deposit");
}}
class Govtbank extends Bank{
	public void current() {
		System.out.println("  * Current Deposit");
	}}
  class PrivateBank extends Govtbank{
	  public void savings() { 
		  System.out.println("  * Saving deposit"); }
  }
  class postoffice extends Govtbank{
	  public void ps() {
		  System.out.println("  * Post office");
	  }} 

 class Inheritance{
	public static void main(String args[]) {
		System.out.println("Single Inheritance");
		//single inheritance
		Govtbank govt= new Govtbank();
		govt.fixed();
		govt.current();
		//Multilevel inheritance
		System.out.println("Multilevel Inheritance");
		PrivateBank pvt=new PrivateBank();		
		pvt.savings();
		pvt.fixed();
		pvt.current();
		//Hierarchical
		System.out.println("Hierarchical Inheritance");
		postoffice post =new postoffice();
		post.ps();
		post.current();
		post.fixed();
		//post.savings(); compilation problem is occur
		
		
		
		
	}
}
