/*
 * File name: YourPurchasesTest.java
 * Author: Guannan Zhao, 041077510
 * Course: CST8284 - OOP(Java)
 * Assignment: 4
 * Date: Feb 17, 2023
 * Lab Professor: Leanne Seaward
 * Purpose: This class defines a test case to check if the giveChange method works as expected. 
 */

package winter23lab4;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

/**
 * This class is used to conduct the unit test for YourPurchases class. It defines a test method to test the
 * functionality of giveChange method using JUnit 4 assertion. 
 * 
 * @author Guannan Zhao
 * @version 2.0
 * @since JDK17
 */
public class YourPurchasesTest {
   /**
    * a tolerance level used to decide if two floating-point numbers are close enough to be considered equal
    */
   private static final double EPSILON = 1E-12;
   
   /**
	* a test method for {@link winter23lab4.YourPurchases#giveChange()} implemented by initializing a 
	* YourPurchases object first and then recording a few purchases and payment to compare the expected 
	* amount of change due to the customer with the actual value.
	*/
   @Test 
   public void testGiveChange() {
	  
	  //make an object
      YourPurchases register = new YourPurchases();
      
      //add purchase amount
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      
      //receive payment
      register.receivePayment(2, 0, 5, 0, 0);
      
      //expected result
      double expected = 0.25;
      
      Assert.assertEquals(expected, register.giveChange(), EPSILON);
      assertTrue(true);
    }
    
 }

