/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;


/**
 *
 * @author cesar
 */
public class Stage extends JComponent implements ActionListener {
    public Color color;
    public List<Block> blocks;
    public List<Ghost> ghosts;
    public List<Food> foods;
    public List<Boost> boosts;
    public Pac pac;
    Timer tm = new Timer(1000/60, this);
  
        
    public Stage() {
        setSize(800, 500);
        
        Pac pac = new Pac();
        foods = new ArrayList<>();
        boosts = new ArrayList<>();
        blocks = new ArrayList();
        ghosts = new ArrayList();
        
             
               
        // !!BLOCKS!! //
                           
        // bloco cima
        Block b1 = new Block();
        b1.width = getWidth();
        b1.height = 10;
        b1.x = 0;
        b1.y = 0;
               
        blocks.add(b1);
        
        // bloco baixo
        Block b2 = new Block();
        b2.width = getWidth();
        b2.height = 10;
        b2.x = 0;
        b2.y = 480;
               
        blocks.add(b2);
        
        //bloco lado esquerdo
        Block b3 = new Block();
        b3.width = 10;
        b3.height = 490;
        b3.x = 0;
        b3.y = 0;
                
        blocks.add (b3);
        
        //bloco lado direito
        Block b4 = new Block();
        b4.width = 10;
        b4.height = 490;
        b4.x = 790;
        b4.y = 0;
              
        blocks.add (b4);
                      
        // Blocos lado esquerdo 1
        for (int ble1=0; ble1<3; ble1++) {
        Block b5 = new Block();
        b5.x = 10;
        b5.y = 120+ble1*120;
        b5.width = 50;
        b5.height = 10;
        
        blocks.add(b5);
        }
        
        // Blocos lado direito 1
        for(int bld1=0;bld1<3;bld1++){
        Block b6 = new Block();
        b6.x = 740;
        b6.y = 120+bld1*120;
        b6.width = 50;
        b6.height = 10;
        
        blocks.add(b6);
        }
                      
        // Blocos lado esquerdo 2
        for(int ble2=0;ble2<4;ble2++){
        Block b7 = new Block();
        b7.x = 60;
        b7.y = 60+ble2*120;
        b7.width = 50;
        b7.height = 10;
        
        blocks.add(b7);
        }
        
        // Blocos lado direito 2       
        for(int bld2=0;bld2<4;bld2++){
        
        Block b8 = new Block();
        b8.x = 690;
        b8.y = 60+bld2*120; 
        b8.width = 50;
        b8.height = 10;
                
        blocks.add(b8);  
        }               
           
        // Blocos lado esquerdo 3
        for(int ble3=0;ble3<3;ble3++){
        Block b9 = new Block();
        b9.x =  115;
        b9.y =  120 +ble3*120;
        b9.width = 60;
        b9.height = 10;      
                
        blocks.add(b9);
                }   
        
        //Blocos lado direito 3
        for(int bld3=0;bld3<3;bld3++){
        Block b10 = new Block();
        b10.x = 625;
        b10.y = 120 +bld3*120;
        b10.width = 62;
        b10.height =  10;       
        blocks.add(b10);
}
                
         //Blocos repetidos 4 lado esquerdo
        for(int ble4=0;ble4<4;ble4++){
        Block b11 = new Block();        
        b11.x = 160;
        b11.y = 60+ble4*120;
        b11.width = 15;
        b11.height = 60;      
        blocks.add(b11);
        }        
        
         //Blocos repetidos 4 lado direito
        for(int bld4=0;bld4<4;bld4++){        
        Block b12 = new Block();
        b12.x = 625;
        b12.y = 60+bld4*120;
        b12.width = 15;
        b12.height = 60;
        blocks.add(b12);  
}
        
        //Bloco repetidos 5 lado esquerdo
        for(int ble5=0;ble5<4;ble5++){
        Block b13 = new Block();
        b13.x = 225;
        b13.y = 60+ble5*120;
        b13.width = 25;
        b13.height = 10;
        blocks.add(b13);       
}        
        
         //Blocos repetidos 5 lado direito
        for(int bld5=0;bld5<4;bld5++){
        Block b14 = new Block();
        b14.x = 550;
        b14.y = 60+bld5*120;
        b14.width = 25;
        b14.height = 10;
        blocks.add(b14);
}
 
        
        //Blocos repetidos 6 lado esquerdo
        for(int ble6=0;ble6<3;ble6++){
        Block b15 = new Block();
        b15.x = 225;
        b15.y = 120+ble6*120;
        b15.width = 90;
        b15.height = 10;
        blocks.add(b15);       
}
        
        //Blocos repetidos 6 lado direito
        for(int bld6=0;bld6<3;bld6++){
        Block b16 = new Block();
        b16.x = 485;
        b16.y = 120+bld6*120;
        b16.width = 90;
        b16.height = 10;
        blocks.add(b16);         
}
        
        //Blocos repetidos 7 lado esquerdo
        for(int ble7=0;ble7<4;ble7++){    
        Block b17 = new Block();   
        b17.x = 300;
        b17.y = 10+ble7*120;
        b17.width = 15;
        b17.height = 60;       
        blocks.add(b17); 
}
 
         //Blocos repetidos 7 lado direito 
        for(int bld7=0;bld7<4;bld7++){
        Block b18 = new Block(); 
        b18.x = 485;
        b18.y = 10+bld7*120;
        b18.width = 15;
        b18.height = 60;      
        blocks.add(b18); 
}

         //Blocos repetidos centro 
        for(int blc=0;blc<7;blc++){
        Block b19 = new Block(); 
        b19.x = 365;
        b19.y = 60+blc*60;
        b19.width = 70;
        b19.height = 10;
        blocks.add(b19);         
}
        
         //Blocos repetidos centro lado
        for(int blcl=0;blcl<2;blcl++){
        Block b20 = new Block(); 
        b20.x = 365+blcl*60;
        b20.y = 180;
        b20.width = 10;
        b20.height = 60;  
        blocks.add(b20);         

     }  
        
             // !FOODS! //
             
              // !FOOD BAIXO! // 
        //Food baixo esquerdo 1     
        for(int fbe1=0; fbe1<6; fbe1++){     
        Food f = new Food(); 
        f.x = 25+fbe1*46;
        f.y = 392;
        f.width = 18;
        f.height = 6;
                
        foods.add(f);                
        }
        
        //Food baixo esquerdo 2
        for(int fbe2=0;fbe2<3;fbe2++){        
        Food f0 = new Food(); 
        f0.x = 25+fbe2*48;
        f0.y = 455;
        f0.width = 18;
        f0.height = 6;
        foods.add(f0);
        }
        
        //Food baixo esquerdo 3
        for(int fbe2=0;fbe2<5;fbe2++){
        Food f1 = new Food(); 
        f1.x = 189+fbe2*38;
        f1.y = 455;
        f1.width = 18;
        f1.height = 6;
        foods.add(f1);  
        }
        
        //Food baixo direito 1
        for(int fbd1=0; fbd1<6; fbd1++){
        Food f2 = new Food(); 
        f2.x = 524+fbd1*46;
        f2.y = 392;
        f2.width = 18;
        f2.height = 6;
        foods.add(f2);  
        }
        
               
        //Food baixo direito 2
        for(int fbd2=0; fbd2<3; fbd2++){
        Food f3 = new Food(); 
        f3.x = 659+fbd2*46;
        f3.y = 455;
        f3.width = 18;
        f3.height = 6;
        foods.add(f3);  
        }
        
        //Food baixo direito 3
        for(int fbd3=0;fbd3<5;fbd3++){
        Food f4 = new Food(); 
        f4.x = 442+fbd3*38;
        f4.y = 455;
        f4.width = 18;
        f4.height = 6;
        foods.add(f4); 
        }
        
                 
           // !FOOD CENTRO! //
        
        //Food centro esquerdo 1
        for(int fbce1=0; fbce1<6; fbce1++){
        Food f5 = new Food(); 
        f5.x = 25+fbce1*46;
        f5.y = 152;
        f5.width = 18;
        f5.height = 6;
        foods.add(f5);  
        }
        
         //Food centro direito 1
        for(int fbcd1=0; fbcd1<6; fbcd1++){
        Food f6 = new Food(); 
        f6.x = 524+fbcd1*46;
        f6.y = 152;
        f6.width = 18;
        f6.height = 6;
        foods.add(f6);  
        }
        
        //Food centro esquerdo 2
        for(int fbce2=0;fbce2<3;fbce2++){
        Food f7 = new Food(); 
        f7.x = 25+fbce2*48; 
        f7.y = 212;
        f7.width = 18;
        f7.height = 6;
        foods.add(f7);  
        }
        
        //Food centro direito 2
        for(int fbcd2=0;fbcd2<3;fbcd2++){
        Food f8 = new Food(); 
        f8.x = 658+fbcd2*48;
        f8.y = 212;
        f8.width = 18;
        f8.height = 6;
        foods.add(f8);  
        }
        
        //Food centro esquerdo 3
        for(int fbce3=0;fbce3<4;fbce3++){        
        Food f9 = new Food(); 
        f9.x = 189+fbce3*43; 
        f9.y = 212;
        f9.width = 18;
        f9.height = 6;
        foods.add(f9);  
        }
        
        //Food centro direito 3
        for(int fbcd3=0;fbcd3<4;fbcd3++){
        Food f10 = new Food(); 
        f10.x = 467+fbcd3*43;
        f10.y = 212;
        f10.width = 18;
        f10.height = 6;
        foods.add(f10);  
        }
        
        //Food centro esquerdo 4
        for(int fbce4=0; fbce4<6; fbce4++){ 
        Food f11 = new Food(); 
        f11.x = 25+fbce4*46; 
        f11.y = 272;
        f11.width = 18;
        f11.height = 6;
        foods.add(f11);  
        }
        
        //Food centro direito 4
        for(int fbcd4=0; fbcd4<6; fbcd4++){ 
        Food f12 = new Food(); 
        f12.x = 524+fbcd4*46; 
        f12.y = 272;
        f12.width = 18;
        f12.height = 6;
        foods.add(f12);  
        }
        
        //Food centro esquerdo 5
        for(int fbce2=0;fbce2<3;fbce2++){
        Food f13 = new Food(); 
        f13.x = 25+fbce2*48;
        f13.y = 332;
        f13.width = 18;
        f13.height = 6;
        foods.add(f13);  
        }
        
        //Food centro direito 5
        for(int fbcd2=0;fbcd2<3;fbcd2++){
        Food f14 = new Food(); 
        f14.x = 658+fbcd2*48;
        f14.y = 332;
        f14.width = 18;
        f14.height = 6;
        foods.add(f14);  
        }
        
        //Food centro esquerdo 6
        for(int fbce3=0;fbce3<5;fbce3++){
        Food f15 = new Food(); 
        f15.x = 189+fbce3*43;
        f15.y = 332;
        f15.width = 18;
        f15.height = 6;
        foods.add(f15);  
        } 
        
        //Food centro direito 6
        for(int fbcd3=0;fbcd3<5;fbcd3++){
        Food f16 = new Food(); 
        f16.x = 424+fbcd3*43;
        f16.y = 332;
        f16.width = 18;
        f16.height = 6;
        foods.add(f16);  
        }   
        
           // !FOOD TOPO! //
        
        //Food topo esquerdo 1
        for(int fbte1=0; fbte1<6; fbte1++){
        Food f17 = new Food(); 
        f17.x = 25+fbte1*46;
        f17.y = 32;
        f17.width = 18;
        f17.height = 6;
        foods.add(f17);  
        }
        
        //Food topo esquerdo 2
        for(int fbte2=0;fbte2<3;fbte2++){
        Food f18 = new Food(); 
        f18.x = 25+fbte2*48; 
        f18.y = 90;
        f18.width = 18;
        f18.height = 6;
        foods.add(f18);  
        }
           
        //Food topo esquerdo 3
        for(int fbte3=0;fbte3<5;fbte3++){        
        Food f19 = new Food(); 
        f19.x = 189+fbte3*43; 
        f19.y = 90;
        f19.width = 18;
        f19.height = 6;
        foods.add(f19);  
        }
        
        //Food topo direito 1
        for(int fbtd1=0; fbtd1<6; fbtd1++){
        Food f20 = new Food(); 
        f20.x = 524+fbtd1*46;
        f20.y = 32;
        f20.width = 18;
        f20.height = 6;
        foods.add(f20);  
        }
        
        //Food topo direito 2
        for(int fbtd2=0;fbtd2<3;fbtd2++){
        Food f21 = new Food(); 
        f21.x = 658+fbtd2*48; 
        f21.y = 90;
        f21.width = 18;
        f21.height = 6;
        foods.add(f21);  
        }
        
        //Food topo direito 3
        for(int fbtd3=0;fbtd3<5;fbtd3++){        
        Food f22 = new Food(); 
        f22.x = 424+fbtd3*43; 
        f22.y = 90;
        f22.width = 18;
        f22.height = 6;
        foods.add(f22);  
        }
        
             // !FOOD MEIO! //
             
        //Food meio pequeno 1     
        for(int fbmp1=0;fbmp1<2;fbmp1++){        
        Food f23 = new Food(); 
        f23.x = 328+fbmp1*125; 
        f23.y = 32;
        f23.width = 18;
        f23.height = 6;
        foods.add(f23);  
        }
        
        //Food meio grande 1
        Food f24 = new Food(); 
        f24.x = 380; 
        f24.y = 32;
        f24.width = 40;
        f24.height = 6;
        foods.add(f24);  
        
        //Food meio pequeno 2
        for(int fbmp2=0;fbmp2<2;fbmp2++){        
        Food f25 = new Food(); 
        f25.x = 328+fbmp2*125; 
        f25.y = 152;
        f25.width = 18;
        f25.height = 6;
        foods.add(f25);  
        }
        
        //Food meio grande 2
        Food f26 = new Food(); 
        f26.x = 380; 
        f26.y = 152;
        f26.width = 40;
        f26.height = 6;
        foods.add(f26); 
        
        //Food meio pequeno 3
        for(int fbmp3=0;fbmp3<2;fbmp3++){        
        Food f27 = new Food(); 
        f27.x = 328+fbmp3*125; 
        f27.y = 272;
        f27.width = 18;
        f27.height = 6;
        foods.add(f27);  
        }
        
        //Food meio grande 3
        Food f28 = new Food(); 
        f28.x = 380; 
        f28.y = 272;
        f28.width = 40;
        f28.height = 6;
        foods.add(f28); 
        
        //Food meio grande 4
        Food f29 = new Food(); 
        f29.x = 380; 
        f29.y = 392;
        f29.width = 40;
        f29.height = 6;
        foods.add(f29); 
        
        //Food meio pequeno 4
        for(int fbmp4=0;fbmp4<2;fbmp4++){        
        Food f30 = new Food(); 
        f30.x = 328+fbmp4*125; 
        f30.y = 392;
        f30.width = 18;
        f30.height = 6;
        foods.add(f30);  
        }
        
             // !BOOSTS! //
        for(int bs=0;bs<2;bs++){        
        Boost bo1 = new Boost(); 
        bo1.x = 25+bs*734; 
        bo1.y = 58;
        boosts.add(bo1);  
        }  
        
        for(int bi=0;bi<2;bi++){        
        Boost bo2 = new Boost(); 
        bo2.x = 25+bi*734; 
        bo2.y = 418;
        boosts.add(bo2);  
        }    
        
             // !GHOSTS! //      
        
        Ghost g1= new Ghost();
        g1.color = new Color(104,249,137);
        g1.y = 193;
        ghosts.add(g1);
        
        Ghost g2= new Ghost();
        g2.color = (Color.YELLOW);
        g2.y = 193;
        ghosts.add(g2);
        
        Ghost g3= new Ghost();
        g3.color = new Color(252, 3, 23);
        g3.y = 193;
        ghosts.add(g3);
        
        Ghost g4= new Ghost();
        g4.color = new Color(219, 3, 252);
        g4.y = 193;
        ghosts.add(g4);
        
        } 
    
     
              
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        
        // Anti-Aliasing
        
        /*Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);*/
        
         // fundo
        g.setColor(new Color(63, 48, 191));
        g.fillRect(0, 0, getWidth(), getHeight());
        
        // area info
        g.setColor(Color.BLACK);
        g.fillRect(0, 495, getWidth(), 100);
        
        // area info 2
        g.setColor(new Color(54, 141, 35));
        g.fillRect(0, 505, getWidth(), 30);
        
        // vidas
        for(int i=0;i<this.pac.live;i++){
        g.fillRect(20+i*25, 540, 15, 15);
        }
        
        // pontuacao
        g.setFont(new Font("arial", Font.BOLD, 25));
        g.setColor(Color.BLACK);
        g.drawString(String.valueOf(this.pac.score), 450, 528);
        
        // desenhar os blocos
        for(Block b: this.blocks){
            b.draw(g);
        }     
        
       // !!FOODS!! //
       for (Food f: this.foods){
        f.draw(g);   
       } 
       
       // !!BOOSTS!! //
       for (Boost bo: this.boosts){
        bo.draw(g);
       }
       
       // !!GHOSTS!! //
       for(Ghost gh: this.ghosts){
        gh.draw(g);
       }
       
       // !!PAC!! // 
       pac.draw(g);
       for(Block b: this.blocks){
            pac.collide(b);
        }
       
       for(Food f: this.foods){
            Collide d = pac.eat(f);
            pac.eat(f);
             if(d.c==true){
                pac.score += 10;
            }
        }
       
       for(Boost b: this.boosts){
            Collide d = pac.eat(b);
            pac.eat(b);
             if(d.c==true){
                pac.score += 50;
                pac.superPac();
            }
        }
       tm.start();
       
    
   

}

    @Override
    public void actionPerformed(ActionEvent e) {
        pac.x = pac.x + pac.velx;
        pac.y = pac.y + pac.vely;
        repaint();
    }
}    


       