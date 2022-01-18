package MavenProj.MavenFirstProj;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdClassTest {
	@BeforeTest
	public void Loan1() {
	System.out.println("I am before Test");	
	}
	
	@BeforeClass
	public void Loan2() {
		System.out.println("I am before class");
	}
	@BeforeMethod
	public void Loan3() {
	System.out.println("I am before method");
	
	}
	
	@Test
	public void Loan4() {
		System.out.println("I am fourth in Test day3 class");
	}
	@BeforeSuite
	public void Loan5() {
		System.out.println("I am before suite");
	}
	
	@AfterSuite
	public void Loan6() {
		System.out.println("I am after suite");
		
	}
	@AfterMethod
	public void Loan7() {
		System.out.println("I am seventh in Test day3 class");
	}
	@Parameters({"URL","URLN"})
	@Test
	public void Loan8(String url,String urlname) {
		System.out.println("I am eighth in Test day3 class");
		System.out.println(url);
		System.out.println(urlname);
	}
	@Test
	public void Loan9() {
		System.out.println("I am ninth in Test day3 class");
	}
	
	@Test
	public void Loan10() {
		System.out.println("I am 10 in Test day3 class");
	}
}
