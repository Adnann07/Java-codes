/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapetest;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class ShapeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        ProductShape3D p=new ProductShape3D();
        System.out.println("enter one value: ");
        double side=input.nextDouble();
        p.createShape3D(side);
        System.out.println(p.getShapeName()+"area is: "+p.getSurfaceArea());
        System.out.println("enter two value: ");
        double radius=input.nextDouble();
        double height=input.nextDouble();
        p.createShape3D(radius,height);
        
        System.out.println(p.getShapeName()+"area is: "+p.getSurfaceArea());
        System.out.println("enter three value: ");
        double x=input.nextDouble();
        double y=input.nextDouble();
        double z=input.nextDouble();
        p.createShape3D(x,y,z);
        System.out.println(p.getShapeName()+"area is: "+p.getSurfaceArea());
        
        
    }
    
}
