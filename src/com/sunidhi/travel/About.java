package com.sunidhi.travel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sunidhi Thakur
 */
public class About extends JFrame implements ActionListener{
    String s;
    JButton b1;
    About(){
        setBounds(800, 240, 500, 500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("Travel and Tourism Management System");
        l1.setBounds(105,10,400,80);
        l1.setForeground(new Color(47, 102, 152));
        l1.setFont(new Font("Calibiri", Font.BOLD, 14));
        add(l1);
        
        s = "                      \t  \t       About Projects          \n  "
                + "\nThe objective of the Travel and Tourism Management System "
                + "project is to develop a system that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nGives accurate information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification"
                ;
        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(35, 100, 410, 280);
        add(t1);
        
        b1 = new JButton("Back");
        b1.setBounds(185, 400, 100, 30);
        b1.setBackground(new Color(134, 154, 176));
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createLineBorder(new Color(134, 154, 176), 1));
        b1.addActionListener(this);
        add(b1);
        
        
    }
    public static void main(String args[]){
        new About().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }
}
