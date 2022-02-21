package assignment;

import java.util.Scanner;

public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number you want to type : ");
		int num = sc.nextInt();
		int countZero = 0;
		int countPositive = 0;
		int countNegative = 0;
		
		for(var i = 0; i<num; i++) {
			System.out.print("Enter any number: ");
			int number = sc.nextInt();
			
			if(number == 0) {
				countZero++;
			}
			else if(number>0) {
				countPositive++;
			}
			else {
				countNegative++;
			}
		}
		
		System.out.println("count of Positive Number : " + countPositive);
		System.out.println("count of Zero : " + countZero);
		System.out.println("count of Negative Number " + countNegative);
		

	}

}
