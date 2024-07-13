/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccountconcurrency;

/**
 *
 * @author HP
 */
public class Withdraw implements Runnable{
     private final BankAccount a1;
    private final int amount;
    public  Withdraw(BankAccount a1,int amount)
    {
      
         this.a1=a1;
         this.amount=amount;
    }
    @Override
    public void run()
    {
        a1.withdraw(amount);
    }
    
}
