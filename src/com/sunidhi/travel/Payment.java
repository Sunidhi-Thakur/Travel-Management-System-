/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunidhi.travel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sunidhi Thakur
 */
public class Payment extends JFrame implements ActionListener{
    JButton b1,b2;
    Payment(){
        setBounds(650, 240, 800, 600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("./icons/paytm.jpg"));
        Image i1 = img.getImage().getScaledInstance(800,600, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(i1);
        JLabel l10 = new JLabel(img2);
        l10.setBounds(0, 0, 800, 600);
        add(l10);
        
        b1 = new JButton("Pay");
        b1.setBounds(270, 70, 100, 30);
        b1.setBackground(new Color(134, 154, 176));
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createLineBorder(new Color(134, 154, 176), 1));
        b1.addActionListener(this);
        l10.add(b1);
        
        b2 = new JButton("Back");
        b2.setBounds(420, 70, 100, 30);
        b2.setBackground(new Color(134, 154, 176));
        b2.setFont(new Font("Tahoma", Font.BOLD, 14));
        b2.setForeground(Color.WHITE);
        b2.setBorder(BorderFactory.createLineBorder(new Color(134, 154, 176), 1));
        b2.addActionListener(this);
        l10.add(b2);
        
    }
    
    public static void main(String[] args){
        new Payment().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            this.setVisible(false);
            new Paytm().setVisible(true);
        }else{
            this.setVisible(false);
        }
    }
    
}
