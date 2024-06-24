/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author Student
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GrooveMusic g1=new GrooveMusic();
        g1.play("random love song");
        
        VLC v1=new VLC();
        v1.play("Motivational song");
        v1.add("motivational song", "Motivational song list");
        v1.stream("youtube.com");
        v1.record("Motivational song", 50.5, 1.25);
    }
    
}
