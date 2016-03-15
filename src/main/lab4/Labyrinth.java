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
public  interface Labyrinth {
     int getRowCount();
     int getColumnCount();

     Boolean isFreeAt(int i,int j);
     Boolean isWallAt(int i,int j);
     Pair getStartCell();
     Pair getFinishCell();
     }
