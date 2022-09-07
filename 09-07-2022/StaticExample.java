public class StaticExample{

		public int number; // non-static / field
		public static int count;


		public void increment(){

			number++;  // number=number+1;
			count++;  // count=count+1;
		}

		public void display(){
			System.out.println("Number: "+number);
			System.out.println("Count: "+count);
			
		}

		public static void show(){
			//System.out.println("Number: "+number);
			System.out.println("Count: "+count);

		}
}