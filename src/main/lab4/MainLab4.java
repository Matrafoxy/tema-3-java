/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author tudor
 */
public class MainLab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Labyrinth lab;
         File file=new File("src/labyrinth.txt");
try{  
if(file.exists()){
     System.out.println("The file already exists");
    
}
else
    {
            try {
                file.createNewFile();
            } catch (Exception e) {
                
			System.out.println(e.toString());
            }}
    Scanner input = new Scanner(file);
    }
    catch(FileNotFoundException e){
 //Argumente pentru tratarea exceptiilor
  
                                System.err.println(e.getMessage());
                               }

    
    
    }





}