package Encapsulation;
class pojo {
private String name;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDesignation() {
	return Designation;
}
public void setDesignation(String designation) {
	Designation = designation;
}
public String getOff_loc() {
	return off_loc;
}
public void setOff_loc(String off_loc) {
	this.off_loc = off_loc;
}
private String Designation;
private String off_loc;

}public class encapsulation{
	public static void main(String args[]) {
		pojo obj=new pojo();
		obj.setName("Vijayalakshmi");
		obj.setAge(23);
		obj.setDesignation("ATC");
		obj.setOff_loc("Guindy");
		System.out.println("Name : "+obj.getName()+"\nAge : "+obj.getAge()+"\nDesignation : "+obj.getDesignation()+"\nOffice_Location : "+obj.getOff_loc());
	}
}
