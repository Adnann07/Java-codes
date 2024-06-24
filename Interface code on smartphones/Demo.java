/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author user
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Samsung s1=new Samsung();
        s1.call("01234567");
        s1.sendsms("hey", "James");
        s1.savingcontacts("Rimon", "0151234567");
        
        Messenger m1=new Messenger() {};
        m1.call("0122222222");
        m1.opencamera("frong cam");
        m1.addfilter("tokyo");
     
    }
    
}
