/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author user
 */
  abstract class Messenger implements VideoCall{
    @Override
    public void call(String phoneNumber)
    {
        System.out.println("Number: "+phoneNumber);
    }
    @Override
    public void opencamera(String camera)
    {
        System.out.println("opening camera");
    }
    
    
    
    
}
