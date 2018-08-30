package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Scenario1Test extends BaseTestClass {
  @Test
  public void f() {
	  
	  test = extent.createTest("scenario 1", 
				"Tests the first scenario");
	  
	  System.out.println("Test 1");
	  test.log(Status.INFO, "Test 1");
  }
}
