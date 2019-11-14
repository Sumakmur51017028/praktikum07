/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.*;

/**
 *
 * @author Sumakmur Goenawan
 */
public class prak1 extends JFrame {
    
    JButton nButton = new JButton("North");
    JButton sButton = new JButton("South");
    JButton eButton = new JButton("East");
    JButton wButton = new JButton("West");
    JButton cButton = new JButton("Center");
    
public prak1(){
    super("Border Layout Berkasi");
    setSize(240,280);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
        add(nButton, BorderLayout.NORTH);
        add(sButton, BorderLayout.SOUTH);
        add(eButton, BorderLayout.EAST);
        add(wButton, BorderLayout.WEST);
        add(cButton, BorderLayout.CENTER);}

public static void main(String[] args){
    prak1 frame = new prak1();
    frame.setVisible(true);
        
    
}
    
    
}
