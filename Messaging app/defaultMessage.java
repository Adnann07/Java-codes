/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author HP
 */
public class defaultMessage implements Messenger {
    @Override
    public void send(String X,String Y)
    {
        System.out.println("Sending to "+X+" the message: "+Y);
    }
    @Override
    public void recieve(String X,String Y)
    {
        System.out.println(X+"send you the message: "+Y);
    }
}
