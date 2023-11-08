package Groupexecution;

import org.testng.annotations.Test;

public class Testclass1 {
	
	@Test(groups="smoke")
	public void demo1() {
		System.out.println("Testclass1-demo1-smoke");
	} 
}
