package ClassesObjectsDemo;

public class Students {

	
		//Should contain Student Object
		//Class contain variables and methods
		
		//These are variables or properties of a object
		int sid;
		//int sid2;
		int age;
		String name;
		long mobileNo;
		int std;
		static String address;
		char section;
		
		//These are methods or behavior of a object
		public void attendLecture() 
		{
			System.out.println("Student are attending Lecture");
		}
		
		public void doExercise() {
			System.out.println("Student are Doing Exercise");
			
		
			
		
			
		}
		public static void main (String[] args) {
			Students d1 = new Students() ;
				d1.sid = 23;
				System.out.println(d1);
		}
	}


