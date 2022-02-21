package assignment;

import java.util.Scanner;

public class ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String c = "continue";
		while(c.equals("continue")) {

			System.out.print("When do you go bed?(Enter 0 to 24) : ");
			int num1 = sc.nextInt();
			System.out.print("When do you get up?(Enter 0 to 24) : ");
			int num2 = sc.nextInt();
			int totalSleepTime;
			
			if(num1<=12) {
				totalSleepTime = num2 - num1;
				
			}
			else {
				int sleepHour = 24-num1;
				totalSleepTime = sleepHour+num2;
			}
			
			System.out.println("Your total sleep time : " + totalSleepTime+"hr");
			
			
			if(totalSleepTime >=5 && totalSleepTime <= 8) {
				System.out.println("You take care your health well!");
			}
			else if(totalSleepTime<5) {
				System.out.println("You are very hardworking!");
			}
			else {
				System.out.println("You are abnormal!");
			}
			
			
			System.out.println("If you want to quit this process Enter exit : ");
			String stop = sc.next();
			System.out.println(stop);
			
			if(stop.equals("exit"))
				c = stop;
			
		}
	}

}
