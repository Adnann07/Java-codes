/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validationexceptions;

/**
 *
 * @author HP
 */
public class NotAcceptableAgeException extends Exception{
    public NotAcceptableAgeException(String message)
    {
        super(message);
        System.out.println(message);
    }
}
