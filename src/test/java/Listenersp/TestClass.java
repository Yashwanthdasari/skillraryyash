package Listenersp;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listenersp.ListenersImp.class)
public class TestClass extends BaseClass{
	@Test
	public void test() {
		System.out.println("@Test");
		Assert.fail();
	}
	@Test(dependsOnMethods="test")
	public void test1()
	{
	System.out.println("@Test-test1");	
	}
	
	
}
