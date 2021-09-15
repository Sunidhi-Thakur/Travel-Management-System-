/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunidhi.travel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author Sunidhi Thakur
 */
public class Paytm extends JFrame implements ActionListener{
    JButton b1;
    Paytm(){
        JEditorPane j = new JEditorPane();
        j.setEditable(false);
        j.setBackground(Color.WHITE);
        try{
            j.setPage("https://paytm.com/credit-card-bill-payment");
        }catch(IOException e){
            System.out.println(e.getMessage());
            j.setContentType("text/html");
            j.setText("<html>"+e.getMessage()+"</html>");
        }
        JScrollPane js = new JScrollPane(j);
        js.setBackground(Color.WHITE);
        getContentPane().add(js);
        setBounds(0,60,800,600);
        
        b1 = new JButton("Back");
        b1.setBounds(350, 20, 100, 30);
        b1.setBackground(new Color(134, 154, 176));
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createLineBorder(new Color(134, 154, 176), 1));
        b1.addActionListener(this);
        j.add(b1);
        
    }
    
    public static void main(String args[]){
        new Paytm().setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        new Payment().setVisible(true);
    }
    
}
