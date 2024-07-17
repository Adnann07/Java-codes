/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapetest;

/**
 *
 * @author HP
 */
public class ProductShape3D {
    private double surfaceArea;
    private String shapeName;
    public void createShape3D(double side)
    {
        surfaceArea = 6*side*side;
        shapeName="Cube";
    }
    
     public void createShape3D(double radius, double height)
    {
        surfaceArea = 3.1416*radius*radius*height;
         shapeName="Cylinder";
    }
     
      public void createShape3D(double x, double y,double z)
    {
        surfaceArea = 2*x*y+2*y*z+2*z*x;
         shapeName="Cuboid";
    }
      
      public String getShapeName() {
        return shapeName;
    }
      public double getSurfaceArea() {
        return surfaceArea;
    }
     
     
     
}
