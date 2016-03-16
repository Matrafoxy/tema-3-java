/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.lab4;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author tudor
 */
public class MainLab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    LabyrinthMatrixImpl lab,lab1;
    
         File file=new File("src/labyrinth.txt");
try{  
if(file.exists()){
     System.out.println("The file already exists");
    
}
else
    {
            try {
                file.createNewFile();
            } catch (Exception e) {
                
			System.out.println(e.toString());
            }}
  Scanner  input = new Scanner(file);
    
int n=0,m=0,mat[][],mat2[][];
    if(input.hasNext()){
        n=input.nextInt();}
      if(input.hasNext()){
        m=input.nextInt();}
      mat=new int[n][m];mat2=new int[n][m];
for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
       if(input.hasNext())
       mat[i][j]=input.nextInt();
   for(int i=0;i<n;i++)
    System.arraycopy(mat[i], 0, mat2[i], 0, m);

lab1 =new LabyrinthMatrixImpl(n,m,mat);

Pair p=lab1.getStartCell();

LabyrinthSolverAuto solver=new LabyrinthSolverAuto(lab1);
solver.Solve(p,0);
//LabyrinthViewImpl y=new LabyrinthViewImpl(lab);
//System.out.println(y.toString());
lab =new LabyrinthMatrixImpl(n,m,mat2);
LabyrinthViewImpl y=new LabyrinthViewImpl(lab);
System.out.println(y.toString());
int g=0,i,j;
Scanner com=new Scanner(new InputStreamReader(System.in));
String comanda;
 p=lab.getStartCell();Pair p2;
System.out.println(p.geti());
LabyrinthSolverImpl slv=new LabyrinthSolverImpl(lab);
while(g==0){
    System.out.println("dati comanda:"+'\n');
    comanda=com.nextLine();
    if(comanda.equals("U")){
        p2=new Pair(p.geti()-1,p.getj());
        int x=slv.nextCelltoExplore(p2);
        if(x==1)
            g=1;
        else
            if(x==0)
                p=p2;
        //System.out.println(slv.nextCelltoExplore(p2));
    }
    else if(comanda.equals("D")){
        p2=new Pair(p.geti()+1,p.getj());
        int x=slv.nextCelltoExplore(p2);
        if(x==1)
            g=1;
        else
            if(x==0)
                p=p2;
        //System.out.println(slv.nextCelltoExplore(p2));
    }
    else if(comanda.equals("L")){
         p2=new Pair(p.geti(),p.getj()-1);
        int x=slv.nextCelltoExplore(p2);
        if(x==1)
            g=1;
        else
            if(x==0)
                p=p2;
        //System.out.println(slv.nextCelltoExplore(p2));
        
    }
    else if(comanda.equals("R")){
         p2=new Pair(p.geti(),p.getj()+1);
       int x=slv.nextCelltoExplore(p2);
        if(x==1)
            g=1;
        else
            if(x==0)
                p=p2;
        
        //System.out.println(slv.nextCelltoExplore(p2));
    }
   else
        System.out.println("comanda incorecta");
}
System.out.println("end");



}
    catch(FileNotFoundException e){
 //Argumente pentru tratarea exceptiilor
  
                                System.err.println(e.getMessage());
                               }

    
    
    
 



    }
}