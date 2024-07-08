/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mythread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class Producer implements Runnable{
    
    private String name;
    Producer(String name)
    {
        this.name=name;
    }
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(name);
            System.out.println("Producer thread: "+i);
        }
        
        try{
            Thread.sleep(1000);
        }
        
        catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

   
    
}