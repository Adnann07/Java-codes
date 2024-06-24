/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author HP
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        whatsapp w1=new whatsapp();
        
        w1.status("seen");
        w1.send("emon", "cat image");
        w1.recieve("adnan", "cat image");
        
        defaultMessage d1=new defaultMessage();
        d1.send("adnan", "car image");
        d1.recieve("emon", "car image");
    }
    
}
