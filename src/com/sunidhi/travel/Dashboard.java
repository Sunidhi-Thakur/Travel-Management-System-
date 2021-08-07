package com.sunidhi.travel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sunidhi Thakur
 */
public class Dashboard extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    String username;
    
    Dashboard(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBounds(0,0,1950,50);
        p1.setBackground(new Color(47,102,146));
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("./icons/home-icon.png"));
        Image i2 = i1.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1 = new JLabel(i3);
        l1.setBounds(5,11,30,30);
        p1.add(l1);
        
        JLabel l3 = new JLabel("Dashboard");
        l3.setFont(new Font("Tahoma", Font.BOLD, 20));
        l3.setForeground(Color.white);
        l3.setBounds(45,17,300,20);
        p1.add(l3);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("./icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        
        JLabel l2 = new JLabel(i6);
        l2.setBounds(300,50,1650,1000);
        add(l2);
        
        JLabel l4 = new JLabel("Travel and Tourism Management System");
        l4.setBounds(335,2,1000,60);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Anton", Font.BOLD, 50));
        l2.add(l4);
        
        JPanel p2 = new JPanel();
        p2.setBounds(0,50,300,1000);
        p2.setBackground(new Color(47,102,146));
        p2.setLayout(null);
        add(p2);
        
        b1 = new JButton("Add Personal Details");
        b1.setBackground(new Color(47,102,146));
        b1.setForeground(Color.WHITE);
        b1.setBounds(0,0,300,50);
        b1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b1.addActionListener(this);
        p2.add(b1);
        
        b2 = new JButton("Update Personal Details");
        b2.setBackground(new Color(47,102,146));
        b2.setForeground(Color.WHITE);
        b2.setBounds(0,50,300,50);
        b2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b2.addActionListener(this);
        p2.add(b2);
        
        b3 = new JButton("View Details");
        b3.setBackground(new Color(47,102,146));
        b3.setForeground(Color.WHITE);
        b3.setBounds(0,100,300,50);
        b3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b3.addActionListener(this);
        p2.add(b3);
        
        b4 = new JButton("Delete Personal Details");
        b4.setBackground(new Color(47,102,146));
        b4.setForeground(Color.WHITE);
        b4.setBounds(0,150,300,50);
        b4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b4.addActionListener(this);
        p2.add(b4);
        
        b5 = new JButton("Check Package");
        b5.setBackground(new Color(47,102,146));
        b5.setForeground(Color.WHITE);
        b5.setBounds(0,200,300,50);
        b5.setFont(new Font("Tahoma", Font.PLAIN, 14)); 
        b5.addActionListener(this);
        p2.add(b5);
        
        b6 = new JButton("Book Package");
        b6.setBackground(new Color(47,102,146));
        b6.setForeground(Color.WHITE);
        b6.setBounds(0,250,300,50);
        b6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b6.addActionListener(this);
        p2.add(b6);
        
        b7 = new JButton("View My Package");
        b7.setBackground(new Color(47,102,146));
        b7.setForeground(Color.WHITE);
        b7.setBounds(0,300,300,50);
        b7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b7.addActionListener(this);
        p2.add(b7);
        
        b8 = new JButton("View Hotels");
        b8.setBackground(new Color(47,102,146));
        b8.setForeground(Color.WHITE);
        b8.setBounds(0,350,300,50);
        b8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b8.addActionListener(this);
        p2.add(b8);
        
        b9 = new JButton("Book Hotel");
        b9.setBackground(new Color(47,102,146));
        b9.setForeground(Color.WHITE);
        b9.setBounds(0,400,300,50);
        b9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p2.add(b9);
        
        b10 = new JButton("View Booked Hotel");
        b10.setBackground(new Color(47,102,146));
        b10.setForeground(Color.WHITE);
        b10.setBounds(0,450,300,50);
        b10.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p2.add(b10);
        
        b11 = new JButton("Destination");
        b11.setBackground(new Color(47,102,146));
        b11.setForeground(Color.WHITE);
        b11.setBounds(0,500,300,50);
        b11.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p2.add(b11);
        
        b12 = new JButton("Payment");
        b12.setBackground(new Color(47,102,146));
        b12.setForeground(Color.WHITE);
        b12.setBounds(0,550,300,50);
        b12.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p2.add(b12);
        
        b13 = new JButton("Notes");
        b13.setBackground(new Color(47,102,146));
        b13.setForeground(Color.WHITE);
        b13.setBounds(0,600,300,50);
        b13.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b13.addActionListener(this);
        p2.add(b13);
        
        b14 = new JButton("Calculator");
        b14.setBackground(new Color(47,102,146));
        b14.setForeground(Color.WHITE);
        b14.setBounds(0,650,300,50);
        b14.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b14.addActionListener(this);
        p2.add(b14);
        
        b15 = new JButton("About");
        b15.setBackground(new Color(47,102,146));
        b15.setForeground(Color.WHITE);
        b15.setBounds(0,700,300,50);
        b15.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p2.add(b15);        
    }
    
    public static void main(String args[]){
        new Dashboard("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
            new AddUser(username).setVisible(true);
        }
        else if(ae.getSource() == b2){
            new UpdateInfo(username).setVisible(true);
        }
        else if(ae.getSource() == b3){
            new ViewInfo(username).setVisible(true);
        }
        else if(ae.getSource() == b5){
            new CheckPackage().setVisible(true);
        }
        else if(ae.getSource() == b6){
            new BookPackage(username).setVisible(true);
        }
        else if(ae.getSource() == b14){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(IOException e){}
            
        }else if(ae.getSource() == b13){
             try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(IOException e){}
            
            
        }
    }
    
}
