/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccountconcurrency;

/**
 *
 * @author HP
 */
public class BankAccount {
    int balance=0;
    public synchronized void deposit(int amount)
    {
        balance+=amount;
        System.out.println(balance);
    }
    
    public synchronized void  withdraw(int amount)
    {
        balance-=amount;
        System.out.println(balance);
    }
    
    public int getBalance()
    {
        return balance;
    }
}
