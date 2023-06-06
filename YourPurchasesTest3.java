/*
 * File name: YourPurchasesTest3.java
 * Author: Guannan Zhao, 041077510
 * Course: CST8284 - OOP(Java)
 * Assignment: 4
 * Date: Feb 17, 2023
 * Lab Professor: Leanne Seaward
 * Purpose: This class defines a couple of test cases to systematically check the worker methods in YourPurchases 
 * class and try to find the source leading to the failure of testCalculateChange() in YourPurchasesTest2 class.       
 */

package winter23lab4;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

/**
 * This class is used to conduct the unit test for YourPurchases class. It defines three test methods to 
 * test the functionality of worker methods including recordPurchase, receivePayment and CalculateChange 
 * method using JUnit 4 assertion.
 * 
 * @author Guannan Zhao
 * @version 1.0
 * @since JDK17
 */
public class YourPurchasesTest3 {
	
	/**
	 * a tolerance level used to decide if two floating-point numbers are close enough to be considered equal
	 */
	private static final double EPSILON = 1E-12;
	
	/**
	 * a test method for {@link winter23lab4.YourPurchases#recordPurchase(double)} implemented by initializing a
	 * YourPurchases object first and then recording a purchase to check if the expected amount of purchase 
	 * matches the actual value. 
	 */
	@Test
	public void testRecordPurchase() {
		YourPurchases aPurchase = new YourPurchases();
	    aPurchase.recordPurchase(20.54);
		double expected = 20.54;
		double actual = aPurchase.getPurchase();
	    Assert.assertEquals(expected, actual, EPSILON);
		assertTrue(true);
	}
	
	/**
	 * a test method for {@link winter23lab4.YourPurchases#receivePayment(int, int, int, int, int)} implemented by
	 * initializing a YourPurchases object first and then recording a payment to check if the expected amount of
	 * payment matches the actual value. 
	 */
	@Test
	public void testReceivePayment() {
		YourPurchases aPurchase = new YourPurchases();
	    aPurchase.receivePayment(19, 4, 2, 0, 8);
		double expected = 20.28;
		double actual = aPurchase.getPayment();
	    Assert.assertEquals(expected, actual, EPSILON);
		assertTrue(true);
	}
	
	/**
	 * a test method for {@link winter23lab4.YourPurchases#CalculateChange()} implemented by initializing a
	 * YourPurchases object first and then recording a few purchases and a payment to compare the expected 
	 * amount of change due to the customer with the actual value. 
	 */
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
	    aPurchase.recordPurchase(103.33);
	    aPurchase.recordPurchase(49);
	    aPurchase.receivePayment(120, 500, 0, 0, 32);
		double expected = 92.99;
		double actual = aPurchase.CalculateChange();
	    Assert.assertEquals(expected, actual, EPSILON);
		assertTrue(true);
	}

}
