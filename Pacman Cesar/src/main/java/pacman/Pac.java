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
 * @author Cesar Costa
 */
public class Pac extends PieceMove {
    public int killer;
    public int score;
    public int live;
    public int angA;
    public int xo;
    public int yo;
    
    public Pac(){
     this.width = 38;
     this.height = 38;
     this.color = new Color(237, 235, 0);
     this.x = 380;
     this.y = 427;
     this.velx = 0;
     this.vely = 0;
     this.angA = 30;
     this.xo = 16;
     this.yo = 6;
    }
    
    public void collide(Block a) {
        // pontos PAC
        int p1x = this.x;
        int p1y = this.y;
        
        int p2x = this.x+this.width;
        int p2y = this.y;
        
        int p3x = this.x+this.width;
        int p3y = this.y+this.height;
        
        int p4x = this.x;
        int p4y = this.y+this.height;
        
        // pontos BLOCO
        int a1x = a.x;
        int a1y = a.y;
        
        int a2x = a.x+a.width;
        int a2y = a.y;
        
        int a3x = a.x+a.width;
        int a3y = a.y+a.height;
        
        int a4x = a.x;
        int a4y = a.y+a.height;
        
        //Distancia antes da colisão pac
        int d1x = p1x - a2x;
        int d1y = p1y - a4y;
        int d2x = a1x - p2x;
        int d2y = p2y - a3y;
        int d3y = a2y - p3y;
        int d3x = a4x - p3x;
        int d4x = p4x - a3x;
        int d4y = a4y - p4y;
                
        //Condições
        boolean c = false;
                
        //PONTO PAC P1
        // dentro em x
        if(p1x>=a1x && p1x<=a2x){
            // dentro em y
            if(p1y>=a1y && p1y<=a4y){ 
               if(velx == -1 && vely == 0){
                this.x = x - d1x + 1;
                this.velx = 0;
                this.vely = 0;
                c = true; 
               }
               if(velx == 0 && vely == -1){    
                this.y = y + d1y + 1;
                this.velx = 0;
                this.vely = 0;
                c = true;
               }
           }
         }
        
        //PONTO PAC P
        // dentro em x
        if(p2x>=a1x && p2x<=a2x){
            // dentro em y
            if(p2y>=a1y && p2y<=a4y){ 
               if(velx == +1 && vely == 0){
                this.x = x + d2x - 1;
                this.velx = 0;
                this.vely = 0;
                c = true; 
               }
               if(velx == 0 && vely == -1){    
                this.y = y + d2y + 1;
                this.velx = 0;
                this.vely = 0;
                c = true;
               }
           }
         }
        
        //PONTO PAC P3
        // dentro em x
        if(p3x>=a1x && p3x<=a2x){
            // dentro em y
            if(p3y>=a1y && p3y<=a4y){ 
               if(velx == +1 && vely == 0){
                this.x = x - d3x - 1;
                this.velx = 0;
                this.vely = 0;
                c = true; 
               }
               if(velx == 0 && vely == +1){    
                this.y = y - d3y - 1;
                this.velx = 0;
                this.vely = 0;
                c = true;
               }
           }
         }
        
        //PONTO PAC P4
        // dentro em x
        if(p4x>=a1x && p4x<=a2x){
            // dentro em y
            if(p4y>=a1y && p4y<=a4y){ 
               if(velx == -1 && vely == 0){
                this.x = x - d1x + 1;
                this.velx = 0;
                this.vely = 0;
                c = true; 
               }
               if(velx == 0 && vely == -1){    
                this.y = y - d1y - 1;
                this.velx = 0;
                this.vely = 0;
                c = true;
               }
           }
         }
       }
    
    public void eat(Food f){
    }
    
    public void eat(Ghost g){
    }
    
    public void eat(Boost b){
    }
    
    public void die(){
    }
     // Sprites Pac //
    
    @Override
    public void draw(Graphics g) {
        // !!PAC!! //
        // Corpo //
       
       g.setColor(color); 
       g.fillArc(x, y, width, height, angA, 300);
       
      
       // Olhos // 
       g.setColor(Color.BLACK);
       g.fillOval(x + xo, y + yo, 6, 8);
      }
    
       

   

    
    
    
        
}
    

  


