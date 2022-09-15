
public class Sample implements A,B {

	@Override
	public void m1() {
		A.super.m1();
		B.super.m1();
		System.out.println(3);
	}

}
