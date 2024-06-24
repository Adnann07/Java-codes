/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author user
 */

public class Samsung extends MobilePhone{
    @Override
    public void call(String phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    @Override
    public void sendsms(String R, String msg)
    {
        System.out.println("Sending"+R+"message"+msg);
    }
    @Override
    public void savingcontacts(String name, String phoneNumber)
    {
        System.out.println("Sending"+name+"message"+phoneNumber);
    }
    
}
