/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testoffice;

/**
 *
 * @author HP
 */
public class AdminOffice {
    private int totalProjects;
    private int totalMonths;
    
    public AdminOffice(int totalProjects, int totalMonths)
    {
        this.totalProjects=totalProjects;
        this.totalMonths=totalMonths;
    }

    public int getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(int totalProjects) {
        this.totalProjects = totalProjects;
    }

    public int getTotalMonths() {
        return totalMonths;
    }

    public void setTotalMonths(int totalMonths) {
        this.totalMonths = totalMonths;
    }
    
    
}
