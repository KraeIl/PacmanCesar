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
public class Boost extends Piece{
    public void eaten(){
        
    }
    
    public Boost(){
     this.width = 15;
     this.height = 15;
     this.color = new Color(127, 252, 3);
         }    

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
}
