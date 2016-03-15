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
public interface LabyrinthSolver {
     

 public Labyrinth getLabyrinth();
  public void setLabyrinth( LabyrinthMatrixImpl x);

  public int nextCelltoExplore(Pair poz);
   



}
