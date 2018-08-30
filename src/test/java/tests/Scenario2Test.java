package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Scenario2Test extends BaseTestClass{
  @Test
  public void f() {
	  test = extent.createTest("scenario 2", 
				"Tests the second scenario");
	  
	  System.out.println("Test 2");
	  test.log(Status.INFO, "Test 2");
  }
}
