/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Student
 */
import static java.lang.Math.abs;
import java.lang.RuntimeException;
public class SavingsAccount extends account implements Interest{

    public SavingsAccount(double balance) {
        super(balance);
    }
    
    @Override
    
    
     public void withdraw(double amount)
     {
         try
         {
             
         if(amount>balance)
         {
             
             throw new RuntimeException("error!");
         }
         else 
         {
             balance=amount-balance;
             System.out.println("remaining balance : "+abs(balance));
         }
         }
         catch(RuntimeException ex)
         {
             System.out.println("Exception occured!");
         }
         
     }
    @Override
      public double calculateInterest(double rate)
      {
          
          System.out.println("interest rate is : "+rate);
        return 0;
          
      }
    
}
