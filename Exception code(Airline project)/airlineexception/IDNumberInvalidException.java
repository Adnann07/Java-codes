/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlineexception;

/**
 *
 * @author HP
 */
public class IDNumberInvalidException extends Exception {
     public IDNumberInvalidException(String message)
    {
        super(message);
        System.out.println(message);
    }
}
