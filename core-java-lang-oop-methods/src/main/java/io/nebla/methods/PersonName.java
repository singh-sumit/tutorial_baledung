package io.nebla.methods;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class PersonName {

	public String getName(String firstName, String lastName) throws RuntimeException{
		return firstName+" "+lastName;
	}
	
	//Overloadding first method with extra parameters
	public String getName(String firstName, String middleName, String lastName) {
		if(middleName.equals("")) {
			System.out.println("\t\t\t called if block of second method .");
			return getName(firstName,lastName);
		}
		return firstName +" "+middleName+" "+lastName;
	}
	
	public void printFullName(String firstName, String lastName) {
		System.out.println(firstName+ " " + lastName);
	}
	
	public void writeName(String name) throws IOException{
		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
		out.println("Name :"+name);
		out.close();
	}
	
	//static method
	public static String getNameStatic(String firstName, String lastName) {
		return firstName+ " "+ lastName;
	}
	
	//main method
	public static void main(String [] args) {
		//retrive first three method using instance
		PersonName persnObj = new PersonName();
		
		System.out.println("First Method o/p :"+persnObj.getName("Sumit", "Singh"));
		
		System.out.println("Second Method o/p :"+persnObj.getName("Sumit", "Kumar", "Singh"));
		
		System.out.println("Second overloadded method test o/p :"+persnObj.getName("Sumit", "","Singh"));
		
		//calling third method
		persnObj.printFullName("Alexi","Alexander");
		
		//calling write to file method
		try {
			persnObj.writeName("Sumit Kumar Singh");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//calling static method
		System.out.println("Static method o/p :"+PersonName.getNameStatic("Ram", "Krishan"));
		
		
	}
}
