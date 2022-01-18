package MavenProj.MavenFirstProj;

import org.testng.annotations.Test;

public class FourthMavenTest {
	@Test(priority=1)
	public void Test1() {
	System.out.println("I am first in Test day2 class");	
	}
	
	@Test
	public void Test3() {
		System.out.println("I am second in Test day2 class");
	}
	@Test
	public void Test4() {
	System.out.println("I am third in Test day2 class");	
	}
}
