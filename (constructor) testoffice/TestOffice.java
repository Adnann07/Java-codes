/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testoffice;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class TestOffice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Total projects: ");
        int totalProjects=input.nextInt();
        System.out.println("Total months: ");
        int totalMonths=input.nextInt();
        AdminOffice a1=new AdminOffice(totalProjects,totalMonths);
        
        AdmissionOffice a2=new AdmissionOffice(a1);
        a2.checkPerformance();
        
    }
    
}
