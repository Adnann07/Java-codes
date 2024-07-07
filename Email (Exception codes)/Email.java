/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package email;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import email.InterruptedException;
public class Email {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        Gmail g1=new Gmail();
        YahooMail y1=new YahooMail();
        
        try
        {
            String id=input.nextLine();
        g1.Login(id);
        
        String id2=input.nextLine();

        y1.Login(id2);
        }
        catch( InterruptedException | UnsupportedOperationException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            input.close();
        }
        
    }
    
}
