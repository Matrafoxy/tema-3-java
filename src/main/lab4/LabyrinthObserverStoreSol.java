/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.lab4;
import java.util.*;
/**
 *
 * @author tudor
 */
public class LabyrinthObserverStoreSol  implements LabyrinthObserver{
    Labyrinth lab;
    LinkedList<String> sol=new LinkedList<>();
    static int i=0;
    LabyrinthObserverStoreSol(LabyrinthMatrixImpl x){
        lab=x;
    }
    
    public void processCell(Pair p){
        
    }
    public void processSolution(LabyrinthViewImpl x){
        
        sol.addFirst(x.toString());
    }
}
