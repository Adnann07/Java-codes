/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenoroddthread;

/**
 *
 * @author HP
 */
public class EvenorOddThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread eventhread = new Thread(new evennumbers());
        Thread oddthread= new Thread(new oddnumbers());
        
        eventhread.start();
        oddthread.start();
    }
    
}
