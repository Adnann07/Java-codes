/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package typespeed;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author HP
 */
public class TypeSpeed {

    /**
     * @param args the command line arguments
     */
    static String[] words ={"cobra","biscuits","programmer","there","homie","wild","person","idea","cap","cat","cambridge","calculus","integration"};
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        System.out.println("3");
        
        TimeUnit.SECONDS.sleep(1);
       
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
        Random rand= new Random();
        for(int i=0;i<15;i++)
        {
             System.out.print(words[rand.nextInt(9)]+" ");
             
             
             
        }
        System.out.println();
        double start= LocalTime.now().toNanoOfDay();
        Scanner input= new Scanner(System.in);
        String typedWords=input.nextLine();
        double end=LocalTime.now().toNanoOfDay();
        double elapsedTime= end-start;
        double seconds=elapsedTime / 1000000000.0;
        
        
        int numofchar=typedWords.length();
        int wpm=(int) ((((double) numofchar / 5) / seconds)*60);
        
         
        System.out.println("your WPM: "+wpm);
        
        
        
    }
    
}
