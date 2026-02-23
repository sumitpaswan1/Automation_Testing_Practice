package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*1) Login   -- @BeforeMethod
2) Search -- @Test
3)Logout --  @AfterMethod
4)Login
5)Advanced search  --- @Test
6)Logout
*/

public class AnnotationsDemo1 {
	
	@BeforeMethod
	public void login() {
		System.out.println("this is login");
	}
	@AfterMethod
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
