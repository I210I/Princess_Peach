package princesspeach;

// @author 210
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.QuadCurve2D;
import javax.swing.JPanel;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionAdapter;
import java.awt.Font;
import java.awt.image.BufferedImage;

public class PrincessPeach extends JPanel {
    int x4=3; int x5=3;
    int cx, cy;
   Color carne2 = new Color(255, 210, 210);
   Color zioRosaV = new Color(255, 210, 216);
        Color zioRosaV2 = new Color(255, 121, 188);
        Color zioRosa = new Color(255, 70, 175);
        Color zioAzulsaf = new Color(83, 169, 244);
        Color azul2 = new Color(0, 64, 128);
        Color carne = new Color(255, 210, 210);
        Color violeta = new Color(174, 0, 174);
        Color mostaza = new Color(180, 131, 23);
        Color amarillo = new Color(254, 231, 48);
        Color boquilla= new Color (160,103,92);
        
    
//        
//         
//    public PrincessPeach() {
//        this.addMouseMotionListener(new MouseMotionAdapter() {
//            @Override
//            public void mouseMoved(MouseEvent a) {
//                cx = a.getX();
//                cy = a.getY();
//                repaint();
//                
//            }
//        });
//        
//        
//      
//        
//    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        
       
        QuadCurve2D qc2d = new QuadCurve2D.Float();
       
        BufferedImage zio = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);        
        
        
        this.setBackground(Color.WHITE);
        
        
        Graphics2D gg = zio.createGraphics();
        gg.setColor(violeta);
        gg.fillRect(0, 0, 70, 80);
        gg.setColor(violeta);
        gg.drawRect(1, 1, 6, 6);
        gg.setColor(zioRosa);
        gg.fillRect(1, 1, 3, 3);
        gg.setColor(Color.magenta);
        gg.fillRect(4, 4, 3, 3);
        
       
            
        
        g2d.setPaint(Color.BLACK);


        //de aqui , todo lo demas de linea gruesa
        
        g2d.setStroke(new BasicStroke(10.0f));
        //colores carne ;D
        g2d.setColor(carne);
        int[] carx = {438, 428, 420, 420, 447, 478, 534, 538, 516, 491, 462, 436};
        int[] cary = {226, 235, 247, 309, 341, 351, 315, 259, 219, 227, 239, 223};
        g2d.fillPolygon(carx, cary, 12);


        //pecho rellenado
        g2d.setPaint(new GradientPaint(0, 50, zioRosaV, 90, 100, zioRosaV2, true));
        int[] Pbx = {505, 483, 465, 455, 435, 419, 408, 399, 390, 386, 397, 389, 407, 419, 436, 432, 470, 487, 503, 495, 494, 500};
        int[] Pby = {360, 355, 357, 365, 356, 357, 361, 370, 387, 406, 414, 411, 429, 432, 423, 409, 451, 437, 425, 411, 390, 372};
        g2d.fillPolygon(Pbx, Pby, 21);
        
        g2d.setPaint(Color.BLACK);
        
        g2d.drawOval(415, 200, 130, 150); //Cabeza

        g2d.drawOval(420, 350, 120, 90);//Pecho 
        g2d.setPaint(zioRosaV);
        g2d.fillOval(440, 410, 100, 40);// borra parte del hombro der  

        g2d.setPaint(Color.BLACK);
         g2d.fillOval(475, 250, 18, 30); //ojo derecho (de mi perspectiva)
        g2d.fillOval(440, 250, 18, 30); //ojo izquierdo (de mi perspectiva)

        
      
        //cabeza
        g2d.drawLine(418, 244, 422, 319);


        //jewel
        g2d.setPaint(new GradientPaint(0, 30, azul2, 50, 100, zioAzulsaf, true));
        g2d.fillOval(435, 108, 20, 28);//piedra azul derecha

        
        g2d.setPaint(new GradientPaint(0, 50, amarillo, 90, 100, mostaza, true));
        int[] corx = {448, 456, 516, 530, 504, 487, 468};
        int[] cory = {92, 127, 131, 93, 99, 80, 97};
        g2d.fillPolygon(corx, cory, 7);


 //llamado a corona ;D
        
        
        
g2d.setStroke(new BasicStroke(8.0f));
g2d.setPaint(mostaza);
g2d.drawLine(458,113,465,113);
g2d.drawLine(497,113,507,114);


g2d.setStroke(new BasicStroke(10.0f)); g2d.setPaint(Color.BLACK);
        g2d.drawLine(450, 128, 442, 85);// corona inicio :D
        g2d.drawLine(442, 85, 468, 94);// corona 2 :D
        g2d.drawLine(468, 94, 485, 73);// corona 3 :D
        g2d.drawLine(485, 73, 504, 95);// corona 4:D
        g2d.drawLine(504, 95, 533, 88);// corona 4:D
        g2d.drawLine(533, 88, 526, 109);// corona 5 :D

        g2d.setPaint(new GradientPaint(0, 50, Color.red, 90, 100, zioRosaV2, true));
        g2d.fillOval(470, 100, 20, 30);//piedraa rosa

        g2d.setPaint(new GradientPaint(0, 30, azul2, 50, 100, zioAzulsaf, true));
        g2d.fillOval(513, 108, 20, 28);//piedra azul derecha

       //cabello

 g2d.setPaint(new GradientPaint(0, 50, mostaza, 40, 100, amarillo, true));
        int[] Cfix = {408, 376, 384, 393, 373, 378, 396, 420, 438, 411};
        int[] Cfiy = {163, 167, 189, 209, 207, 233, 250, 239, 219, 162};
        g2d.fillPolygon(Cfix, Cfiy, 10);        
        
        g2d.setPaint(new GradientPaint(0, 50, mostaza, 65, 100, amarillo, true));//despues del arete
        int[] CTx = {542, 526, 537, 521, 520, 549, 578, 608, 610, 591, 584, 547};
        int[] CTy = {259, 310, 311, 336, 353, 346, 373, 337, 305, 280, 257, 261};
        g2d.fillPolygon(CTx, CTy, 12);
        
        
        g2d.setPaint(new GradientPaint(0, 30, azul2, 40, 100, Color.white, true));
        g2d.fillOval(540, 270, 40, 40);//ARETE
        g2d.setPaint(amarillo);
        g2d.drawLine(553, 264, 540, 297);
        
        g2d.setPaint(mostaza);
        int[] RCx = {596, 584, 594, 591, 579, 568, 572, 594, 619, 635, 610, 600, 604};
        int[] RCy = {357, 364, 388, 415, 433, 433, 471, 491, 478, 452, 445, 424, 383};
        g2d.fillPolygon(RCx, RCy, 13);
        
        
        g2d.setPaint(new GradientPaint(0, 50, mostaza, 65, 100, amarillo, true));
        int[] Cix = {416, 399, 391, 378, 402, 402, 452, 417, 416};
        int[] Ciy = {238, 251, 281, 297, 326, 350, 351, 317, 240};
        g2d.fillPolygon(Cix, Ciy, 9);
        
        g2d.setPaint(new GradientPaint(10, 50, amarillo, 80, 100, mostaza, true));
        int[] Cdx = {530, 511, 544, 577, 602, 596, 608, 576, 549};
        int[] Cdy = {152, 211, 259, 257, 238, 223, 187, 185, 168};
        g2d.fillPolygon(Cdx, Cdy, 9);
        
        g2d.setPaint(new GradientPaint(10, 50, mostaza, 80, 100, amarillo, true));
        int[] Cmx = {410, 437, 463, 512, 531, 503, 456, 426,};
        int[] Cmy = {165, 220, 239, 212, 156, 133, 130, 146};
        g2d.fillPolygon(Cmx, Cmy, 8);
        
        g2d.setPaint(Color.black);
        qc2d.setCurve(462, 237, 440, 230, 432, 210);//cabellin izq
        g2d.draw(qc2d);
        qc2d.setCurve(472, 129, 458, 120, 410, 161);//cabellin aarriba izq
        g2d.draw(qc2d);
        qc2d.setCurve(410, 161, 395, 167, 379, 166);//cabellin  arriba izq polongacion
        g2d.draw(qc2d);
        qc2d.setCurve(379, 166, 376, 182, 394, 210);//cabellin  arriba/abajo izq union
        g2d.draw(qc2d);
        qc2d.setCurve(394, 210, 382, 210, 370, 203);//cabellin  arriba/abajo/abajo izq polongacion
        g2d.draw(qc2d);
        qc2d.setCurve(370, 203, 371, 232, 395, 251);//cabellin  arriba/abajo/abajo izq polongacion abajo
        g2d.draw(qc2d);
        qc2d.setCurve(396, 252, 396, 282, 378, 298);//cabellin  arriba/abajo/abajo/arriba izq polongacion abajo
        g2d.draw(qc2d);
        qc2d.setCurve(377, 298, 389, 315, 402, 325);//cabellin  arriba/abajo/abajo/abajo izq polongacion abajo
        g2d.draw(qc2d);
        qc2d.setCurve(402, 325, 397, 334, 405, 353);//cabellin  izquierda hombro
        g2d.draw(qc2d);
        qc2d.setCurve(462, 237, 470, 240, 514, 210);//cabellin der
        g2d.draw(qc2d);
        qc2d.setCurve(514, 210, 523, 237, 543, 258);//cabellin der/derecha prolongacion a patilla
        g2d.draw(qc2d);
        qc2d.setCurve(474, 132, 497, 122, 518, 137);//cabellin  arriba derrrr
        g2d.draw(qc2d);
        qc2d.setCurve(518, 137, 542, 160, 565, 179);//curva de cabello :D derecha
        g2d.draw(qc2d);
        qc2d.setCurve(565, 179, 593, 194, 615, 181);//continuacionde curva derecha
        g2d.draw(qc2d);
        qc2d.setCurve(615, 181, 610, 195, 593, 219);//cabellin union arriba/abajo/abajo derecha
        g2d.draw(qc2d);
        qc2d.setCurve(576, 218, 590, 230, 609, 231);//cabellin  arriba/abajo derecha
        g2d.draw(qc2d);
        qc2d.setCurve(609, 231, 591, 254, 571, 256);//cabellin  arriba/abajo/abajo der polongacion
        g2d.draw(qc2d);
        qc2d.setCurve(584, 252, 595, 301, 616, 299);//cabellin  derecha caida
        g2d.draw(qc2d);
        qc2d.setCurve(616, 299, 612, 318, 600, 327);//cabellin  derecha caida abajo
        g2d.draw(qc2d);
        qc2d.setCurve(600, 332, 610, 330, 615, 329);//cabellin  derecha caida 2arriba
        g2d.draw(qc2d);
        qc2d.setCurve(584, 250, 595, 301, 616, 299);//cabellin  derecha caida
        g2d.draw(qc2d);
        qc2d.setCurve(615, 329, 612, 345, 597, 357);//cabellin  derecha caida 2abajo
        g2d.draw(qc2d);
        qc2d.setCurve(598, 360, 612, 395, 600, 424);//cabellin  derecha caida
        g2d.draw(qc2d);
        qc2d.setCurve(600, 424, 606, 451, 636, 445);//cola 1
        g2d.draw(qc2d);
        qc2d.setCurve(596, 491, 634, 479, 636, 445);//cola 2
        g2d.draw(qc2d);



//rellenado de encajes 
        g2d.setPaint(new GradientPaint(0, 50, zioRosa, 90, 100, violeta, true));// holan rellenado 
        int[] ex = {373, 621, 615, 514, 431, 419, 374, 370};
        int[] ey = {630, 632, 619, 614, 613, 621, 617, 632};
        g2d.fillPolygon(ex, ey, 8);


        //cuerpo
        g2d.setPaint(Color.black);
        qc2d.setCurve(545, 440, 595, 480, 615, 610);//cuerpo derecho (de mi perspectiva)
        g2d.draw(qc2d);

        //falda

        
        
        qc2d.setCurve(615, 610, 618, 613, 627, 636);// borde final derecho ;D
        g2d.draw(qc2d);
        
        qc2d.setCurve(380, 610, 375, 605, 365, 636);//borde del final izq.
        g2d.draw(qc2d);
        qc2d.setCurve(365, 636, 505, 636, 627, 636);// final de la falda abajo :D abajo ;D 
        g2d.draw(qc2d);

//color falda
        g2d.setPaint(new GradientPaint(0, 0, zioRosaV, 50, 100, zioRosaV2, true));
        int[] Fx = {472, 451, 426, 401, 382, 425, 426, 468, 514, 577, 611, 595, 588, 578, 560, 548, 545, 509};
        int[] Fy = {469, 492, 518, 540, 610, 613, 602, 611, 606, 612, 611, 542, 536, 553, 542, 543, 522, 501};
        g2d.fillPolygon(Fx, Fy, 18);
        
        
        g2d.setPaint(Color.BLACK);
        qc2d.setCurve(436, 533, 423, 580, 426, 635);// arruga 1
        g2d.draw(qc2d);
        qc2d.setCurve(505, 526, 518, 579, 515, 635);// arruga 2
        g2d.draw(qc2d);
        qc2d.setCurve(576, 555, 582, 613, 582, 635);// arruga 3
        g2d.draw(qc2d);
        
        
        qc2d.setCurve(381, 611, 405, 620, 426, 617);// encaje 1
        g2d.draw(qc2d);
        qc2d.setCurve(428, 607, 464, 618, 514, 610);// encaje 2
        g2d.draw(qc2d);
        qc2d.setCurve(514, 610, 540, 618, 582, 613);// encaje 3
        g2d.draw(qc2d);
        qc2d.setCurve(582, 613, 601, 620, 618, 612);// encaje 4
        g2d.draw(qc2d);
        
        g2d.setPaint(new TexturePaint(zio, new Rectangle(10, 10)));// holan rellenado 
        int[] hx = {447, 422, 400, 427, 453, 466};
        int[] hy = {444, 471, 532, 509, 482, 460};
        g2d.fillPolygon(hx, hy, 6);
        
        
        g2d.setPaint(Color.BLACK);
        qc2d.setCurve(442, 440, 380, 520, 396, 537);// holan izquierdo
        g2d.draw(qc2d);
        qc2d.setCurve(468, 461, 430, 520, 396, 537);// holan izquierdo
        g2d.draw(qc2d);
        g2d.drawLine(444, 433, 469, 459);//union pecho falda izq

        
        
        
        
        g2d.setPaint(new TexturePaint(zio, new Rectangle(10, 10)));
        int[] hix = {474, 496, 542, 524, 524, 511, 498, 487};
        int[] hiy = {464, 488, 513, 462, 438, 424, 440, 447};
        g2d.fill(new Polygon(hix, hiy, 8));
        
        
        g2d.setPaint(Color.black);
        qc2d.setCurve(468, 461, 503, 500, 544, 517);// holan derecho
        g2d.draw(qc2d);
        qc2d.setCurve(512, 426, 485, 435, 469, 459);// holan pecho&falda ;D
        g2d.draw(qc2d);
        
        
        qc2d.setCurve(440, 440, 400, 480, 380, 610);//cuerpo izquierdo (de mi perspectiva)
        g2d.draw(qc2d);
//aqui va el holan rellenado 
        
        g2d.setPaint(new TexturePaint(zio, new Rectangle(10, 10)));// holan rellenado 
        int[] hi2x = {572, 578, 587, 594, 612, 604, 586};
        int[] hi2y = {480, 505, 519, 533, 535, 514, 492};
        g2d.fillPolygon(hi2x, hi2y, 7);


//        holan detras del brazo 
        g2d.setPaint(Color.BLACK);
        qc2d.setCurve(586, 530, 601, 545, 614, 534);
        g2d.draw(qc2d);
        qc2d.setCurve(567, 469, 609, 501, 614, 534);
        g2d.draw(qc2d);


        //hombros
        g2d.drawOval(385, 350, 90, 90);//hombro derecho (espejo)
        g2d.drawOval(500, 350, 90, 90);//hombro izquierdo(espejo) 


        //patillas
        qc2d.setCurve(540, 258, 540, 282, 520, 314);//patilla derecha
        g2d.draw(qc2d);
        
        qc2d.setCurve(562, 256, 560, 295, 540, 314);//patilla derecha
        g2d.draw(qc2d);
//arruga en hombro
        g2d.setPaint(violeta);
        g2d.drawLine(414, 419, 422, 429);
        
        // bazos

        g2d.setPaint(carne);
        g2d.drawLine(434, 433, 434, 433);
        
        g2d.setPaint(Color.BLACK);
        g2d.drawLine(561, 540, 548, 541);
        qc2d.setCurve(430, 422, 415, 454, 406, 476);// izquierdo 1
        g2d.draw(qc2d);
        qc2d.setCurve(405, 487, 360, 505, 396, 537);// izquierdo 2
        g2d.draw(qc2d);



        // borrados

//        
        g2d.setPaint(new GradientPaint(0, 50, zioRosaV, 80, 100, zioRosaV2, true));
        g2d.fillOval(445, 355, 40, 90);// borra pecho

        g2d.setPaint(Color.WHITE);
        
        g2d.setPaint(new GradientPaint(0, 30, zioRosaV, 80, 100, zioRosaV2, true));
        g2d.fillOval(505, 355, 82, 82);
        
        
        //zafiro de enmedio
        g2d.setPaint(new GradientPaint(0, 30, mostaza, 80, 100, amarillo, true));
        g2d.fillOval(440, 358, 45, 65);
          g2d.setPaint(new GradientPaint(0, 30, azul2, 80, 100, zioAzulsaf, true));
        g2d.fillOval(440, 365, 35, 48);
        
        
        
        g2d.setPaint(carne);
        
        int[] brax = {531, 539, 548, 560, 559, 543};
        int[] bray = {431, 457, 461, 443, 432, 425};
        g2d.fillPolygon(brax, bray, 6);
        
        
        
        
        
        g2d.setPaint(Color.black);
        
        
        g2d.drawLine(528, 436, 532, 453);// derecho 1
        g2d.drawLine(561, 436, 563, 447);// derecho 2
        g2d.drawLine(524, 457, 548, 462);// guante 1
        qc2d.setCurve(548, 462, 555, 444, 565, 447);// guante 2
        g2d.draw(qc2d);
        qc2d.setCurve(524, 457, 525, 462, 541, 496);// guante <3
        g2d.draw(qc2d);
        qc2d.setCurve(541, 496, 553, 517, 548, 541);// guante <4
        g2d.draw(qc2d);
        qc2d.setCurve(565, 448, 565, 480, 569, 494);// guante 5>
        g2d.draw(qc2d);
        qc2d.setCurve(569, 494, 594, 522, 576, 555);// guante 6>
        g2d.draw(qc2d);
        qc2d.setCurve(576, 555, 560, 535, 560, 540);// guante 7<
        g2d.draw(qc2d);
//        
        //COLORES 
        g2d.setPaint(violeta);
        g2d.drawLine(529, 404, 538, 420);
        g2d.drawLine(561, 402, 554, 425);
        
        g2d.setPaint(Color.black);
        
        qc2d.setCurve(561, 435, 545, 408, 521, 434);// curva del brazo en hombro 
        g2d.draw(qc2d);

        g2d.setPaint(Color.red);
        int[] box={460,486,479,470};
        int[] boy ={314,314,322,322};
        g2d.fillPolygon(box,boy,4);

        dibujarOjos(g2d);
      Font(g2d);//letras
      


//        g2d.fillOval(cx, cy, cx, cy);

//        g2d.setPaint(Color.YELLOW);
//        String cor = "(" + cx + "," + cy + ")";
//        g.setColor(Color.GREEN);
//        g.drawString(cor, cx, cy);
//        g.drawLine(cx, cy, cx, cy);

    }
    
    public void dibujarOjos(Graphics2D g){
    g.setPaint(Color.black);
    g.setColor(carne2);
      g.fillOval(475, 250, 23, x5); //ojo derecho (de mi perspectiva)
    g.setColor(carne2);
      g.fillOval(440, 250, 23, x4); //ojo izquierdo (de mi perspectiva)
g.setStroke(new BasicStroke(5.0f));
    
    
    }
 
    public void Font(Graphics g){
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif",Font.ITALIC,50));
    g.drawString("Princess Peach", 50, 50);
    
    
    
    }

    
    
    public void parpadeo(){
          if (x4==27    )
    { 
    x4=3;
    x5=3;
    }
        else{
       x4=x4+3;
       x5=x5+3;
    }}
    
}
