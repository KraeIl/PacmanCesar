/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


/**
 *
 * @author Cesar Costa
 */
public class Pac extends PieceMove{
    public long timeBoost;
    public int killer;
    public int score;
    public int live;
    public int angA;
    public int xo;
    public int yo;
    private int d;
    private int sprite;
    public int AngO;
    boolean mL;
    boolean mR;
    boolean mU;
    boolean mD; 
    
    
    public Pac(){
     this.live = 3;
     this.width = 32;
     this.height = 32;
     this.color = new Color(237, 235, 0);
     this.x = 382;
     this.y = 437;
     this.velx = 0;
     this.vely = 0;
     this.angA = 30;
     this.xo = 14;
     this.yo = 5;
     this.sprite = 1;
     this.d = 1;
     this.AngO = 200;
     }
    
    public void collide(Block a) {
        int p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y;
        int a1x, a1y, a2x, a2y, a3x, a3y, a4x, a4y; 
        
        // pontos PAC
        p1x = this.x;
        p1y = this.y;
        
        p2x = this.x+this.width;
        p2y = this.y;
        
        p3x = this.x+this.width;
        p3y = this.y+this.height;
        
        p4x = this.x;
        p4y = this.y+this.height;
        
        // pontos BLOCO
        a1x = a.x;
        a1y = a.y;
        
        a2x = a.x+a.width;
        a2y = a.y;
        
        a3x = a.x+a.width;
        a3y = a.y+a.height;
        
        a4x = a.x;
        a4y = a.y+a.height;
        
       for(int i=0; i<2; i++){
        //Condições
        boolean c = false;
        
        
        if(i==1){        
        
        //Distancia antes da colisão pac
        int d1x = a2x - p1x;
        int d1y = a4y - p1y;
        int d2x = p2x - a1x;
        int d2y = a3y - p2y;
        int d3y = p3y - a2y;
        int d3x = p3x - a4x;
        int d4x = a3x - p4x;
        int d4y = p4y - a2y;       
        
                
        //PONTO PAC P1
        // dentro em x
        if(p1x>a1x && p1x<a2x){
            // dentro em y
            if(p1y>a1y && p1y<a4y){ 
               if(velx == -2 && vely == 0){
                this.x = x + d1x;
                this.velx = 0;
                this.vely = 0;
                c = true; 
               }
               if(velx == 0 && vely == -2){    
                this.y = y + d1y;
                this.velx = 0;
                this.vely = 0;
                c = true;
               }
           }
         }
        
        //PONTO PAC P2
        // dentro em x
        if(p2x>a1x && p2x<a2x){
            // dentro em y
            if(p2y>a1y && p2y<a4y){ 
               if(velx == +2 && vely == 0){
                this.x = x - d2x;
                this.velx = 0;
                this.vely = 0;
                c = true; 
               }
               if(velx == 0 && vely == -2){    
                this.y = y + d2y;
                this.velx = 0;
                this.vely = 0;
                c = true;
               }
           }
         }
        
        //PONTO PAC P3
        // dentro em x
        if(p3x>a1x && p3x<a2x){
            // dentro em y
            if(p3y>a1y && p3y<a4y){ 
               if(velx == +2 && vely == 0){
                this.x = x - d3x;
                this.velx = 0;
                this.vely = 0;
                c = true; 
               }
               if(velx == 0 && vely == +2){ 
                
                this.y = y - d3y;
                this.velx = 0;
                this.vely = 0;
                c = true;
               
             }
            }
           }
        
        //PONTO PAC P4
        // dentro em x
        if(p4x>a1x && p4x<a2x){
            // dentro em y
            if(p4y>a1y && p4y<a4y){ 
               if(velx == -2 && vely == 0){
                this.x = x + d4x;
                this.velx = 0;
                this.vely = 0;
                c = true; 
               }
               if(velx == 0 && vely == +2){    
                this.y = y - d4y;
                this.velx = 0;
                this.vely = 0;
                c = true;
               }
           }
         }
         c = false;
       }
        else{
        
        //Distancia antes da colisão bloco
        int d1x = p2x - a1x;
        int d1y = p4y - a1y;
        int d2x = a2x - p1x;
        int d2y = p3y - a2y;
        int d3y = a3y - p2y;
        int d3x = a3x - p4x;
        int d4x = p3x - a4x;
        int d4y = a4y - p1y;
        
        
                
        //PONTO BLOCO A1
        // dentro em x
        if(a1x>p1x && a1x<p2x){
            // dentro em y
            if(a1y>p1y && a1y<p4y){ 
               if(velx == +2 && vely == 0){
                this.x = x - d1x;
                this.velx = 0;
                this.vely = 0;
                c = true; 
               }
               if(velx == 0 && vely == +2){    
                this.y = y - d1y;
                this.velx = 0;
                this.vely = 0;
                c = true;
               }
           }
         }
        
        //PONTO BLOCO A2
        // dentro em x
        if(a2x>p1x && a2x<p2x){
            // dentro em y
            if(a2y>p1y && a2y<p4y){ 
               if(velx == -2 && vely == 0){
                this.x = x + d2x;
                this.velx = 0;
                this.vely = 0;
                c = true; 
               }
               if(velx == 0 && vely == +2){    
                this.y = y - d2y;
                this.velx = 0;
                this.vely = 0;
                c = true;
               }
           }
         }
        
        //PONTO BLOCO A3
        // dentro em x
        if(a3x>p1x && a3x<p2x){
            // dentro em y
            if(a3y>p1y && a3y<p4y){ 
               if(velx == -2 && vely == 0){
                this.x = x + d3x;
                this.velx = 0;
                this.vely = 0;
                c = true; 
               }
               if(velx == 0 && vely == -2){   
                this.y = y + d3y;
                this.velx = 0;
                this.vely = 0;
                c = true;
               }
           }
         }
        
        //PONTO BLOCO A4
        // dentro em x
        if(a4x>p1x && a4x<p2x){
            // dentro em y
            if(a4y>p1y && a4y<p4y){ 
               if(velx == +2 && vely == 0){
                this.x = x - d4x;
                this.velx = 0;
                this.vely = 0;
                c = true; 
               }
               if(velx == 0 && vely == -2){    
                this.y = y + d4y;
                this.velx = 0;
                this.vely = 0;
                c = true;
               }
           }
         }
         c = false;
       }
     }
    }
   
    public Collide eat(Food f){
      Collide c = new Collide();
      if(f.eated == false){
       
       // pac
       Rectangle recPac = new Rectangle (x, y, width, height);
       
       //Food
       int b1x = f.x;
       int b1y = f.y;
       Rectangle recFood = new Rectangle (f.x, f.y, f.width, f.height);
         
       if(recPac.intersects(recFood)){
         f.eaten();
         
         c.c = true;
         return c;
       }
      }
        return c;
    }
    public void eat(Ghost g){
    }
    
    public Collide eat(Boost b){
      Collide c = new Collide();
      if(b.eated == false){
       
       // pac
       Rectangle recPac = new Rectangle (x, y, width, height);
       
       //Food
       int b1x = b.x;
       int b1y = b.y;
       Rectangle recBoost = new Rectangle (b.x, b.y, b.width, b.height);
         
       if(recPac.intersects(recBoost)){
         b.eaten();
         
         c.c = true;
         return c;
       }
      }
        return c;
    }
    
    public void die(){
    }
    
    @Override
    public void move(){
         
        if(mL == true){
        velx = -2;
        vely = 0;
        angA = 210;
          
        }
        else if(mR == true){
        velx = +2;
        vely = 0;
        angA = 30;   
       
        }
        else if(mU == true){
        vely = -2;
        velx = 0;
        angA = 120;   
        
        }
        else if(mD == true){
        vely = +2;
        velx = 0;
        angA = 300;   
        }
         
    }

    @Override
    public void draw(Graphics g) {
        // !!PAC!! //
        
        if((System.currentTimeMillis()-timeBoost)>10000){
            timeBoost = 0;
        }
        
        
        this.d++;
        if (d > 1) {
            if (this.sprite == 1) {
                this.sprite = 2;
            } else if (this.sprite == 2) {
                this.sprite = 3;
            } else if (this.sprite == 3) {
                this.sprite = 4;
            }
            else if (this.sprite == 4) {
                this.sprite = 1;
            }
            d = 0;
        }
        
        // Corpo parado //
       if (velx == 0 && vely == 0){ 
           if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
       g.fillArc(x, y, width, height, angA, 300);
       }
       
       //Sprite direita
        else if(velx > 0){
          if(sprite == 1) {
                if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
                g.fillArc(x, y, width, height, 30, 300);
                xo = 14;
                yo = 5;
                AngO = 200;

          }
          else if(sprite == 2) {
               if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
                g.fillArc(x, y, width, height, 15, 315);
                xo = 14;
                yo = 5;
                AngO = 200;
          }
          else if(sprite == 3){
                if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
                g.fillArc(x, y, width, height, 0, 345);
                xo = 14;
                yo = 5;
                AngO = 200;
         }
          else if(sprite == 4){
            if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
            g.fillArc(x, y, width, height, 345, -360);
            xo = 14;
            yo = 5;
            AngO = 200;
          }
        }  
        //Sprite esquerda
       else if(velx < 0){
          if(sprite == 1){ 
         if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
           g.fillArc(x, y, width, height, 210, 300);
           xo = 16;
           yo = 5;
           AngO = 20;
          }
          else if(sprite == 2){
           if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
            g.fillArc(x, y, width, height, 195, 315);
            xo = 16;
            yo = 5;
            AngO = 20;
          }
          else if(sprite == 3){
           if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
            g.fillArc(x, y, width, height, 180, 345);
            xo = 16;
            yo = 5;
            AngO = 20;
          }
          else if(sprite == 4){
           if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
            g.fillArc(x, y, width, height, 165, 360);
            xo = 16;
            yo = 5;
            AngO = 20;
          }
        }
      
       //Sprite baixo
       else if(vely > 0){
          if(sprite == 1){ 
            if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
             g.fillArc(x, y, width, height, 300, 300);
             xo = 8;
             yo = 15;
             AngO = 110;
          }
          else if(sprite == 2){
           if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
             g.fillArc(x, y, width, height, 285, 315);
             xo = 8;
             yo = 15;
             AngO = 110;
          }
          else if(sprite == 3){
           if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
            g.fillArc(x, y, width, height, 270, 345);
            xo = 8;
            yo = 15;
            AngO = 110;
          }
          else if(sprite == 4){
           if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
            g.fillArc(x, y, width, height, 255, 360);
            xo = 8;
            yo = 15;
            AngO = 110;
          }
        }
       
       //Sprite cima
       else if(vely < 0){
          if(sprite == 1){ 
            if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
             g.fillArc(x, y, width, height, 120, 300);
            xo = 7;
            yo = 15;
            AngO = 290;
          }
          else if(sprite == 2){
           if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
            g.fillArc(x, y, width, height, 105, 315); 
            xo = 7;
            yo = 15;
            AngO = 290;
          }
          else if(sprite == 3){
           if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
            g.fillArc(x, y, width, height, 90, 345);
            xo = 7;
            yo = 15;
            AngO = 290;
          }
          else if(sprite == 4){
           if(timeBoost>0){
                g.setColor(Color.RED);
            }else{
                g.setColor(color);
            }
            g.fillArc(x, y, width, height, 75, 360);
            xo = 7;
            yo = 15;
            AngO = 290;
          }
       }  
       
       // Olhos // 
       g.setColor(Color.BLACK);
       g.fillArc(x + xo, y + yo, 7, 9, AngO, 320);

 }

    public void superPac(){
        timeBoost = System.currentTimeMillis();// 10s em milliseconds 
    }
}

  


