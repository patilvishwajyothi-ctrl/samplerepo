package pc1;

import org.testng.annotations.Test;

public class pgm1_Test {
	@Test(groups="RT")
	public void method1_Test() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("im method m1");
	}
	@Test(groups="ST")
	public void method2_Test() {
		System.out.println("im method m2");
	}

}
