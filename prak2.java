/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;


/**
 *
 * @author Sumakmur Goenawan
 */
public class prak2 extends JFrame {
    
public prak2(){
    FlowLayout GUI = new FlowLayout(FlowLayout.CENTER, 5, 10);
    Container container = getContentPane();
    
    container.setLayout(GUI);
    
    container.add(new JButton("tombol 1"));
    container.add(new JButton("tombol 2"));
    container.add(new JButton("tombol 3"));
    container.add(new JButton("tombol 4"));
    container.add(new JButton("tombol 5"));
}

public static void main(String[] args){
    prak2 jendela = new prak2();
    jendela.setTitle("Kelas Demoprak2");
    jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jendela.setSize(390,120);
    jendela.setVisible(true);
    
}
    
}
