package ClassesObjectsDemo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s1 = new Students();
		s1.sid= 1;
		s1.name = "Tanuj";
		System.out.println(s1.sid);
		System.out.println(s1.name);
		s1.attendLecture();
		
		Students s2 = new Students();
		s2.sid = 2;
		s2.name = "Firoda";
		System.out.println(s2.sid);
		System.out.println(s2.name);
		s2.attendLecture();
		
		Students.address = "Veer Teja";
		System.out.println(Students.address);
		
		System.out.println(Math.PI);
		
		
		
		
		
		

	}

}
