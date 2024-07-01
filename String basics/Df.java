/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package df;

import java.util.Arrays;

/**
 *
 * @author Student
 */
public class Df {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello");
        char[] ch={'a','d','n','a','n','7'};       
        String string1 = new String(ch);
        String string2="this is easier string";
        System.out.println(ch[2]);
        System.out.println(string1.charAt(2));
        System.out.println(string1.length());
        System.out.println(string1.substring(3));
        System.out.println(string1.substring(3, 6));
        System.out.println(string1.equals(string2));
        
        String string3= string1.concat(string2);
        System.out.println(string3);
        
        String replaceString=string2.replace('n', 'a');
        System.out.println(replaceString);
        
        String replaceString2=string2.replace("is","was");
        System.out.println(replaceString2);
        
        
        String lower=string1.toLowerCase();
        System.out.println(lower);
        
        String upper=string1.toUpperCase();
        System.out.println(upper);
        
        String[] splittedString=string2.split(" ");
        
        
        for(int i=0;i<splittedString.length;i++)
        {
            System.out.println(splittedString[i]);
        }
        
        String str1=Integer.toString(1234);
        System.out.println(str1);
        
        String str2=Double.toString(1234);
        System.out.println(str2);
        
        String num="1234";
        int i=Integer.parseInt(num);
        System.out.println(i);
        
        String num2="1234";
        double d=Double.parseDouble(num2);
        System.out.println(d);
                
    }
    
    
    
}
