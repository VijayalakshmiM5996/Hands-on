package String_Methods;
	import java.io.*;
	import java.util.*;
public class String_methods {	
	public static void main(String args[]) {
		 char[] ch= {'P','E','R','F','O','R','M','A','N','C','E'};
		 String s=new String(ch);
		 char c=s.charAt(4);
		 String str ="JAVA is the high Level Programming Language"; 
		 String str1="programmming";
		 String st=new String("PERFECT");
		 String st1=new String ("PERFECT");
		 String st2=new String ("perfect");
		 String s1=new String("BETTER");
		 String s2=new String("SINCERE");
		 int a=123,b=321;
		 String s3=("");
		 //CONCAT
		 {System.out.println("concat : "+st.concat(" ").concat(s1).concat(" ").concat(s2));
		 // comapreTo
		 System.out.println("  compareTo : "+s.compareTo(st));
		 //CONTAINS
		 System.out.println("contains : "+str.contains("high Level"));
		 //ENDSWITH
		 System.out.println("endswith : "+str.endsWith("E")+" endswith : "+str.endsWith("e"));
		 //EQUALS
		 System.out.println("equals : "+st.equals(st1)+" equals : "+st.equals(s1));
		 //EQUALSIGNORECASE
		 System.out.println("equalsIgnorecase : "+st.equalsIgnoreCase(st1)+" equalsIgnorecase : "+st.equalsIgnoreCase(st2));
		 //INDEXOF
		 System.out.println("indexOf : "+str.indexOf("the")+" indexOf : "+st.indexOf('P'));
		 //lastIndexOf
		 System.out.println("lastIndexOf : "+str.lastIndexOf('s'));
		 //isEmpty
		 System.out.println("isEmpty : "+s3.isEmpty()+" isEmpty : "+s2.isEmpty());
		 //join
		 String s4=String.join("-","hai","hello");  
		 System.out.println("join : "+s4); 
		 //LENGTH
		 System.out.println("length : "+st1.length());
		 //REPLACE AND REPLACE ALL
		 System.out.println("replace : "+s1.replace('E','U')+"  replaceAll : "+str.replaceAll("the","a"));
		 //startWith
		 System.out.println("startWith : "+s2.startsWith("S")+" startWith : "+s2.startsWith("I"));
		 //subString
		 System.out.println("subString : "+str.substring(23,34));
		 //toLowerCase and toUpperCase
		 System.out.println("toLowerCase : "+str.toLowerCase()+"\n toUpperCase : "+str.toUpperCase()); 
		 //TRIM
		 System.out.println("trim : "+str1.trim()+"language");
		 //valueOf
		 System.out.println("valueOf : "+String.valueOf(a)+" ; valueOf : "+String.valueOf(b));
			StringBuffer buffer=new StringBuffer("Java is Object Oriented Oriented");
			//buffer.replace(," an ");
			System.out.println("STRINGBUFFER : \n append : "+buffer.append(" and it is a programming language ")+"\n  insert : "+buffer.insert(7, " the ")+
			"\n replace : "+buffer.replace(8,11,"an ")+"\n delete : "+buffer.delete(28,37)+"\n reverse : "+buffer.reverse());}
		
		}		
}