package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one sentence : ");
		String line = sc.nextLine();
		String[] verb = {"was","were","did","had"};
		if(line.contains("?")){
			System.out.println("It is question sentence");
			
//			for(var i = 0; i < verb.length; i++) {
//				if(line.contains(verb[i])) {
//					System.out.println("It is not simple present tense");
//				}else {
//					System.out.println("It is simple present tense");
//				}
//			}
			
				if(line.contains(verb[0])) {
					System.out.println("It is not simple present tense");
				}
				else if(line.contains(verb[1])) {
					System.out.println("It is not simple present tense");
				}
				else if(line.contains(verb[2])) {
					System.out.println("It is not simple present tense");
				}
				else if(line.contains(verb[3])) {
					System.out.println("It is not simple present tense");
				}
				else {
					System.out.println("It is simple present tense");
				}

			
			
		}else {
			System.out.println("It is not question sentence");
		}
	}

}
