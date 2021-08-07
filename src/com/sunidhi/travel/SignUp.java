package com.sunidhi.travel;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sunidhi Thakur
 */

 public class SignUp extends JFrame implements ActionListener{
     JButton b1,b2;
     JTextField t1, t2, t3, t4;
     Choice ch;
     SignUp(){
         setBounds(580, 300, 900, 360);
         getContentPane().setBackground(Color.WHITE); 
         setLayout(null);
         
         JPanel p1 = new JPanel();
         p1.setBackground(new Color(174,198,207));
         p1.setBounds(0,0,500,400);
         p1.setLayout(null);
         add(p1);
         
         ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("./icons/signup.png"));
         Image i1 = img.getImage().getScaledInstance(300, 250, Image.SCALE_REPLICATE);
         ImageIcon img2 = new ImageIcon(i1);
         JLabel l6 = new JLabel(img2);
         l6.setBounds(540, 50, 300, 250);
         add(l6);
         
         
         JLabel l1 = new JLabel("Username: ");
         l1.setFont(new Font("Tahoma", Font.BOLD, 14));
         l1.setBounds(50,20,140,25);
         p1.add(l1);
         
         t1 = new JTextField();
         t1.setBorder(BorderFactory.createEmptyBorder());
         t1.setBounds(205,20,250,25);
         t1.setFont(new Font("Calibiri", Font.PLAIN, 14));
         p1.add(t1);
         
         JLabel l2 = new JLabel("Name: ");
         l2.setFont(new Font("Tahoma", Font.BOLD, 14));
         l2.setBounds(50,60,140,25);
         p1.add(l2);
         
         t2 = new JTextField();
         t2.setBorder(BorderFactory.createEmptyBorder());
         t2.setBounds(205,60,250,25);
         t2.setFont(new Font("Calibiri", Font.PLAIN, 14));
         p1.add(t2);
         
         JLabel l3 = new JLabel("Password: ");
         l3.setFont(new Font("Tahoma", Font.BOLD, 14));
         l3.setBounds(50,100,140,25);
         p1.add(l3);
         
         t3 = new JTextField();
         t3.setBorder(BorderFactory.createEmptyBorder());
         t3.setBounds(205,100,250,25);
         p1.add(t3);
         
         JLabel l4 = new JLabel("Security Question: ");
         l4.setFont(new Font("Tahoma", Font.BOLD, 14));
         l4.setBounds(50,140,140,25);
         p1.add(l4);
         
         ch = new Choice();
         ch.add("In what city were you born?");
         ch.add("What is the name of your favorite pet?");
         ch.add("What is your mother's maiden name?");
         ch.add("What high school did you attend?");
         ch.add("What is the name of your first school?");
         ch.add("What was your favorite food as a child?");
         ch.add("What is your oldest cousin's first name?");
         ch.setBounds(205,140,250,25);
         p1.add(ch);
         
         JLabel l5 = new JLabel("Answer: ");
         l5.setFont(new Font("Tahoma", Font.BOLD, 14));
         l5.setBounds(50,180,140,25);
         p1.add(l5);
         
         t4 = new JTextField();
         t4.setBorder(BorderFactory.createEmptyBorder());
         t4.setBounds(205,180,250,25);
         t4.setFont(new Font("Calibiri", Font.PLAIN, 14));
         p1.add(t4);
         
         
        b1 = new JButton("Create");
        b1.setBounds(125,250, 100, 30);
        b1.setForeground(new Color(134,154,176));
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.setBackground(Color.WHITE);
        b1.setBorder(BorderFactory.createLineBorder(new Color(134,154,176), 1));
        b1.addActionListener(this);
        p1.add(b1);
        
        b2 = new JButton("Back");
        b2.setBounds(265,250, 100, 30);
        b2.setForeground(new Color(134,154,176));
        b2.setFont(new Font("Tahoma", Font.BOLD, 14));
        b2.setBorder(BorderFactory.createLineBorder(new Color(134,154,176), 1));
        b2.setBackground(Color.WHITE);
        b2.addActionListener(this);
        p1.add(b2);
      
         
         
         
         
         
     }
    public static void main(String args[]){
        new SignUp().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
            String username = t1.getText();
            String name = t2.getText();
            String password = t3.getText();
            String security = ch.getSelectedItem();
            String answer = t4.getText();
            
            String query = "insert into account values('"+username+"', '"+name+"', '"+password+"', '"+security+"', '"+answer+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "User Registered Successfully!");
                this.setVisible(false);
                new Login().setVisible(true);
            }catch(SQLException e){
                System.out.println(e);
            }
            
        }else{
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }
    
}
