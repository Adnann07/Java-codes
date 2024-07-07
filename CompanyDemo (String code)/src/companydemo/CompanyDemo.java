/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package companydemo;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class CompanyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input;
        input = new Scanner(System.in);
        Company c1=new Company();
        String in=input.nextLine();
        String con = c1.Convert(in);
        System.out.println(con);
        input.close();
        
    }
    
}
