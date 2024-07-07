/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package email;

/**
 *
 * @author HP
 */

public class Gmail {
    void Login(String id) throws InterruptedException
    {
        if(id.contains("@") && id.endsWith("gmail.com"))
        {
            System.out.println("login successful");
        }
        else
        {
              throw new InterruptedException("Login unsuccessful");
        }
    }
}
