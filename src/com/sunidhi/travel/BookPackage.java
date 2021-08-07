package com.sunidhi.travel;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sunidhi Thakur
 */
public class BookPackage extends JFrame implements ActionListener {

    JTextField t1;
    Choice ch;
    JLabel l11, l12, l13, l14, l15;
    JButton b1, b2, b3;

    BookPackage(String username) {
        setBounds(600, 220, 800, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l0 = new JLabel("BOOK PACKAGE");
        l0.setBounds(250, 10, 300, 40);
        l0.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l0.setForeground(new Color(47, 102, 147));
        add(l0);

        JLabel l1 = new JLabel("Username: ");
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(50, 60, 140, 25);
        add(l1);

        l11 = new JLabel();
        l11.setFont(new Font("Tahoma", Font.BOLD, 14));
        l11.setBounds(190, 60, 250, 25);
        l11.setForeground(new Color(47,102,152));
        add(l11);

        JLabel l2 = new JLabel("Select Package: ");
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(50, 100, 140, 25);
        add(l2);

        ch = new Choice();
        ch.add("Mesmerizing Uttarakhand: Uttarakhand");
        ch.add("God's Own Country: Kerala");
        ch.add("Rome of the East: Goa");
        ch.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ch.setForeground(new Color(47,102,152));
        ch.setBounds(190, 100, 250, 25);
        add(ch);

        JLabel l3 = new JLabel("No. of People: ");
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(50, 140, 140, 25);
        add(l3);

        t1 = new JTextField("1");
        t1.setBorder(BorderFactory.createEtchedBorder());
        t1.setBounds(190, 140, 250, 25);
        t1.setFont(new Font("Tahoma", Font.BOLD, 14));
        t1.setForeground(new Color(47,102,152));
        add(t1);
        
        JLabel l4 = new JLabel("ID: ");
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(50, 180, 140, 25);
        add(l4);

        l12 = new JLabel();
        l12.setFont(new Font("Tahoma", Font.BOLD, 14));
        l12.setBounds(190, 180, 250, 25);
        l12.setForeground(new Color(47,102,152));
        add(l12);
        
        JLabel l5 = new JLabel("ID No.: ");
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(50, 220, 140, 25);
        add(l5);

        l13 = new JLabel();
        l13.setFont(new Font("Tahoma", Font.BOLD, 14));
        l13.setBounds(190, 220, 250, 25);
        l13.setForeground(new Color(47,102,152));
        add(l13);
        
        JLabel l6 = new JLabel("Phone: ");
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setBounds(50, 260, 140, 25);
        add(l6);

        l14 = new JLabel();
        l14.setFont(new Font("Tahoma", Font.BOLD, 14));
        l14.setForeground(new Color(47,102,152));
        l14.setBounds(190, 260, 250, 25);
        add(l14);
        
        JLabel l7 = new JLabel("Total Price: ");
        l7.setFont(new Font("Tahoma", Font.BOLD, 14));
        l7.setBounds(50, 300, 140, 25);
        add(l7);

        l15 = new JLabel();
        l15.setFont(new Font("Tahoma", Font.BOLD, 14));
        l15.setBounds(190, 300, 250, 25);
        l15.setForeground(Color.RED);
        add(l15);
        
        b1 = new JButton("Check Price");
        b1.setBackground(new Color(47,102,146));
        b1.setForeground(Color.WHITE);
        b1.setBounds(50,370,150,24);
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Book Package");
        b2.setBackground(new Color(47,102,146));
        b2.setForeground(Color.WHITE);
        b2.setBounds(220,370,150,24);
        b2.setFont(new Font("Tahoma", Font.BOLD, 14));
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("Back");
        b3.setBackground(new Color(47,102,146));
        b3.setForeground(Color.WHITE);
        b3.setBounds(390,370,150,24);
        b3.setFont(new Font("Tahoma", Font.BOLD, 14));
        b3.addActionListener(this);
        add(b3);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("./icons/book-pack.png"));
       Image i2 = i1.getImage().getScaledInstance(300,520, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l8 = new JLabel(i3);
       l8.setBounds(480,50,250,300);
       add(l8);
       
       try{
             Conn c = new Conn();
             ResultSet rs = c.s.executeQuery("select * from user where username='"+username+"'");
             while(rs.next()){
                 l11.setText(rs.getString("username"));
                 l12.setText(rs.getString("id"));
                 l13.setText(rs.getString("number"));
                 l14.setText(rs.getString("phone"));
             }
         }catch(Exception e){}  
         

    }

    public static void main(String args[]) {
        new BookPackage("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
            int p = Integer.parseInt(t1.getText());
            String choice = ch.getSelectedItem();
            int cost = 0;
            switch(choice){
                case "Mesmerizing Uttarakhand: Uttarakhand":
                    cost = 6499;
                    break;
                case "God's Own Country: Kerala":
                    if(p % 4 == 0)
                        cost = 13200/4;
                    else
                        cost = 16499/4;
                    break;
                case "Rome of the East: Goa":
                    cost = 2999;
                    break;
            }
           
            l15.setText("₹ "+(cost*p));
            
        }else if(ae.getSource() == b2){
            try{
                Conn c = new Conn();
                String sql = "insert into bookPackage values ('"+l11.getText()
                        +"', '"+ch.getSelectedItem()+"', '"
                        +Integer.parseInt(t1.getText())+"', '"+l12.getText()+"', '"
                        +l13.getText()+"', '"+l14.getText()+"','"
                        +Integer.parseInt(l15.getText().substring(2))+"')";
                c.s.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Hurray! Package Booked");
                this.setVisible(false);
            }catch(Exception e){
                System.out.println(e);
            }
        }else{
            this.setVisible(false);
        }
    }

}
