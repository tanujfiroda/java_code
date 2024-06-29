package Encapsulation;

import Encapsulation.accessModifier.num;

public class App {

	public static void main(String[] args) {
		Students s1 = new Students();
//		s1.name = "Tanuj";
//		System.out.println(s1.name);
		
//		System.out.println(s1.getsid());
//		
//		s1.setname("Tanuj Firoda");
//		System.out.println(s1.getname());
		
		s1.setMobile("6378163802");
		System.out.println(s1.getMobile());
		
		s1.setName("Tanuj Firoda Choudhary");
		System.out.println(s1.getName());
		
		System.out.println(s1.getDivision());
		
		num s2 = new num();
		s2.i;
		
	}

}
