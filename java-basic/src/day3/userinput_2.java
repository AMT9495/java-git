package day3;

import java.io.Console;

public class userinput_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();
		String name = console.readLine("Enter Name : ");
		char[] pass = console.readPassword("Enter password: ");
		double salary = Double.parseDouble(console.readLine("Enter salary: "));
		int age = Integer.parseInt(console.readLine("Enter age: "));
		
		System.out.println("Your name is " + name);
		System.out.println("Password: " + String.valueOf(pass));
		System.out.println("Salary : " + salary);
		System.out.println("age : " + age);
		
	}

}
