/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evenoroddthread;

/**
 *
 * @author HP
 */
public class oddnumbers implements Runnable{
    @Override
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2!=0)
            {
                System.out.println("odd: "+i);
            }
        }
    }
    
}
