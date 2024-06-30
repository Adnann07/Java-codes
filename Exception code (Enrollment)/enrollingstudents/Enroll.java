/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enrollingstudents;

/**
 *
 * @author HP
 */
import validationexceptions.InvalidEmailException;
import validationexceptions.NotAcceptableAgeException;
public class Enroll {
    void validateEmail(String emailId) throws InvalidEmailException
    {
        if(emailId.contains("@") && emailId.endsWith(".com"))
        {
            System.out.println("valid");
        }
        else
        {
            throw new InvalidEmailException("invalid email");
        }
    }
    
    void validateAge(int age) throws NotAcceptableAgeException
    {
        if(age<18)
        {
            throw new NotAcceptableAgeException("too young to enroll");
        }
        else if(age>=35)
        {
            throw new NotAcceptableAgeException("too old to enroll");
        }
    }
    
}
