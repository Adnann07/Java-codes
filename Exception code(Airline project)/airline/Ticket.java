/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline;

/**
 *
 * @author HP
 */
import airlineexception.NotApplicableForDiscountException;
public class Ticket {
    void giveDiscount(int age,double discount) throws NotApplicableForDiscountException
    {
        if(age>=60)
        {
            System.out.println("giving 6% discount");
            double price= discount*0.94;
            System.out.println("discounted price: "+price);
        }
        else if(age<=10)
        {
            System.out.println("giving 5% discount");
            double price=discount*0.95;
            System.out.println("discounted price: "+price);
        }
        else
        {
            throw new NotApplicableForDiscountException("Age group not included in discount offer");
        }
    }
}
