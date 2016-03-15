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
public class LabyrinthSolverAuto implements LabyrinthSolver{
    Labyrinth lab;
    int m=lab.getColumnCount(), n=lab.getRowCount();
    LinkedList<Pair> list=new LinkedList<>();
    Pair[] pairs=new Pair[n*m];
    LabyrinthSolverAuto(Labyrinth x){
    lab=x;
    }
    @Override
    public Labyrinth getLabyrinth(){
        return lab;
    }
    @Override
  public void setLabyrinth( LabyrinthMatrixImpl x){
      lab=x;
  }

    @Override
  public int nextCelltoExplore(Pair poz){
     return 1;
  }
  
  public void Solve(Pair poz,int i){
     Pair[] p1=new Pair[4];
      if(poz.geti()>0) 
       if(lab.isFreeAt(poz.geti()-1,poz.getj())){
           p1[i++]=new Pair(poz.geti()-1,poz.getj());
       }
      if(poz.getj()>0){
          if(lab.isFreeAt(poz.geti(),poz.getj()-1)){
          p1[i++]=new Pair(poz.geti(),poz.getj()-1);}
      }
     if(poz.geti()+1>0){
      if(lab.isFreeAt(poz.geti()+1,poz.getj())){
          p1[i++]=new Pair(poz.geti()+1,poz.getj());}
       else
          if(lab.getFinishCell().geti()+1==poz.geti()&&lab.getFinishCell().getj()==poz.getj())
              System.out.println("finish");  
     }
    if(poz.getj()+1>0){
      if(lab.isFreeAt(poz.geti(),poz.getj()+1)){
          p1[i++]=new Pair(poz.geti(),poz.getj()+1);}
      else
          if(lab.getFinishCell().geti()==poz.geti()&&lab.getFinishCell().getj()+1==poz.getj())
              System.out.println("finish");
    }
  if(i>1)
      list.addFirst(poz);
  
  }
}
