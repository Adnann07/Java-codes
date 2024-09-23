/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Student
 */
abstract class account implements Interest{
    public double balance;
    public account(double  balance)
    {
        this.balance=balance;
    }
    abstract void withdraw(double amount);
   
    
    
}
