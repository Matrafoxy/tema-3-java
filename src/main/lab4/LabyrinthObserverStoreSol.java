/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.lab4;

/**
 *
 * @author tudor
 */
public class LabyrinthObserverStoreSol  implements LabyrinthObserver{
    Labyrinth lab;
    String[] sol;
    static int i=0;
    LabyrinthObserverStoreSol(Labyrinth x){
        lab=x;
    }
    
    public void processCell(Pair p){
        
    }
    public void processSolution(LabyrinthViewImpl x){
        sol[i++]=x.toString();
    }
}
