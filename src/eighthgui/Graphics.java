/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eighthgui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author HP
 */
public class Graphics extends JPanel implements ActionListener{
    Timer tt = new Timer(50 , this);
    int b1 = 0 , b2 = 0;

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
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        b1 += 5;
        b2 += 5;
        repaint();
    }
}
