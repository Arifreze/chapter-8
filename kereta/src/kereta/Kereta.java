/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kereta;

/**
 *
 * @author ASUS TUF
 */

import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Kereta extends JFrame {
    private JLabel label1;
    private JButton plainButton;

     public Kereta (){
         super("Kereta");
       Container container = getContentPane();
       container.setLayout(new FlowLayout());
       label1 = new JLabel("Choose Your Car");
      // label1.setToolTipText("this is label1");
       container.add(label1);
       setSize(100,70);
       setVisible(true);
       
       Icon rabbit = new ImageIcon("src/myvi.jpg");
       plainButton = new JButton("PlainButton");
       container.add(plainButton);
         
         
         
    }
     public static void main(String[] args) {
        Kereta application = new Kereta ();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
    

