/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author desenv12
 */
public class a {
  
    public static void main(String args[]){
        File texto1 = new File("/home/desenv12/Área de Trabalho/texto1.txt");
        FileOutputStream out;
        for(int i=0; i<3; i++){
         try{
           
            
            String nome = "Eliao\nAlvaes";
            String pontuação = "\n12";
            out = new FileOutputStream(texto1);
            
            out.write(nome.getBytes());
            out.write(pontuação.getBytes());
            out.close();
           }
  
        catch(FileNotFoundException ex){
            System.out.println("Xiiii");
        }catch(IOException ex){
            System.out.println("ferrou");
        }
     }
    }
}

