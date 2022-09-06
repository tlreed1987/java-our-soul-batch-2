public class HRMain{

	public static void main(String[] args){

		Employee e1=new Employee();
		e1.id=1;
		e1.name="Nitin";
		e1.salary=1200.00F;
		//________________________

		Employee e2=new Employee();
		e2.id=2;
		e2.name="Miyako";
		e2.salary=3211.11F;

		e1.display();
		System.out.println("****************");

		e2.display();
	}


}

