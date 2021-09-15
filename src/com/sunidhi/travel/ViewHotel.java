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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sunidhi Thakur
 */
public class ViewHotel extends JFrame implements ActionListener {

    JButton b1;

    ViewHotel(String username) {
        
        setBounds(550, 290, 1050, 490);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel f1 = new JPanel();
        f1.setLayout(null);
        f1.setBounds(0, 0, 500, 490);
        add(f1);
        
        JPanel f2 = new JPanel();
        f2.setLayout(null);
        f2.setBounds(500, 0, 550,490);
        f2.setBackground(Color.WHITE);
        add(f2);

        JLabel l11 = new JLabel("HOTEL DETAILS");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l11.setBounds(150, 5, 500, 25);
        l11.setForeground(new Color(47, 102, 152));
        f2.add(l11);

        JLabel l1 = new JLabel("Username: ");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l1.setBounds(30, 60, 150, 25);
        f2.add(l1);

        JLabel t1 = new JLabel();
        t1.setBounds(115, 60, 250, 25);
        t1.setForeground(new Color(47, 102, 152));
        t1.setFont(new Font("Calibiri", Font.BOLD, 14));
        f2.add(t1);

        JLabel l2 = new JLabel("Hotel: ");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l2.setBounds(30, 100, 150, 25);
        f2.add(l2);

        JLabel t2 = new JLabel();
        t2.setBounds(85, 100, 350, 25);
        t2.setForeground(new Color(47, 102, 152));
        t2.setFont(new Font("Calibiri", Font.BOLD, 14));
        f2.add(t2);

        JLabel l3 = new JLabel("Day(s) of Stay: ");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l3.setBounds(30, 140, 150, 25);
        f2.add(l3);

        JLabel t3 = new JLabel();
        t3.setBounds(130, 140, 250, 25);
        t3.setForeground(new Color(47, 102, 152));
        t3.setFont(new Font("Calibiri", Font.BOLD, 14));
        f2.add(t3);

        JLabel l4 = new JLabel("Number of Rooms: ");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l4.setBounds(30, 180, 150, 25);
        f2.add(l4);

        JLabel t4 = new JLabel();
        t4.setBounds(85, 220, 250, 25);
        t4.setForeground(new Color(47, 102, 152));
        t4.setFont(new Font("Calibiri", Font.BOLD, 14));
        f2.add(t4);
        
        JLabel l14 = new JLabel("Type: ");
        l14.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l14.setBounds(30, 220, 150, 25);
        f2.add(l14);

        JLabel t14 = new JLabel();
        t14.setBounds(165, 180, 250, 25);
        t14.setForeground(new Color(47, 102, 152));
        t14.setFont(new Font("Calibiri", Font.BOLD, 14));
        f2.add(t14);

        JLabel l5 = new JLabel("Phone: ");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l5.setBounds(280, 60, 150, 25);
        f2.add(l5);

        JLabel t5 = new JLabel();
        t5.setBounds(360, 57, 250, 30);
        t5.setForeground(new Color(47, 102, 152));
        t5.setFont(new Font("Calibiri", Font.BOLD, 14));
        f2.add(t5);

        JLabel l6 = new JLabel("ID: ");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l6.setBounds(280, 140, 150, 25);
        f2.add(l6);

        JLabel t6 = new JLabel();
        t6.setBounds(365, 140, 250, 25);
        t6.setForeground(new Color(47, 102, 152));
        t6.setFont(new Font("Calibiri", Font.BOLD, 14));
        f2.add(t6);

        JLabel l7 = new JLabel("ID number: ");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l7.setBounds(280, 180, 150, 25);
        f2.add(l7);

        JLabel t7 = new JLabel();
        t7.setBounds(365, 180, 250, 25);
        t7.setFont(new Font("Calibiri", Font.BOLD, 14));
        t7.setForeground(new Color(47, 102, 152));
        f2.add(t7);
        
        JLabel l8 = new JLabel("Price: ");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l8.setBounds(280, 220, 150, 25);
        f2.add(l8);

        JLabel t8 = new JLabel();
        t8.setBounds(325, 220, 250, 25);
        t8.setFont(new Font("Calibiri", Font.BOLD, 20));
        t8.setForeground(Color.RED);
        f2.add(t8);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("./icons/view-hotel.jpg"));
        Image i1 = img.getImage().getScaledInstance(500,460, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(i1);
        JLabel l10 = new JLabel(img2);
        l10.setBounds(0, 0, 500, 460);
        f1.add(l10);

        b1 = new JButton("Back");
        b1.setBounds(200, 355, 100, 30);
        b1.setBackground(new Color(134, 154, 176));
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createLineBorder(new Color(134, 154, 176), 1));
        b1.addActionListener(this);
        f2.add(b1);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bookHotel where username='" + username + "'");
            while (rs.next()) {
                t1.setText(rs.getString("username"));
                t2.setText(rs.getString("hotel"));
                t3.setText(rs.getString("days"));
                t4.setText(rs.getString("type"));
                t14.setText(rs.getString("rooms"));
                t5.setText(rs.getString("phone"));
                t6.setText(rs.getString("id"));
                t8.setText("Rs. "+rs.getString("price"));
                t7.setText(rs.getString("id_no"));

            }
        } catch (Exception e) {
        }

    }

    public static void main(String args[]) {
        new ViewHotel("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
        }

    }

}
