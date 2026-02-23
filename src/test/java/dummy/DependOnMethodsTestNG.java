package dummy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethodsTestNG {
	
	@Test(priority =1)
	void openApp() {
		Assert.assertTrue(true);
	}
	@Test(priority =2, dependsOnMethods= {"openApp"})
	void login() {
		Assert.assertTrue(true);
	}
	@Test(priority =3,dependsOnMethods= {"login","openApp"})
	void search() {
		Assert.assertTrue(true);
	}
	@Test(priority =4)
	void advSearch() {
		Assert.assertTrue(true);
	}
	@Test(priority =5)
	void logOut() {
		Assert.assertTrue(true);
	}

}
