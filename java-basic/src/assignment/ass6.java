package assignment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class ass6 {

	static Scanner sc = new Scanner(System.in);

	static String[] menu = { "Pizza", "Burger", "Milk Tea", "Spicy Noodle" };
	static int[] times = { 15, 30, 10, 45 };
	static String[] township = { "AA (15 mins)", "BB (30 mins)", "CC (10mins)", "DD (45 mins)" };

	static void showMenu() {
		System.out.println("******* Available Menu *******");
		for (var i = 0; i < menu.length; i++) {
			System.out.println((i + 1) + ". " + menu[i]);
		}
		System.out.println("please choose item: ");
	}

	static void showTownShip() {
		System.out.println("******* Deliverable Township *******");
		for (var i = 0; i < township.length; i++) {
			System.out.println((i + 1) + ". " + township[i]);
		}
		System.out.println("please choose Twonship:");
	}

	static void showOrder() {
		System.out.println("******* Order Type *******");
		System.out.println("1. Order Now?");
		System.out.println("2. Preorder?");
		System.out.println("Please choose 1 or 2 :");
	}

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		LocalDate Date = LocalDate.now();
		showMenu();
		int menuNumber = sc.nextInt();
		String flag = "1";

		do {
			if (0 < menuNumber && menuNumber < 5) {
				showTownShip();
				flag = "0";
			} else {
				System.out.println("Please reEnter available menu list number!");
				menuNumber = sc.nextInt();
			}
		} while (flag.equals("1"));

		int ts = sc.nextInt();
		String stop = "1";

		do {
			if (0 < ts && ts < 5) {
				showOrder();
				stop = "0";
			} else {
				System.out.println("Please reEnter available Township list number!");
				ts = sc.nextInt();
			}
		} while (stop.equals("1"));

		int od = sc.nextInt();
		String exit = "0";
		do {
			if (od == 1) {
				System.out.println("***** Order Type *****");
				System.out.println("Item Name : " + menu[menuNumber - 1]);
				System.out.println("Your Address : " + township[ts - 1].substring(0, 3));
				System.out.println("Duration : " + times[ts - 1] + " mins");
				System.out.println("Arrival Time: " + currentTime.plusMinutes(times[ts - 1])
						.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
				System.out.println("***** Thank you for your ordering ******");
				exit = "1";
			} else if (od == 2) {
				System.out.println("Enter Deliver Date : ");
				int deliDate = sc.nextInt();
				int currentDate = Date.getDayOfMonth();
				int deliDay = (deliDate - currentDate);
				System.out.println("***** Order Type *****");
				System.out.println("Item Name : " + menu[menuNumber - 1]);
				System.out.println("Your Address : " + township[ts - 1].substring(0, 3));
				System.out.println("Arrival Date: " + Date.plusDays(deliDay));
				System.out.println("***** Thank you for your ordering ******");
				exit = "1";

			} else {
				System.out.println("Please Enter availible order system list number!");
				od = sc.nextInt();
			}
		} while (exit.equals("0"));

	}
}
