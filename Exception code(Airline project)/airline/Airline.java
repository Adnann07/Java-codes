/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airline;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import airlineexception.IDNumberInvalidException;
import airlineexception.NotApplicableForDiscountException;
public class Airline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
        BuyTicckets b1 = new BuyTicckets();
        try {
         

            System.out.println("Enter ID:");
            String id = input.nextLine();
            System.out.println("Enter type (passport/nid):");
            String type = input.nextLine();
            b1.checkID(id, type);

            System.out.println("Enter age:");
            int age = input.nextInt();
            System.out.println("Enter ticket price:");
            double discount = input.nextDouble();
            b1.giveDiscount(age, discount);
        } catch (IDNumberInvalidException | NotApplicableForDiscountException e) {
            System.out.println(e.getMessage()); 
        } finally {
            input.close();
        }
    }
}
   
