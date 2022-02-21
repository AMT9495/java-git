package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] brand = {"lenovo","hp","samsung","acer","dell","asus"};
		String[] CPU = {"core i3","core i5","core i7","core i9"};
		double[][] priceData = {
				{230.21,400.21,294.2,693.33,340.44,691.99},
				{529.483,920.483,676.66,1594.659,783.012,1591.577},
				{552.504,960.504,706.08,1663.992,817.056,1660.776},
				{690.63,1200.63,882.6,2079.99,1021.32,2075.97}
		};
		
		int e = 0;
		String c = "continue";
		while(c.equals("continue")){
			System.out.println("Enter CPU Model : ");
			String cpu = sc.nextLine();
			if(Arrays.asList(CPU).contains(cpu) == true) {
				System.out.println("Enter brand name : ");
				String brandName = sc.nextLine();
				if(Arrays.asList(brand).contains(brandName) == true) {
					for(var r = 0; r < CPU.length; r++) {
						if(CPU[r].equals(cpu)){
							for(var c1 = 0; c1 < brand.length; c1++) {
								if(brand[c1].equals(brandName)) {
									System.out.println("price of this product : " + priceData[r][c1]+"$");
									System.out.println("Enter currency : ");
									int currency = sc.nextInt();
									double mmk = currency * priceData[r][c1];
									System.out.println("price of this product by mmk : "+ mmk + "Kyats");
									if(e == 0) {
										System.out.println("If you want to quit this process Enter exit : ");
										String ex = sc.next();
										if(ex.equals("exit"))
											c = ex;
										else {
											continue;
										}
									}
								}
							}
								
						}
						
					}
					
				}else {
					System.out.println("This brand doesn't exit!");
				}
			}else {
				System.out.println("This type of CPU Model doesn't exit!");
				System.out.println("If you want to quit this process Enter exit : ");
				String stop = sc.nextLine();
				if(stop.equals("exit"))
					c = stop;
			}
			
			
			
			}
		
	}

}
