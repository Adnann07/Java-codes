/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movie;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import movieexception.CardNotWorking;
import movieexception.NotApplicableForChildrenException;
public class Movie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner(System.in);
       BookTicket b1= new BookTicket();
       
      try
      {
           int age=input.nextInt();
       String rating=input.nextLine();
       b1.checkAge(age, rating);
       String cardNo=input.nextLine();
       b1.addCard(cardNo);
      }
      catch(CardNotWorking | NotApplicableForChildrenException e)
      {
          System.out.println(e.getMessage());
      }
      finally
      {
          input.close();
      }
    }
    
}
