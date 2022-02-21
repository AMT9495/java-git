package assignment;

import java.util.Scanner;

public class ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Full Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter email : ");
		String email = sc.nextLine();
		
		System.out.print("Enter Phone Number");
		String phone = sc.nextLine();
		
		System.out.print("Enter education : ");
		String education = sc.nextLine();
		
		System.out.print("Enter your income");
		double income = sc.nextDouble();
		
		System.out.print("Enter Age");
		int age = sc.nextInt();
		
		System.out.println("name : "+ name);
		System.out.println("email : "+ email);
		System.out.println("Phone : "+ phone);
		System.out.println("Education : "+ education);
		System.out.println("income : "+ income);
		System.out.println("Age : "+ age);
		
	}

}
