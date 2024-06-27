/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie;

/**
 *
 * @author HP
 */
import movieexception.CardNotWorking;
public class BookTicket extends Eligibility {
    void addCard(String cardNo) throws CardNotWorking
    {
        if(cardNo.length()>16 || cardNo.contains(" "))
        {
             throw new CardNotWorking("Invalid Card");
        }
        else
        {
            System.out.println("card is valid");
        }
    }
}
