package Encapsulation;

public class Students {
	
	private int sid = 5;// read, write
	private String name;//r, w
	private byte grade;//r
	private char division = 'A';//r
	private static String schoolName;//r
	private  String  mobile ;//r , w
	int q = 85;
	
	
	//Private :- can only access within the class
	//default :- can be accessed within the package
	//protected :- can be accessed within the package + by child class outside the package
	//public :- can be accessed thorughout the project
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getSid() {
		return sid;
	}
	public byte getGrade() {
		return grade;
	}
	public char getDivision() {
		return division;
	}
	public static String getSchoolName() {
		return schoolName;
	}
	
//	public int getsid() {
//		return sid;
//	}
//	
//	public  String getname() {
//		return name;
//	}
//	
//	public void  setname(String name) {
//		this.name = name;
//	}

}
