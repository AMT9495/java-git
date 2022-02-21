package assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;

public class ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		LocalDate date = LocalDate.now();
		
		String[] weekend = {"SATURDAY","SUNDAY"};
		
		if(Arrays.asList(weekend).contains(date.getDayOfWeek()) == true) {
			System.out.println(date.format(f1));
			System.out.println("******************************");
			System.out.println("Today is my Holiday!");
		}
		else {
			System.out.println(date.format(f1));
			System.out.println("******************************");
			System.out.println("I havee no time. I am studaying Programming Language.!");
		}
		
		
	}

}
