/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author elio_alves
 */
public class Ghost extends PieceMove{
    public boolean attack;
    
    public void kill(Object pac){
    }
    public void eaten(){
    }

    public Ghost(){
        this.width = 45;
        this.height = 45;
        this.attack = true;
        this.velx = 2;
        this.vely = 2;
        this.x = 377;
    }
    @Override
    public void draw(Graphics g) {
           // !!GHOSTS!! //
                
                // corpo //
       g.setColor(color);
       g.fillArc(x + 1, y, width - 1, height, 0, 360);
       g.fillRect(x + 1, y+23, width - 1, 22);
       
               // olhos //     
       g.setColor(Color.BLACK);
       g.fillOval(x + 15, y+13, 6, 8);
       
       g.setColor(Color.WHITE);
       g.fillOval(x + 15, y+16, 3, 4);
               
       g.setColor(Color.BLACK);
       g.fillOval(x + 27, y+13, 6, 8);
       
       g.setColor(Color.WHITE);
       g.fillOval(x + 27, y+16, 3, 4);
       
             // Detalhes da roupinha //
             
       g.setColor(Color.BLACK);
       g.fillOval(x + 1 , y + 40, 3, 6);
       
       g.setColor(Color.BLACK);
       g.fillOval(x + 6 , y + 40, 4, 6);
       
       g.setColor(Color.BLACK);
       g.fillOval(x + 12 , y + 40, 4, 6);
       
       g.setColor(Color.BLACK);
       g.fillOval(x + 18 , y + 40, 4, 6);
       
       g.setColor(Color.BLACK);
       g.fillOval(x + 24 , y + 40, 4, 6);
       
       g.setColor(Color.BLACK);
       g.fillOval(x + 30 , y + 40, 4, 6);
       
       g.setColor(Color.BLACK);
       g.fillOval(x + 36 , y + 40, 4, 6);
       
       g.setColor(Color.BLACK);
       g.fillOval(x + 42 , y + 40, 3, 6);
         
    }
}
