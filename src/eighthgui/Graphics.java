/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eighthgui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author HP
 */
public class Graphics extends JPanel implements ActionListener , KeyListener{
    JButton n = new JButton("Set Background");
    
    Timer tt = new Timer(50 , this);
    int b1 = 0 , b2 = 0 , bb1 = 5 , bb2 = 5 , m1 = 50 , m2 = 250;
    
    public Graphics()
    {
        this.add(n);
        n.addActionListener(this);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
    }

    protected void paintComponent(java.awt.Graphics grphcs) {
        super.paintComponent(grphcs);
        tt.start();
        grphcs.setColor(Color.CYAN);
        grphcs.draw3DRect(130, 100, 200, 300, true);
        
        grphcs.setColor(Color.white);
        grphcs.fill3DRect(150, 120, 50, 70, true);
        grphcs.fill3DRect(255, 120, 50, 70, true);
        
        grphcs.fill3DRect(155, 230, 50, 70, true);
        grphcs.fill3DRect(255, 230, 50, 70, true);
        
        grphcs.setColor(Color.CYAN);
        grphcs.fill3DRect(185, 320, 90, 40, true);
        
        grphcs.fillOval(b1, b2, 50, 50);
        
        grphcs.fillOval(m1 , m2 , 70 , 70);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == n)
        {
        JColorChooser c = new JColorChooser();
        Color vv = c.showDialog(null , "Select Color" , Color.white);
        this.setBackground(vv);
        }
        if(b1 < 0 || b1 > this.getWidth())
        {
            bb1 = - bb1; 
        }
        else if (b2 < 0 || b2 > this.getHeight())
        {
            bb2 = - bb2; 
        }
        b1 += bb1;
        b2 += bb2;
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int k = ke.getKeyCode();
        switch(k)
        {
            case KeyEvent.VK_UP:
                m2 -= 5;
                break;
            case KeyEvent.VK_DOWN:
                m2 += 5;
                break;
            case KeyEvent.VK_RIGHT:
                m1 += 5;
                break;
            case KeyEvent.VK_LEFT:
                m1 -= 5;
                break;
        }
        
    }
 
    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
