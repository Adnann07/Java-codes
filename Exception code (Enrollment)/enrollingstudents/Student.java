/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enrollingstudents;

/**
 *
 * @author HP
 */
public class Student extends Enroll{
    void Upload(String filename)
    {
        if((filename.startsWith("180204") | filename.startsWith("180104") | filename.startsWith("170204")) && filename.endsWith(".zip"))
        {
            System.out.println("");
        }
        else
        {
            throw new IllegalArgumentException("invalid");
        }
    }
}
