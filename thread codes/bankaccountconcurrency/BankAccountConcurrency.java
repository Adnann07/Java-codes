/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccountconcurrency;

/**
 *
 * @author HP
 */
public class BankAccountConcurrency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount a1=new BankAccount();
        Thread t1= new Thread(new Deposit(a1,500));
        Thread t2=new Thread(new Withdraw(a1,300));
        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
        }
        System.out.println(a1.getBalance());
        
    }
    
}
