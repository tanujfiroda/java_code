package Collections;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Tanuj";
		String msg;
		//System.out.println(name);
		msg = name.concat("Trainer");
		System.out.println(name);
		System.out.println(msg);
		
		StringBuffer sb1 = new StringBuffer("Welcome To");
		sb1.append(" India");
		//System.out.println(sb1);
		
		//reverse a string
		String str = "Reverse Me";
		StringBuffer sb2 = new StringBuffer(str);
		//System.out.println(sb2.reverse());
	}
	

}
