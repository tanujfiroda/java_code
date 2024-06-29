package Collections;

public class ArrayDemo {
	public static void main(String[] args) {
		
		//Create an array of size 10 and assign value as1,2,3...10
		int[] tar = new int[10];
		int counter = 10;
	/*	for(int i=0; i<tar.length; i++) {
			tar[i] = counter;
			counter++;
		}
			for(int i=0; i<tar.length; i++) {
				System.out.println(tar[i]);

		}*/
		
		//--------------------------------
			
		for(int i=0; i<tar.length; i++) {
			tar[i] = counter;
			counter = counter + 10;
		}
			for(int i=0; i<tar.length; i++) {
				System.out.println(tar[i]);

		}
			
	}
}
