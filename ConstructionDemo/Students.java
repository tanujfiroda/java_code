package ConstructionDemo;

public class Students {
	int sid;
	String name;
	int std;
	char division;
	static String schoolname;
	

	
	/*public Students() {
		System.out.println("this is construction");
	}
	//construction with parameter
	public Students(int id, String n) {
		sid = id;
		name = n;		
	}
	
	public Students(int id, String n, int s ) {
		sid = id;
		name = n;
		std = s;
		
	}*/
	//over here there are two variable with a same name which is in local and another variable in global
	//"this" is used to refer a global variable
	public Students(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}



	public Students(int sid, String name, int std) {
		this.sid = sid;
		this.name = name;
		this.std = std;
	}
	
	public Students(char division, String name ) {
		division ='A';
		name = "King";
		
	}
	

}
