package grahg;
import java.awt.*;
import java.applet.*;


public class draw extends Applet {
    // int x1[]={20,120,220,20},y1[]={20,120,20,20},n1=4;
    // int x2[]={120,220,228,120},y2[]={120,20,220,120},n2=4;
    public void paint(Graphics g){
        // g.drawLine(10, 10, 50, 50);
        // g.drawRect(10, 60, 40, 30);
        // g.fillRect(60, 10, 30, 80);
        // g.drawRoundRect(10, 100, 80, 50, 10, 10);
        // g.fillRoundRect(20, 110, 60, 30,5, 5);
        // g.drawLine(100, 10, 230, 140);
        // g.drawLine(100, 140, 230, 10);

        // g.drawOval(10, 10, 10, 10);
        // g.setColor(Color.red);
        // g.fillOval(10, 100, 80, 80);

        // g.drawOval(100, 10, 80, 50);
        // g.setColor(Color.blue);
        // g.fillOval(100, 100, 80, 50);

        //for(int i=0,j =180;i<10;i++,j--)g.drawArc(i, 10, 100, 100, 90, j);

        // g.drawOval(40, 40, 120, 150);
        // g.drawOval(57, 75, 30, 20);
        // g.drawOval(110, 75, 30, 20);

        // g.fillOval(68, 81, 10, 10);
        // g.fillOval(120, 81, 10, 10);

        // g.drawOval(85, 100, 30, 30);
        // g.fillArc(60, 125, 80, 40, 180, 180);
        // g.drawOval(25, 92, 15, 30);
        // g.drawOval(160, 92, 15, 30);
        // g.drawPolygon(x1,y1,n1);
        // g.fillPolygon(x2,y2,n2);
        for(int i=0; i<=4;i++)
        if(i%2==0)g.drawOval(120, i*60, 50, 50);
        else g.fillOval(120, i*60, 50, 50);


    }
}
/*
* <applet code="draw.class" width="200" height="200">
 * </applet> 
 */