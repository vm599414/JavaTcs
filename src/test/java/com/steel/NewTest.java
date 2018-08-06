package com.steel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("now");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("hi");
	  //Assert.assertEquals(true, false);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("hi");
  }

}
