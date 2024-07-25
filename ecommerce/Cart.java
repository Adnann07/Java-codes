/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author HP
 */
public class Cart {
    private int userID;
    public Cart(int userID)
    {
        this.userID=userID;
    }
    public void setuderID(int userID)
    {
        this.userID=userID;
    }
    public int getuserID()
    {
        return userID;
    }
    
    public void itemArray(Item[] items)
    {
        double totalPrice=0.0;
        
        for (Item item : items) {
            totalPrice += item.getitemPrice();
        }
        if(totalPrice>5000)
        {
            System.out.println("too many items");
            
        }
        else
        {
            System.out.println(totalPrice);
        }
    }
}
