/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package microsoftoffice;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class MicrosoftOffice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScann
        Scanner input=new Scanner(System.in);
        Word w1=new Word();
         PowerPoint p1=new PowerPoint();
        try
        {
        String message=input.nextLine();

        w1.Open(message);
        String message2=input.nextLine();
        p1.Open(message2);
       
       
        }
        catch(NameNotApplicableException | NameNotValidException e)
                {
                    System.out.println(e.getMessage());
                }
        finally
        {
            input.close();
        }
        
        
    }
    
}
