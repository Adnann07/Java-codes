/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microsoftoffice;

/**
 *
 * @author Student
 */
public class PowerPoint {
    void Open(String message) throws NameNotValidException
    {
        if(message.endsWith(".pps") || message.endsWith(".ppt"))
        {
                    System.out.println("Microsoft PowerPoint has opened  "+message);

        }
        else
        {
            throw new NameNotValidException("invalid");
        }
    }
}
