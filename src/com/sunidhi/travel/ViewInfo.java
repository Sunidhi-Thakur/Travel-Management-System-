package com.sunidhi.travel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;


/**
 *
 * @author Sunidhi Thakur
 */
public class ViewInfo extends JFrame implements ActionListener {
    JButton b1;
    
    ViewInfo(String username){
        setBounds(750, 250, 520, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l11 = new JLabel("MY DETAILS");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l11.setBounds(175,5,500,25);
        l11.setForeground(new Color(134,154,176));
        add(l11);
        
        JLabel l1 = new JLabel("Username: ");
         l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
         l1.setBounds(30,250,150,25);
         add(l1);
         
         JLabel t1 = new JLabel();
         t1.setBounds(115,250,250,25);
         t1.setForeground(new Color(47,102,152));
         t1.setFont(new Font("Calibiri", Font.BOLD, 14));
         add(t1);
         
         JLabel l2 = new JLabel("ID: ");
         l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
         l2.setBounds(30,290,150,25);
         add(l2);
         
         JLabel t2 = new JLabel();
         t2.setBounds(115,290,250,25);
         t2.setForeground(new Color(47,102,152));
         t2.setFont(new Font("Calibiri", Font.BOLD, 14));
         add(t2);
         
         JLabel l3 = new JLabel("ID Number: ");
         l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
         l3.setBounds(30,330,150,25);
         add(l3);
         
         JLabel t3 = new JLabel();
         t3.setBounds(115,330,250,25);
         t3.setForeground(new Color(47,102,152));
         t3.setFont(new Font("Calibiri", Font.BOLD, 14));
         add(t3);
         
         JLabel l4 = new JLabel("Name: ");
         l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
         l4.setBounds(30,370,150,25);
         add(l4);
         
         JLabel t4 = new JLabel();
         t4.setBounds(115,370,250,25);
         t4.setForeground(new Color(47,102,152));
         t4.setFont(new Font("Calibiri", Font.BOLD, 14));
         add(t4);
         
         JLabel l5 = new JLabel("Gender: ");
         l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
         l5.setBounds(30,410,150,25);
         add(l5);
         
         JLabel t5 = new JLabel();
         t5.setBounds(115,410,250,25);
         t5.setForeground(new Color(47,102,152));
         t5.setFont(new Font("Calibiri", Font.BOLD, 14));
         add(t5);
     
         
         JLabel l6 = new JLabel("Country: ");
         l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
         l6.setBounds(270,250,150,25);
         add(l6);
         
         JLabel t6 = new JLabel();
         t6.setBounds(355,250,250,25);
         t6.setForeground(new Color(47,102,152));
         t6.setFont(new Font("Calibiri", Font.BOLD, 14));
         add(t6);
       
         
         JLabel l7 = new JLabel("Address: ");
         l7.setFont(new Font("Tahoma", Font.PLAIN, 14));
         l7.setBounds(270,290,150,25);
         add(l7);
         
         JLabel t7 = new JLabel();
         t7.setBounds(355,290,250,25);
         t7.setFont(new Font("Calibiri", Font.BOLD, 14));
         t7.setForeground(new Color(47,102,152));
         add(t7);
        
         
         JLabel l8 = new JLabel("Mob. No: ");
         l8.setFont(new Font("Tahoma", Font.PLAIN, 14));
         l8.setBounds(270,330,150,25);
         add(l8);
       
         JLabel t8 = new JLabel();
         t8.setBounds(355,330,250,25);
         t8.setForeground(new Color(47,102,152));
         t8.setFont(new Font("Calibiri", Font.BOLD, 14));
         add(t8);
         
         
         JLabel l9 = new JLabel("Email: ");
         l9.setFont(new Font("Tahoma", Font.PLAIN, 14));
         l9.setBounds(270,370,150,25);
         add(l9);
         
         JLabel t9 = new JLabel();
         t9.setBounds(355,370,250,25);
         t9.setForeground(new Color(47,102,152));
         t9.setFont(new Font("Calibiri", Font.BOLD, 14));
         add(t9);
         
         b1 = new JButton("Back");
         b1.setBounds(200,455, 100, 30);
         b1.setBackground(new Color(134,154,176));
         b1.setFont(new Font("Tahoma", Font.BOLD, 14));
         b1.setForeground(Color.WHITE);
         b1.setBorder(BorderFactory.createLineBorder(new Color(134,154,176), 1));
         b1.addActionListener(this);
         add(b1);
        
         
          try{
             Conn c = new Conn();
             ResultSet rs = c.s.executeQuery("select * from user where username='"+username+"'");
             while(rs.next()){
                 t1.setText(rs.getString("username"));
                 t2.setText(rs.getString("id"));
                 t3.setText(rs.getString("number"));
                 t4.setText(rs.getString("name"));
                 String gender = rs.getString("gender");
                 t5.setText(gender);
                 if(gender.equals("Male")){          
                    ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("./icons/male.png"));
                    Image i1 = img.getImage().getScaledInstance(150, 150, Image.SCALE_REPLICATE);
                    ImageIcon img2 = new ImageIcon(i1);
                    JLabel l10 = new JLabel(img2);
                    l10.setBounds(178, 50, 150, 150);
                    add(l10); 
                 }else{       
                    ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("./icons/female.png"));
                    Image i1 = img.getImage().getScaledInstance(150, 150, Image.SCALE_REPLICATE);
                    ImageIcon img2 = new ImageIcon(i1);
                    JLabel l10 = new JLabel(img2);
                    l10.setBounds(178, 50, 150, 150);
                    add(l10); 
                 }
                 t6.setText(rs.getString("country"));
                 t7.setText(rs.getString("address"));
                 t8.setText(rs.getString("phone"));
                 t9.setText(rs.getString("email"));
             }
         }catch(Exception e){}  
         
         
         
    }
    
    public static void main(String args[]){
        new ViewInfo("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource() == b1){
            this.setVisible(false);
        }     
        
    }
    
    
}
