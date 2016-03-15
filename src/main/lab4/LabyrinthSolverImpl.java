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
public class LabyrinthSolverImpl implements LabyrinthSolver {
    LabyrinthMatrixImpl lab;
     LabyrinthObserverPrint print;//=new LabyrinthObserverPrint(lab);
    LabyrinthObserverStoreSol store;
    LabyrinthSolverImpl(LabyrinthMatrixImpl x){
        lab=x;
        print=new LabyrinthObserverPrint(lab);
        store=new LabyrinthObserverStoreSol(lab);
    }
    @Override
    public Labyrinth getLabyrinth(){
        return lab;
    }
    @Override
  public void setLabyrinth(LabyrinthMatrixImpl x){
      lab=x;
  }

    @Override
  public int nextCelltoExplore(Pair poz){
 
      if(poz.geti()>=0&&poz.getj()>=0){
          if(lab.isFreeAt(poz.geti(), poz.getj())){
                  print.processCell(poz);
                   return 0;}
        /*if(lab.isWallAt(poz.geti(), poz.getj()))   
            System.out.println("wall");
          */
          if(lab.getFinishCell().geti()==poz.geti()&&lab.getFinishCell().getj()==poz.getj())
          {LabyrinthViewImpl view=new LabyrinthViewImpl(lab);
              store.processSolution(view);
              return 1;
          }
      }
      else System.out.println("miscaare imposibila");
return 2;
  }
}
