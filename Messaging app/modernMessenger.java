/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author HP
 */
public abstract class modernMessenger implements Messenger,caller{ //abstract e override hobe 
     @Override //eije override
     //abstract nijei public hbe
     public void send(String X,String Y) //abstract e public
     {
         System.out.println("Sending to"+X+"the image: "+Y+".jpg");
     }
     @Override
    public void recieve(String X,String Y)
     {
         System.out.println(X+"Send you the image: "+Y+".jpg");
     }
    
}
