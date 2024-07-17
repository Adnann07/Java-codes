/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testquadrilaterals;

/**
 *
 * @author HP
 */
public class CreateQuadrilateral {
   private double QuadArea;
    public double generateQuad(double side)
    {
          QuadArea=side*side;
        return QuadArea;
    }
    
     public double generateQuad(double side,double base)
    {
          QuadArea=side*base;
        return QuadArea;
    }
     
    public double  generateQuad(double side1, double side2, double height)
    {
         QuadArea =(0.5)*(side1+side2)*height;
        return QuadArea;
    }
    
    public double getQuadArea() {
        return QuadArea;
    }

    
}
