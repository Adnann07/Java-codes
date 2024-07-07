/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package companydemo;

/**
 *
 * @author HP
 */
public class Company {
    public String Convert(String in)
    {
        String[] words=in.split(" ");
        StringBuilder sb= new StringBuilder();
        
        for(String word:words)
        {
            sb.append(new StringBuilder(word).reverse().toString());
            sb.append(" ");
        }
        return sb.toString().trim().toUpperCase();
    }
}
