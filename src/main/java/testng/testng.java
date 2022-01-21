package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	@BeforeTest
	public void test1(){
		System.out.print("Hiiiiii \n");
	}
	@Test
	public void test2() {
		System.out.print("Yes, You are Right!!!!!!\n"); 
	}
	@AfterTest
	public void test3() {
		System.out.print("Thank You"); 
	}

}
