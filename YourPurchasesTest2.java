/*
 * File name: YourPurchasesTest2.java
 * Author: Guannan Zhao, 041077510
 * Course: CST8284 - OOP(Java)
 * Assignment: 4
 * Date: Feb 17, 2023
 * Lab Professor: Leanne Seaward
 * Purpose: This class defines a couple of test cases to check if the discountPurchase, CalculateChange 
 * and addTax method work as expected.       
 */

package winter23lab4;

import static org.junit.Assert.*;

import org.junit.Assert;

import org.junit.Test;

import org.junit.Ignore;

/**
 * This class is used to conduct the unit test for YourPurchases class. It defines three test methods to 
 * test the functionality of worker methods including discountPurchase, CalculateChange and addTax method 
 * using JUnit 4 assertion.
 * 
 * @author Guannan Zhao
 * @version 2.0
 * @since JDK17
 */
public class YourPurchasesTest2 {
	
	/**
	 * a tolerance level used to decide if two floating-point numbers are close enough to be considered equal
	 */
	private static final double EPSILON = 1E-12;
	
	/**
	 * a test method for {@link winter23lab4.YourPurchases#discountPurchase(double)} implemented by initializing a
	 * YourPurchases object first and then recording a few purchases to compare the expected amount of purchase
	 * after discount with the actual value. 
	 */
	@Test
	public void testDiscountPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(3);
		aPurchase.discountPurchase(1);
		double purchaseAfterDiscount = aPurchase.getPurchase();
		double expected = 2.00;
	    Assert.assertEquals(expected, purchaseAfterDiscount, EPSILON);
	    
	    YourPurchases anotherPurchase = new YourPurchases();
	    anotherPurchase.recordPurchase(108);
	    anotherPurchase.recordPurchase(44);
	    anotherPurchase.discountPurchase(8.5);
		purchaseAfterDiscount = anotherPurchase.getPurchase();
		expected = 143.5;
	    Assert.assertEquals(expected, purchaseAfterDiscount, EPSILON);
	    
		assertTrue(true);
		
	}
	
	/**
	 * a test method for {@link winter23lab4.YourPurchases#CalculateChange()} implemented by initializing a
	 * YourPurchases object first and then recording a purchase and payment to compare the expected amount of
	 * change due to the customer with the actual value. 
	 */
	@Test
	@Ignore
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
		
	}
	
	/**
	 * a test method for {@link winter23lab4.YourPurchases#addTax(double)} implemented by initializing a
	 * YourPurchases object first and then recording a few purchases to compare the expected amount of purchase
	 * including tax with the actual value. 
	 */
	@Test
	public void testAddTax() {
		YourPurchases myPurchase = new YourPurchases();
		myPurchase.recordPurchase(-100);
		double expected = -113;
		double taxResult = myPurchase.addTax(0.13);
		Assert.assertEquals(expected, taxResult, EPSILON);
		
		myPurchase.recordPurchase(100);
		expected = 0;
		taxResult = myPurchase.addTax(0.13);
		Assert.assertEquals(expected, taxResult, EPSILON);

		myPurchase.recordPurchase(0);
		expected = 0;
		taxResult = myPurchase.addTax(0.13);
		Assert.assertEquals(expected, taxResult, EPSILON);

		myPurchase.recordPurchase(55.55);
		expected = 62.7715;
		taxResult = myPurchase.addTax(0.13); 
		Assert.assertEquals(expected, taxResult, EPSILON);

		assertTrue(true);
	
	}

}
