package InheritanceAndPolymorphism;

public class App {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.attendSession();
		s1.markAttendence();
		
		Teachers t1 = new Teachers();
		t1.deliverSession();
		t1.markAttendence();
		
		Staff st1 = new Staff();
		st1.markAttendence();
		
		s1.lunchBreak();
		t1.lunchBreak();
		st1.lunchBreak();
				

	}

}
