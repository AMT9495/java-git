package day_2;

public class testing5 {
	
	int num1 = 10;
	static int num2 = 20;
	
	static void static_method() {
		System.out.println("Inside static method....");
		System.out.println("num2 = " + num2);
//		System.out.println("num1 =" + num1);
	}

	void instance_method() {
		System.out.println("Inside instancd method...");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = "+ num2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static_method();
//		testing5.static_method()
		testing5 obj = new testing5();
		obj.instance_method();

	}

}
