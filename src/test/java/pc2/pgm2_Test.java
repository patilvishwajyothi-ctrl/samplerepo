package pc2;

import org.testng.annotations.Test;

public class pgm2_Test {
	@Test(groups="ST")
	public void method3_Test() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("im method m3");
	}
	@Test(groups="RT")
	public void method4_Test() {
		System.out.println("im method m4");
	}


}
