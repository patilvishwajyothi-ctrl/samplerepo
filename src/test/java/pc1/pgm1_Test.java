package pc1;

import org.testng.annotations.Test;

public class pgm1_Test {
	@Test(groups="RT")
	public void method1_Test() {
		System.out.println("im method m1");
	}
	@Test(groups="ST")
	public void method2_Test() {
		System.out.println("im method m2");
	}

}
