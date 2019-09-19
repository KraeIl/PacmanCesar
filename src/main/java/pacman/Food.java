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
public class Food extends Piece{
    public boolean eated = false;
    
    public void eaten(){ 
        eated = true;
    }

    public Food(){
    this.color = new Color(217, 162, 52);
    }
    
    @Override
    public void draw(Graphics g) {
      if(eated == false){
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height);
  }
 }
}