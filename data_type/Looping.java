package data_type;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=900;
		
		if(i<=35)
		{
			System.out.println("Fail");
		}else if (i>=35 && i<=60)
			
		{
			System.out.println("Second Class");
		}else if (i>=60 && i<=80)
		{
			System.out.println("First Class");
		}else if (i>=80 && i<=100)
		{
		System.out.println("Topper");
		} else
	{
		System.out.println("Put a valid number..!");
	}
		
		
		
		int day = 1;
		
		if(day==1)
		{
			System.out.println("Monday");
		}else if (day==2)
		{
			System.out.println("Tuesday");
		}
		
		int day1 =8;
		
		switch(day1)
		{
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("Septmber");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
			default:
				System.out.println("Enter valid Value");
				
		}

	}
}




