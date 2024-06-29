package Encapsulation;

public class accessModifier {
	
	public class num{
		void accessMember() {
			int i =9656;
			System.out.println(i);
		}
	}

		public int m = 8;
		private int n = 6;
		int o = 5;
		protected int p = 1;
		
		public static void main(String[] args) {
			
			accessModifier a1 = new accessModifier();
			System.out.println(a1.m);
			System.out.println(a1.n);
			System.out.println(a1.o);
			System.out.println(a1.p);
			//System.out.println(a1.i);
			
			accessModifier.num obj = a1.new num();
			obj.accessMember();
			
		}
}


