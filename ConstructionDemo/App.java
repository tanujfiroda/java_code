package ConstructionDemo;

public class App {

	public static void main(String[] args) {
		Students s1 = new Students(1, "Tanuj");
		System.out.println(s1.sid);
		System.out.println(s1.name);
		
		Students s2 = new Students(2, "Tony");
		System.out.println(s2.sid);
		System.out.println(s2.name);
		
		Students s3 = new Students(3, "Captain", 5);
		System.out.println(s3.sid);
		System.out.println(s3.name);
		System.out.println(s3.std);
		
		Students s4 = new Students('B', "Queen");
		System.out.println(s4.division);
		System.out.println(s4.name);
		
		
		
	}

}
