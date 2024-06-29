package data_type;

public class Hello_World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Memory
		//byte < short < int < long < float < double
		byte b=40;
		short s=43;
		System.out.println(b);
		System.out.println(s);
		
		s=b;
		System.out.println(s);
		
		b=(byte) s;
		System.out.println(b);
		
		byte b1;
		short s1=128; 
		b1=(byte) s1;
		System.out.println(b1);
		System.out.println(s1);
		
		//char to integer
		char c1 = '0';
		int i1=c1;
		System.out.println(c1);
		System.out.println(i1);
		
		//Integer to char
		int i2=123;
		char c2 = (char) i2;
		System.out.println(i2);
		System.out.println(c2);
		
		//Int to String
		
		int i3 = 450;
		String s3 = Integer.toString(i3);
		System.out.println(i3+20);
		System.out.println(s3+10);
		
		//String to int
		
		String s4 = "123";
		int i4 =Integer.parseInt(s4) ;
		System.out.println(s4);
		System.out.println(i4);
		
		//double to string
		
		double d = 40.12;
		String s5 = Double.toString(d);
		System.out.println(d+10);
		System.out.println(s5);
		
		System.out.println(12);
		
		
				
				
		
	}

}
