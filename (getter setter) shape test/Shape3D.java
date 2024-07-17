/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapetest;

/**
 *
 * @author HP
 */
public class Shape3D {
    private String shapeName;
    private double surfaceArea;
    
    public Shape3D(String shapeName, double surfaceArea)
    {
        this.shapeName=shapeName;
        this.surfaceArea=surfaceArea;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
    
    
    
}
