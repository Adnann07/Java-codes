/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microsoftoffice;

/**
 *
 * @author Student
 */
public class Word {
    void Open(String message) throws NameNotApplicableException 
    {
        if(message.endsWith(".doc") || message.endsWith(".docx"))
        {
                    System.out.println("Microsoft Word has opened  "+message);

        }
        else
        {
            throw new NameNotApplicableException("invalid");
        }
    }
   
}
