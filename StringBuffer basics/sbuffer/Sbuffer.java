/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sbuffer;

/**
 *
 * @author Student
 */
public class Sbuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StringBuffer sb=new StringBuffer("hello");
        sb.append("see");
        System.out.println("sb");
        sb.insert(9,"1234");
        System.out.println(sb);
        
        sb.replace(6, 9, "Java");
        System.out.println(sb);
        
        sb.delete(6,10);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(2));
        
    }
    
}
