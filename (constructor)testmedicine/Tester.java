/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmedicine;

/**
 *
 * @author HP
 */
public class Tester {
   
    public Medicine medObj;
    public Tester(Medicine medObj)
    {
        this.medObj=medObj;
    }
    
    public void checkQuality(double weight,int productID)
    {
        int x=productID+(int) weight;
        System.out.println("quality number: "+x);
        
        if(x%4==0)
        {
            if(x%100==0 && x%400==0)
            {
                System.out.println("Quality is okay");
            }
        }
        else
        {
            System.out.println("quality is not okay");
        }
        
        
    }
    
    
    
}
