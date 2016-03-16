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
    
    int m, n;
     LabyrinthMatrixImpl lab;
     LabyrinthObserverPrint print;
       LabyrinthObserverStoreSol store;
    LinkedList<Pair> list=new LinkedList<>();
    Pair[] pairs=new Pair[n*m];
    LabyrinthSolverAuto(LabyrinthMatrixImpl x){
    lab=x;
     m=lab.getColumnCount(); n=lab.getRowCount();
    //Pair[] pairs=new Pair[n*m];
     print=new LabyrinthObserverPrint(lab);
        store=new LabyrinthObserverStoreSol(lab);
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
      if(poz.geti()>0) {
       if(lab.isFreeAt(poz.geti()-1,poz.getj())){//System.out.println(1);
           p1[i++]=new Pair(poz.geti()-1,poz.getj());}
         else
            if(lab.getFinishCell().geti()==poz.geti()-1&&lab.getFinishCell().getj()==poz.getj()){
               print.processCell(poz);  
               return;
       }}
      if(poz.getj()>0){
          if(lab.isFreeAt(poz.geti(),poz.getj()-1)){//System.out.println(2);
          p1[i++]=new Pair(poz.geti(),poz.getj()-1);}
          else
          if(lab.getFinishCell().geti()==poz.geti()&&lab.getFinishCell().getj()==poz.getj()-1){
               print.processCell(poz);return;
      }}
     if(poz.geti()+1<lab.getRowCount()){
      if(lab.isFreeAt(poz.geti()+1,poz.getj())){//System.out.println(3);
          p1[i++]=new Pair(poz.geti()+1,poz.getj());}
       else
          if(lab.getFinishCell().geti()==poz.geti()+1&&lab.getFinishCell().getj()==poz.getj()){
               print.processCell(poz);//System.exit(0);
                       
              System.out.println("finish"); return; }
     }
    if(poz.getj()+1<lab.getColumnCount()){System.out.println(lab.isFreeAt(poz.geti(),poz.getj()+1));
      if(lab.isFreeAt(poz.geti(),poz.getj()+1)){//System.out.println(lab.isFreeAt(poz.geti(),poz.getj()+1));
      System.out.println(poz.geti());System.out.println(poz.getj());    
      p1[i++]=new Pair(poz.geti(),poz.getj()+1);
      System.out.println(p1[0].geti());System.out.println(p1[0].getj());
      }
      else
          if(lab.getFinishCell().geti()==poz.geti()+i&&lab.getFinishCell().getj()==poz.getj()+1){
              System.out.println("finish"); 
              print.processCell(poz);
          return;
              }
    }
    System.out.println("i="+i);//System.out.println(i);
  if(i>1){
      //System.out.println(i);
     if(!(poz.geti()==lab.getStartCell().geti()&&poz.getj()==lab.getStartCell().getj())){
      list.addFirst(poz);
     //
      print.processCell(poz);}
     
     Solve(p1[0],0);}
  else if(i==1){
      if(!(poz.geti()==lab.getStartCell().geti()&&poz.getj()==lab.getStartCell().getj())){
          print.processCell(poz);
      }
      //System.out.println(p1[0].geti());System.out.println(p1[0].getj()); 
      Solve(p1[0],0);//System.out.println(p1[0].geti());System.out.println(p1[0].getj()); 
  }
  
  else
      if(i==0){//System.out.println("auci");
      if(!(list.isEmpty()))  
      {
          print.processCell(poz);
          Solve(list.getFirst(),0);}
  
  }
}
}
