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
public class LabyrinthViewImpl implements LabyrinthView  {
    LabyrinthMatrixImpl mat;
    LabyrinthViewImpl(LabyrinthMatrixImpl x){
        mat=x;
    }
    @Override
 public LabyrinthMatrixImpl getLabyrinth(){
 return mat;
 }
    @Override
    public  void setLabyrinth(LabyrinthMatrixImpl x){
mat=x;
}
    @Override
 public String toString(){
     StringBuilder sb=new StringBuilder();
     int n=mat.getRowCount();
     int m=mat.getRowCount();
     for(int i=0;i<n;i++){
       sb.append('|');
       for(int j=0;j<m;j++){
           if(mat.isFreeAt(i, j))
               sb.append(" |");
           else if(mat.isWallAt(i, j))
                  sb.append("*|");
           else if(i==mat.getStartCell().geti()&&j==mat.getStartCell().getj())
                 sb.append("S|");
           else if(i==mat.getFinishCell().geti()&&j==mat.getFinishCell().getj())
                 sb.append("F|");
             else
                if(mat.getLabyrinth()[i][j]==3)
                    sb.append("X|");
       }
       sb.append('\n');
             
 }
return sb.toString();}
}

