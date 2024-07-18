/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmedicine;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class TestMedicine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double weight=input.nextDouble();
        int productID=input.nextInt();
        Medicine m1=new Medicine(weight, productID);
        Tester t1=new Tester(m1);
        t1.checkQuality(weight, productID);
    }
    
}
