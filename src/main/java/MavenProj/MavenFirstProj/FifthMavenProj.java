package MavenProj.MavenFirstProj;

import org.testng.annotations.Test;

public class FifthMavenProj {
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
	
	@Test
	public void Test5() {
		System.out.println("I am fourth in Test day2 class");
	}
	@Test
	public void Test6() {
	System.out.println("I am fifth in Test day2 class");	
	}
	
	@Test(priority=-1)
	public void Test2() {
		System.out.println("I am sixth in Test day2 class");
	}
}
