package testNG;
/*
TC2
----
1) Login --- @BeforeClass
2) Search --- @Test
3) Adv search   --- @Test
4) Logout  -- -AfterClass
*/


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo22 {
	
	@BeforeClass
	public void login() {
		System.out.println("this is login");
	}
	@AfterClass
	public void logOut() {
		System.out.println("this is logOut");
	}
	@Test
	public void search() {
		System.out.println("this is search");
	}
	@Test
	public void advSearch() {
		System.out.println("this is advance Search");
	}


}
