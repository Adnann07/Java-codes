/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellothread;

/**
 *
 * @author HP
 */
public class HelloThread extends Thread{
    @Override
    public void run()
    {
        System.out.println("Hello,world");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HelloThread t1= new HelloThread();
        t1.start();
    }
    
}
