/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testoffice;

/**
 *
 * @author HP
 */
public class AdmissionOffice {
    public AdminOffice adminObj;
    public AdmissionOffice(AdminOffice adminObj)
    {
        this.adminObj=adminObj;
    }
    
    
    public void checkPerformance()
    {
        
                double x=adminObj.getTotalProjects()*adminObj.getTotalMonths()+100;
                if(x<500)
                {
                    System.out.println(x);
                    System.out.println("Admin's performance is bad");
                }
                else
                {
                    System.out.println(x);
                    System.out.println("Admin's Performance is great");
                }
                
    }
}
