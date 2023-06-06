/*
 * File name: YourPurchases.java
 * Author: Guannan Zhao, 041077510
 * Course: CST8284 - OOP(Java)
 * Assignment: 4
 * Date: Feb 17, 2023
 * Lab Professor: Leanne Seaward
 * Purpose: This class defines a YourPurchases object with two attributes to record purchase and payment,
 * four constants for different coins values as well as a set of worker methods.    
 */

package winter23lab4;


/**
 * This class defines a YourPurchases object to represent a cash register. It contains two attributes 
 * to record purchase and payment, four constants for different coins values as well as a set of 
 * worker methods to sum up the sales and then compute the change due to a customer.
 * 
 * @author Guannan Zhao
 * @version 2.0
 * @since JDK17
 */
public class YourPurchases {
   /**
	* a constant represents the value of a quarter.
	*/
   public static final double QUARTER_VALUE = 0.25;
   /**
	* a constant represents the value of a dime.
	*/
   public static final double DIME_VALUE = 0.1;
   /**
	* a constant represents the value of a nickel.
	*/
   public static final double NICKEL_VALUE = 0.05;
   /**
	* a constant represents the value of a penny.
	*/
   public static final double PENNY_VALUE = 0.01;
   
   /**
	* the amount of purchases made by a customer
	*/
   private double purchase;
   /**
	* the amount of payment a customer paid
	*/
   private double payment;

   /**
    * Constructs a cash register - YourPurchases object - with no money in it.
    */
   public YourPurchases()
   {
      purchase = 0;
      payment = 0;
   }
   
    /**
     * Returns the amount of purchases.
     * 
     * @return amount of purchases
	 */
	public double getPurchase()
	{
	   return purchase;	  
	}
	
	/**
	 * Returns the amount of payment.
	 * 
	 * @return amount of payments
	 */
	public double getPayment()
	{
		return payment;
	}

   /**
    * Records the purchase price of an item.
    * 
    * @param amount the price of the purchased item
    */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;    
   }
   
   /**
    * Enters the payment received from the customer.
    *
    * @param dollars the number of dollars in the payment
    * @param quarters the number of quarters in the payment
    * @param dimes the number of dimes in the payment
    * @param nickels the number of nickels in the payment
    * @param pennies the number of pennies in the payment
    */
   public void receivePayment(int dollars, int quarters, 
         int dimes, int nickels, int pennies)
   {
      payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
            + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
   }
   
   /**
    * Computes and returns the change due.
    * 
    * @return the change due to the customer
    */
   public double CalculateChange()
   {
      double change = payment - purchase;
      
      return change;
   }

   /**
    * Computes the change due and resets the machine for the next customer.
    * 
    * @return the change due to the customer
    */
   public double giveChange()
   {
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
   
   /**
    * Calculates the amount of purchases after deducting the discount
    * 
    * @param amount the discount amount applied to the purchase
    */
   public void discountPurchase(double amount) {
	   purchase -= amount;
   }
   
   /**
    * Calculates the total amount of purchases according to the tax rate passed
    * 
    * @param tax the tax rate applied to the purchase
    * @return the total amount of purchases
    */
   public double addTax(double tax) {
	   return purchase*(1 + tax);
   }
   
   /**
    * Converts the amount of purchases into USD
    * 
    * @param rate the exchange rate between USD and CAD
    * @return the amount of purchases in USD
    */
   public double convertUSD(double rate) 
   {
	  return rate*purchase;
   }
   
}