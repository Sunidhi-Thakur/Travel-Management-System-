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
public class UpdateInfo extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5,t6,t7,t9;
    JFormattedTextField t8;
    JButton b1,b2;
    
    UpdateInfo(String username){
        setBounds(600, 250, 850, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l11 = new JLabel("UPDATE DETAILS");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l11.setBounds(285,5,500,25);
        l11.setForeground(new Color(134,154,176));
        add(l11);
        
        JLabel l1 = new JLabel("Username: ");
         l1.setFont(new Font("Tahoma", Font.BOLD, 14));
         l1.setBounds(30,50,150,25);
         add(l1);
         
         t1 = new JTextField();
         t1.setBounds(150,50,250,25);
         t1.setFont(new Font("Calibiri", Font.PLAIN, 14));
         add(t1);
         
         JLabel l2 = new JLabel("ID: ");
         l2.setFont(new Font("Tahoma", Font.BOLD, 14));
         l2.setBounds(30,90,150,25);
         add(l2);
         
         t2 = new JTextField();
         t2.setBounds(150,90,250,25);
         t2.setFont(new Font("Calibiri", Font.PLAIN, 14));
         add(t2);
         
         JLabel l3 = new JLabel("ID Number: ");
         l3.setFont(new Font("Tahoma", Font.BOLD, 14));
         l3.setBounds(30,130,150,25);
         add(l3);
         
         t3 = new JTextField();
         t3.setBounds(150,130,250,25);
         t3.setFont(new Font("Calibiri", Font.PLAIN, 14));
         add(t3);
         
         JLabel l4 = new JLabel("Name: ");
         l4.setFont(new Font("Tahoma", Font.BOLD, 14));
         l4.setBounds(30,170,150,25);
         add(l4);
         
         t4 = new JTextField();
         t4.setBounds(150,170,250,25);
         t4.setFont(new Font("Calibiri", Font.PLAIN, 14));
         add(t4);
         
         JLabel l5 = new JLabel("Gender: ");
         l5.setFont(new Font("Tahoma", Font.BOLD, 14));
         l5.setBounds(30,210,150,25);
         add(l5);
         
         t5 = new JTextField();
         t5.setBounds(150,210,250,25);
         t5.setFont(new Font("Calibiri", Font.PLAIN, 14));
         add(t5);
     
         
         JLabel l6 = new JLabel("Country: ");
         l6.setFont(new Font("Tahoma", Font.BOLD, 14));
         l6.setBounds(30,250,150,25);
         add(l6);
         
         t6 = new JTextField();
         t6.setBounds(150,250,250,25);
         t6.setFont(new Font("Calibiri", Font.PLAIN, 14));
         add(t6);
       
         
         JLabel l7 = new JLabel("Address: ");
         l7.setFont(new Font("Tahoma", Font.BOLD, 14));
         l7.setBounds(30,290,150,25);
         add(l7);
         
         t7 = new JTextField();
         t7.setBounds(150,290,250,25);
         t7.setFont(new Font("Calibiri", Font.PLAIN, 14));
         add(t7);
        
         
         JLabel l8 = new JLabel("Mob. No: ");
         l8.setFont(new Font("Tahoma", Font.BOLD, 14));
         l8.setBounds(30,330,150,25);
         add(l8);
          
         try{
            MaskFormatter fmt = new MaskFormatter("##### #####");
            t8 = new JFormattedTextField(fmt);
            t8.setBounds(150,330,250,25);
            t8.setFont(new Font("Calibiri", Font.PLAIN, 14));
            add(t8);
         }catch(Exception e){}
         
         JLabel l9 = new JLabel("Email: ");
         l9.setFont(new Font("Tahoma", Font.BOLD, 14));
         l9.setBounds(30,370,150,25);
         add(l9);
         
         t9 = new JTextField();
         t9.setBounds(150,370,250,25);
         t9.setFont(new Font("Calibiri", Font.PLAIN, 14));
         add(t9);
         
         b1 = new JButton("Add");
         b1.setBounds(70,430, 100, 30);
         b1.setBackground(new Color(134,154,176));
         b1.setFont(new Font("Tahoma", Font.BOLD, 14));
         b1.setForeground(Color.WHITE);
         b1.setBorder(BorderFactory.createLineBorder(new Color(134,154,176), 1));
         b1.addActionListener(this);
         add(b1);
        
         b2 = new JButton("Back");
         b2.setBounds(220,430, 100, 30);
         b2.setBackground(new Color(134,154,176));
         b2.setFont(new Font("Tahoma", Font.BOLD, 14));
         b2.setBorder(BorderFactory.createLineBorder(new Color(134,154,176), 1));
         b2.setForeground(Color.WHITE);
         b2.addActionListener(this);
         add(b2);
         
         ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("./icons/update.png"));
         Image i1 = img.getImage().getScaledInstance(300, 300, Image.SCALE_REPLICATE);
         ImageIcon img2 = new ImageIcon(i1);
         JLabel l10 = new JLabel(img2);
         l10.setBounds(470, 100, 300, 300);
         add(l10); 
         
          try{
             Conn c = new Conn();
             ResultSet rs = c.s.executeQuery("select * from user where username='"+username+"'");
             while(rs.next()){
                 t1.setText(rs.getString("username"));
                 t2.setText(rs.getString("id"));
                 t3.setText(rs.getString("number"));
                 t4.setText(rs.getString("name"));
                 t5.setText(rs.getString("gender"));
                 t6.setText(rs.getString("country"));
                 t7.setText(rs.getString("address"));
                 t8.setText(rs.getString("phone"));
                 t9.setText(rs.getString("email"));
             }
         }catch(Exception e){}  
         
         
         
    }
    
    public static void main(String args[]){
        new UpdateInfo("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource() == b1){
            String username = t1.getText();
            String id = t2.getText();
            String num = t3.getText();
            String name = t4.getText();
            String gender = t5.getText();
            String country = t6.getText();
            String add = t7.getText();
            String ph = t8.getText();
            String email = t9.getText();

            String query = "update user set username='"+username+"', id='"+id+"', number='"+num
                    +"', name='"+name+"', gender='"+gender+"', country='"+country+"', address='"+add+"', phone='"+ph+"', email='"+email+"'";

            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Details Updated Successfully");
                this.setVisible(false);

            }catch(Exception e){
            System.out.print(e);
            }
        }
        else if(ae.getSource() == b2){
            this.setVisible(false);
        }     
        
    }
    
    
}
