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
public class LabyrinthMatrixImpl implements Labyrinth {
 private int row,col,lab[][];

    
 LabyrinthMatrixImpl(int r,int c,int[][] labirinth){
 row=r;
 col=c;
 //lab= new int[row][col];
 lab=labirinth;
 }
 @Override
    public int getRowCount() {
        return row;
    }

    public void setCell(int i,int j){
    lab[i][j]=3;
}
    @Override
    public int getColumnCount() {
  return col;
    }
    public int[][] getLabyrinth(){
        return lab;
    }

 @Override
    public Boolean isFreeAt(int x,int y) {
     return lab[x][y]==0;
         }

    
 @Override
    public Boolean isWallAt(int x,int y){
     return lab[x][y]==1;
        }
    @Override
    public Pair getStartCell() {
        Pair p;
        for(int i=0;i<row;i++)
          for(int j=0;j<col;j++)
            if(lab[i][j]==-1)
            {
                p=new Pair(i,j);
                return p;
              }
   return null; }
   
 @Override
    public Pair getFinishCell() {
    Pair p;
        for(int i=0;i<row;i++)
          for(int j=0;j<col;j++)
            if(lab[i][j]==2)
            {
                p=new Pair(i,j);
                return p;
              }
     return null;
    }
    
}
