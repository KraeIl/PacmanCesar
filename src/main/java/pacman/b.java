/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author desenv12
 */
public class b {
    public static void main(String args[]){
        File file = new File("/home/desenv12/Área de Trabalho/texto.txt");
        FileInputStream input;
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        try{
            input = new FileInputStream(file);
            
            while(true){
                int c = input.read();
                if(c==-1){
                    break;
                }
                ba.write(c);
            }
            String conteudoArquivo = new String(ba.toByteArray());
            System.out.println(conteudoArquivo);
        }catch(FileNotFoundException ex){
            System.out.println("Nao consegui ler o seu arquivo");
        }catch(IOException ex){
            System.out.println("Xiii nao consegui ler");
        }
    }
}