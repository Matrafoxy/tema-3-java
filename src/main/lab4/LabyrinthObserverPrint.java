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
public class LabyrinthObserverPrint implements LabyrinthObserver {
    LabyrinthMatrixImpl lab;
    LabyrinthObserverPrint(LabyrinthMatrixImpl x){
        lab=x;
    }
    
    @Override
    public void processCell(Pair p){
        lab.getLabyrinth()[p.geti()][p.getj()]=3;
        LabyrinthViewImpl view=new LabyrinthViewImpl(lab);
        processSolution(view);
        
    }
    public void processSolution(LabyrinthViewImpl x){
        System.out.println(x.toString());
}
}