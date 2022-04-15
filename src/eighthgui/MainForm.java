/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eighthgui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class MainForm extends JFrame{
    Graphics g = new Graphics();
    public MainForm()
    {
        this.setTitle("Hosny");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocation(450 , 40);
        g.setBackground(Color.black);
        this.add(g);
    }
}
