package com.sunidhi.travel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Sunidhi Thakur
 */
public class Loading extends JFrame implements Runnable{
    JProgressBar p;
    Thread t;
    String username;
    
    Loading(String username){
        this.username = username;
        t = new Thread(this);
        
        setBounds(700,250,600,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Travel And Tourism");
        l1.setBounds(160,40,300,40);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l1.setForeground(new Color(47,102,146));
        add(l1);
        
        p = new JProgressBar();
        p.setBounds(130, 100, 320, 18);
        p.setStringPainted(true);
        add(p);
        
        JLabel l2 = new JLabel("Moving to your destination...");
        l2.setBounds(208,114,300,40);
        l2.setFont(new Font("Calibiri", Font.BOLD, 12));
        l2.setForeground(new Color(36,135,78));
        add(l2);
        
        JLabel l3 = new JLabel("Welcome "+username);
        l3.setBounds(20,320,300,40);
        l3.setFont(new Font("Calibiri", Font.BOLD, 16));
        l3.setForeground(new Color(36,135,78));
        add(l3);
        
        t.start();
    }
    public static void main(String[] args){
        new Loading("").setVisible(true);
    }

    @Override
    public void run() {
        try{
            for(int i=1; i<=101; i++){
                int max = p.getMaximum();
                int curr = p.getValue();
                if(curr < max)
                    p.setValue(p.getValue()+1);
                else{
                    i = 101;
                    setVisible(false);
                    new Dashboard(username).setVisible(true);
                }
                Thread.sleep(50);
            }
        }catch(Exception e){
            
        }
    } 
    
    
}
