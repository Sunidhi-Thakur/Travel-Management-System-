package com.sunidhi.travel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sunidhi Thakur
 */
public class ForgotPassword extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    ForgotPassword(){
        setBounds(550,350, 900, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(50, 20, 550, 300);
        add(p);
        
        JLabel l1 = new JLabel("Username: ");
         l1.setFont(new Font("Tahoma", Font.BOLD, 14));
         l1.setBounds(60,30,140,25);
         p.add(l1);
         
         t1 = new JTextField();
         t1.setBorder(BorderFactory.createEmptyBorder());
         t1.setBounds(205,30,200,25);
         t1.setFont(new Font("Calibiri", Font.PLAIN, 14));
         p.add(t1);
         
         b1 = new JButton("Search");
         b1.setBackground(new Color(134,154,176));
         b1.setForeground(Color.white);
         b1.setBounds(420, 30, 90, 25);
         b1.addActionListener(this);
         p.add(b1);
         
         JLabel l2 = new JLabel("Name: ");
         l2.setFont(new Font("Tahoma", Font.BOLD, 14));
         l2.setBounds(60,70,140,25);
         p.add(l2);
         
         t2 = new JTextField();
         t2.setBorder(BorderFactory.createEmptyBorder());
         t2.setBounds(205,70,200,25);
         t2.setFont(new Font("Calibiri", Font.PLAIN, 14));
         p.add(t2);
         
         JLabel l3 = new JLabel("Security Question: ");
         l3.setFont(new Font("Tahoma", Font.BOLD, 14));
         l3.setBounds(60,110,140,25);
         p.add(l3);
         
         t3 = new JTextField();
         t3.setBorder(BorderFactory.createEmptyBorder());
         t3.setBounds(205,110,305,25);
         t3.setFont(new Font("Tahoma", Font.PLAIN, 14));
         p.add(t3);
         
         JLabel l4 = new JLabel("Answer: ");
         l4.setFont(new Font("Tahoma", Font.BOLD, 14));
         l4.setBounds(60,150,140,25);
         p.add(l4);
         
         t4 = new JTextField();
         t4.setBorder(BorderFactory.createEmptyBorder());
         t4.setBounds(205,150,200,25);
         t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
         p.add(t4);
         
         b2 = new JButton("Retrieve");
         b2.setBackground(new Color(134,154,176));
         b2.setForeground(Color.white);
         b2.setBounds(420, 150, 90, 25);
         b2.addActionListener(this);
         p.add(b2);
         
         
         JLabel l5 = new JLabel("Password: ");
         l5.setFont(new Font("Tahoma", Font.BOLD, 14));
         l5.setBounds(60,190,140,25);
         p.add(l5);
         
         t5 = new JTextField();
         t5.setBorder(BorderFactory.createEmptyBorder());
         t5.setBounds(205,190,200,25);
         t5.setFont(new Font("Calibiri", Font.PLAIN, 14));
         p.add(t5);
         
         b3 = new JButton("Back");
         b3.setBackground(new Color(134,154,176));
         b3.setForeground(Color.white);
         b3.setBounds(230, 250, 90, 25);
         b3.addActionListener(this);
         p.add(b3);
         
         ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("./icons/fp.png"));
         Image i1 = img.getImage().getScaledInstance(250, 200, Image.SCALE_REPLICATE);
         ImageIcon img2 = new ImageIcon(i1);
         JLabel l6 = new JLabel(img2);
         l6.setBounds(600, 90, 250, 200);
         add(l6);
        
    }
    public static void main(String args[]){
        new ForgotPassword().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Conn c = new Conn();
        if(ae.getSource() == b1){
            try{
               String query = "select * from account where username ='"+t1.getText()+"'";
               ResultSet rs = c.s.executeQuery(query); 
               while(rs.next()){
                   t2.setText(rs.getString("name"));
                   t3.setText(rs.getString("security"));
               }
            }catch(SQLException e){
                System.out.println(e);
            }
        }else if(ae.getSource() == b2){
            try{
               String query = "select * from account where answer ='"+t4.getText()+"'AND username ='"+t1.getText()+"'";
               ResultSet rs = c.s.executeQuery(query); 
               while(rs.next()){
                   t5.setText(rs.getString("password"));
               }
            }catch(SQLException e){
                System.out.println(e);
            }
            
        }else{
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }
}
