import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.w3c.dom.events.MouseEvent;

import java.applet.Applet;

public abstract class pa10 extends Applet implements KeyListener,MouseEvent{

    String str = "";

    public void init(){
        addKeyListener(this);
        requestFocus();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        str+=e.getKeyChar();
        repaint();        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        showStatus("Key Pressed");        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        showStatus("Key Released");        
    }
    
    // public void clickR(MouseEvent e) {
    //     showStatus(str);        
    // }

    public void paint(Graphics g){
        g.drawString(str, 15, 15);
    }

}

/*
 * <applet code="pa10.class" width=500 height=200>
 * </applet>
 * 
 */