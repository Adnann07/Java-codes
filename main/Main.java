/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SavingsAccount s=new SavingsAccount(2000);
        CurrentAccount c=new CurrentAccount(3000);
        
     
            s.calculateInterest(2);
        s.withdraw(20);
        c.calculateInterest(3);
        c.withdraw(20);
        
     }
    
    }
    

