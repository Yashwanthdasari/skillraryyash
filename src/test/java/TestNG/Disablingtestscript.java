package TestNG;

import org.testng.annotations.Test;

public class Disablingtestscript {
	@Test(enabled=false)
	public void demo1()
	{
		System.out.println("demo1");
	}
	@Test(invocationCount=3,priority=-4)
	public void demo2()
	{
		System.out.println("demo2");
	}
	@Test(invocationCount=2,priority=1)
	public void demo3()
	{
		System.out.println("demo3");
	}

}
