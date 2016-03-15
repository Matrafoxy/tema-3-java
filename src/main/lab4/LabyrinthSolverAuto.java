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
public class LabyrinthSolverAuto implements LabyrinthSolver{
    Labyrinth lab;
    
    LabyrinthSolverAuto(Labyrinth x){
    lab=x;
    }
    @Override
    public Labyrinth getLabyrinth(){
        return lab;
    }
    @Override
  public void SetLabirinth( Labyrinth x){
      lab=x;
  }

    @Override
  public Pair nextCelltoExplore(Pair poz){
      return poz;
  }
}
