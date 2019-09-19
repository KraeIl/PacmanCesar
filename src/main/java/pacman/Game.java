/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author elio_alves
 */
public class Game extends JFrame implements KeyListener{
    private Stage stage;
    Pac pac = new Pac();
    
    public Game(){
        super("Pacman");
             
        Dimension d = new Dimension(805, 600);
        setMinimumSize(d);
        setMaximumSize(d);
        setSize(d);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        setVisible(true);
                   
        stage = new Stage();
        stage.pac = pac;
        
        add(stage); 
        addMove();
    }
    
   //!!LISTENER!!//
      public void addMove(){
       addKeyListener(this);
      }
      
      @Override
      public void keyTyped(KeyEvent e) {
      }
    
        @Override
      public void keyPressed(KeyEvent e){
      int c = e.getKeyCode();   
      
      
          //Direita//
       if (c == 68){
        Rectangle checkDireito = new Rectangle (pac.x + pac.width, pac.y, pac.width, pac.height);
        boolean canNotMoveRight = false;
        for (Block b: stage.blocks) {
            Rectangle block = new Rectangle(b.x, b.y, b.width, b.height);
             if(checkDireito.intersects(block)){
               canNotMoveRight = true;
               break;
         }
        } 
        if(pac.vely !=0 || pac.velx !=0){
           if(canNotMoveRight == false){
             pac.mR = true;
             pac.move();
             pac.mR = false;  
           }
        }
        else {
          if(pac.velx == 0 && pac.vely == 0){
             if (canNotMoveRight == false){
              pac.mR = true;
              pac.move();
              pac.mR = false;    
             } 
          }
        }
       }
          //Esquerda//
       if (c == 65){
        
        Rectangle checkEsquerdo = new Rectangle (pac.x - pac.width, pac.y, pac.width, pac.height);
        boolean canNotMoveLeft = false;
        for (Block b: stage.blocks) {
            Rectangle block = new Rectangle(b.x, b.y, b.width, b.height);
             if(checkEsquerdo.intersects(block)){
               canNotMoveLeft = true;
               break;
         }
        } 
        if(pac.vely !=0 || pac.velx !=0){
           if(canNotMoveLeft == false){
             pac.mL = true;
             pac.move();
             pac.mL = false;  
           }
        }
        else {
          if(pac.velx == 0 && pac.vely == 0){
             if (canNotMoveLeft == false){
              pac.mL = true;
              pac.move();
              pac.mL = false;    
             } 
          }
        }
       }
          //Cima//
       if (c == 87){
          
        Rectangle checkCima = new Rectangle (pac.x, pac.y - pac.height, pac.width, pac.height);
        boolean canNotMoveUp = false;
        for (Block b: stage.blocks) {
            Rectangle block = new Rectangle(b.x, b.y, b.width, b.height);
             if(checkCima.intersects(block)){
               canNotMoveUp = true;
               break;
         }
        } 
        if(pac.vely !=0 || pac.velx !=0){
           if(canNotMoveUp == false){
             pac.mU = true;
             pac.move();
             pac.mU = false;  
           }
        }
        else {
          if(pac.velx == 0 && pac.vely == 0){
             if (canNotMoveUp == false){
              pac.mU = true;
              pac.move();
              pac.mU = false;    
             } 
          }
        }
       }
          //Baixo//
       if (c == 83){
           
        Rectangle checkBaixo = new Rectangle (pac.x, pac.y + pac.height, pac.width, pac.height);
        boolean canNotMoveDown = false;
        for (Block b: stage.blocks) {
            Rectangle block = new Rectangle(b.x, b.y, b.width, b.height);
             if(checkBaixo.intersects(block)){
               canNotMoveDown = true;
               break;
         }
        } 
        if(pac.vely !=0 || pac.velx !=0){
           if(canNotMoveDown == false){
             pac.mD = true;
             pac.move();
             pac.mD = false;  
           }
        }
        else {
          if(pac.velx == 0 && pac.vely == 0){
             if (canNotMoveDown == false){
              pac.mD = true;
              pac.move();
              pac.mD = false;    
             } 
          }
        }
       }
     }
     @Override
     public void keyReleased(KeyEvent e){ 
     } 
        
 }
    