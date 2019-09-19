/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import sun.awt.AWTAccessor;

/**
 *
 * @author elio_alves
 */
public class Game extends JFrame implements KeyListener{
    private Stage stage;
    Pac pac = new Pac();
    
    public Game(){
        super("Pacman");
             
        Dimension d = new Dimension(800, 600);
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
        pac.velx = +1;
        pac.vely = 0;
        pac.angA = 30;
        pac.xo = 16;
        pac.yo = 6;
       }
          //Esquerda//
       if (c == 65){
        pac.velx = -1;
        pac.vely = 0;
        pac.angA = 210;
        pac.xo = 16;
        pac.yo = 6;
       }
          //Cima//
       if (c == 87){
        pac.vely = -1;
        pac.velx = 0;
        pac.angA = 120;
        pac.xo = 8;
        pac.yo = 14;
       }
          
          //Baixo//
       if (c == 83){
        pac.vely = +1;
        pac.velx = 0;
        pac.angA = 300;
        pac.xo = 8;
        pac.yo = 14;
        }
     }
      @Override
     public void keyReleased(KeyEvent e){ 
     } 
        
 }
    