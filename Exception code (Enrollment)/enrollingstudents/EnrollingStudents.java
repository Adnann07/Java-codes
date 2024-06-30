/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enrollingstudents;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import validationexceptions.InvalidEmailException;
import validationexceptions.NotAcceptableAgeException;
public class EnrollingStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Student s1=new Student();
       try
       {
        String emailId=input.nextLine(); 
        s1.validateEmail(emailId);
        int age=input.nextInt();
        s1.validateAge(age);
        String filename=input.nextLine();
        s1.Upload(filename);
       }
       catch(InvalidEmailException| NotAcceptableAgeException | IllegalArgumentException e)
       {
           System.out.println("Exception: "+e.getMessage());
       }
       finally{
           input.close();
       }
    }
    
}
