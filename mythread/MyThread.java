/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mythread;

/**
 *
 * @author Student
 */
public class MyThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producer p1=new Producer("Islam Mahkachev");
        Thread t1=new Thread(p1);
        
        Producer p2=new Producer("Khabib 'THE EAGLE' Nurmagomedov");
        Thread t2=new Thread(p2);
        
        Producer p3=new Producer("Alex Perira");
        Thread t3=new Thread(p3);
        
        System.out.println(t1.isAlive());
        t1.start();
        t2.start();
        t3.start();
        
        try
        {
            t1.join();
            t2.join();
        }
    catch(InterruptedException ex)
        {
            ex.printStackTrace();
            System.out.println(ex);
        }
        System.out.println("Main thread");
    }

    
    
}
