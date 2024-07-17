/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testquadrilaterals;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class TestQuadrilaterals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
       
        CreateQuadrilateral c1=new CreateQuadrilateral();
        System.out.println("input one value: ");
        double side=input.nextDouble();
        
        c1.generateQuad(side);
        System.out.println(c1.getQuadArea());
        System.out.println("input two value: ");
        double sidee=input.nextDouble();
        double base=input.nextDouble();
        c1.generateQuad(sidee, base);
        System.out.println(c1.getQuadArea());
                System.out.println("input three value: ");

        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double height=input.nextDouble();
        c1.generateQuad(side1, side2, height);
        
        System.out.println(c1.getQuadArea());
    }
    
}
