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
import java.awt.GridLayout;
import javax.swing.JPanel;
        
        
     

/**
 *
 * @author Sumakmur Goenawan
 */
public class prak3 extends JFrame {
    JButton marcia = new JButton("marcia");
    JButton carol = new JButton("Carol");
    JButton greg = new JButton("Greg");
    JButton jan = new JButton("Jan");
    JButton alice = new JButton("Alice");
    JButton peter = new JButton("Peter");
    JButton cindy = new JButton("Cindy");
    JButton mike = new JButton("Mike");
    JButton bobby = new JButton("Bobby");
    
public prak3(){
    super("Grid Layout Beraksi");
    setSize(260,260);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
    GridLayout family = new GridLayout(3,3,10,10);
    pane.add(marcia);
    pane.add(carol);
    pane.add(greg);
    pane.add(jan);
    pane.add(alice);
    pane.add(peter);
    pane.add(cindy);
    pane.add(mike);
    pane.add(bobby);
    add(pane);
    setVisible(true);
    
    
    
}
    
    public static void main(String[] args) {
        prak3 frame = new prak3();
    }
}
