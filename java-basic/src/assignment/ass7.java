package assignment;

public class ass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String para = "NLP techniques are becoming widely popular scientific research areas as well as Information Technology industry. Language technology together with Information Technology can enhance the lives of people with different capabilities. This system implements voice command mobile phone dialer application. The strength of the system is that it can make phone call to the contact name written in either English scripts or Myanmar scripts.";
		System.out.println("Numbers of sentense in paragraph : "+ para.split("\\.").length);
		System.out.println("Numbers of words in paragrpah : " + para.split("\\s+").length);
	}

}
