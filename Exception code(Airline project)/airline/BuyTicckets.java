/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline;

/**
 *
 * @author HP
 */
import airlineexception.IDNumberInvalidException;
public class BuyTicckets extends Ticket{
    void checkID(String ID,String type) throws IDNumberInvalidException
    {
        if("passport".equals(type) && ID.length()!=9)
        {
            throw new IDNumberInvalidException("Passport number is invalid");
        }
        
        else if("NID".equals(type) && ID.length()!=10)
        {
            throw new IDNumberInvalidException("NID is invalid");
        }
        System.out.println("ID is valid");
    }
    
}
