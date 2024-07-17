/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testquadrilaterals;

/**
 *
 * @author HP
 */
public class Quadrilateral {
    private String type;
    private double quadArea;
    
    public Quadrilateral(String type, double quadArea)
    {
        this.type=type;
            this.quadArea=quadArea;
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getQuadArea() {
        return quadArea;
    }

    public void setQuadArea(double quadArea) {
        this.quadArea = quadArea;
    }
    
    
    
}
