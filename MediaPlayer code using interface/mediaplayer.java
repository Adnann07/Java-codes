/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Student
 */
abstract class mediaplayer implements MusicPlayer,videoplayerr {
    @Override
    public void play(String F){
        System.out.println("playing music");
    }
    
    @Override
     public void add(String S, String F)
    {
        System.out.println("add subtitles ");
    }
     
     public void record(String F, double D, double S)
     {
         System.out.println("File: "+F+"Recorded for"+D+"seconds");
         System.out.println("Changing Speed of file: "+F+"to speed"+S);
     }
     
     
}
