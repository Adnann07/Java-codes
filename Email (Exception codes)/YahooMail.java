/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package email;

/**
 *
 * @author HP
 */
public class YahooMail  {
    void Login(String id) throws UnsupportedOperationException
    {
        if(id.contains("@") && id.endsWith("ymail.com"))
        {
            System.out.println("Login successful");
        }
        else
        {
            throw new UnsupportedOperationException("login unsuccessful");
        }
    }
    
}
