package com.sunidhi.travel;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;
/**
 *
 * @author Sunidhi Thakur
 */
public class Login extends JFrame implements ActionListener{
    
    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField t2;
    
    Login(){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(626, 350, 800, 500); //Frame class calls set bounds.
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0,200,800,500);
       
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("./icons/login.jpg"));
        Image img2 = img1.getImage().getScaledInstance(626, 252, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel l1 = new JLabel(img3);
        l1.setBounds(0, 175, 626, 252);
        p1.add(l1);
        
        add(p1);
        
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,0, 800, 252);
        add(p2);
        
        JLabel l2 = new JLabel("Username: ");
        l2.setBounds(250,20,150,25);
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(l2);
        
        t1 = new JTextField();
        t1.setBounds(360, 20,200,25);
        t1.setFont(new Font("SAN_SERIF", Font.BOLD, 16));
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);
        
        JLabel l3 = new JLabel("Password: ");
        l3.setBounds(250,60,150,25);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(l3);
        
        t2 = new JPasswordField();
        t2.setBounds(360, 60,200,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);
        
        
        b1 = new JButton("Login");
        b1.setBounds(270,100, 130, 25);
        b1.setBackground(new Color(134,154,176));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        p2.add(b1);
        
        b2 = new JButton("Sign Up");
        b2.setBounds(410,100, 130, 25);
        b2.setForeground(new Color(134,154,176));
        b2.setBackground(Color.WHITE);
        b2.setBorder(new LineBorder(new Color(134,154,176)));
        b2.addActionListener(this);
        p2.add(b2);
        
        b3 = new JButton("Forgot Password?");
        b3.setBounds(340,140, 130, 25);
        b3.setForeground(new Color(134,154,176));
        b3.setBackground(Color.WHITE);
        b3.setBorder(new LineBorder(new Color(134,154,176)));
        b3.addActionListener(this);
        p2.add(b3);
        
        JLabel l4 = new JLabel("Trouble logging in...?");
        l4.setBounds(340, 175, 130, 25);
        l4.setForeground(Color.red);
        l4.setFont(new Font("SAN_SERIF", Font.PLAIN, 12));
        p2.add(l4);
        
        setVisible(true);
    }public static void main(String[] args){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
            try{
                Conn c = new Conn();
                String username = t1.getText();
                String password = t2.getText();
                String query = "select * from account where username = '"+username+"' AND password = '"+password+"'";
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    this.setVisible(false);
                    new Loading(username).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Credentials");
                }
            }catch(HeadlessException | SQLException e){
                
            }
            
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new SignUp().setVisible(true);
        }else{
            this.setVisible(false);
            new ForgotPassword().setVisible(true);
        }
       
    }
    
}
