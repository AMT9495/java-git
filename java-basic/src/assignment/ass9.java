package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your NRC-No");
		System.out.println("(eg. nrcno = 12/mayana(N)123456 or nrcno = 5/yamatha(naing)789412");
		String userNRC = sc.nextLine();
		String[] nrc = userNRC.split("/");
		int end = nrc[1].indexOf("(");
		int start = nrc[1].indexOf(")")+1;
		System.out.println("Township : " + nrc[1].substring(0, end));
		System.out.println("Number : " + nrc[1].substring(start));
	}

}
