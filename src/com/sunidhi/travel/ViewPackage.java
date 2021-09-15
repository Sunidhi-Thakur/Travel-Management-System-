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

/**
 *
 * @author Sunidhi Thakur
 */
public class ViewPackage extends JFrame implements ActionListener {

    JButton b1;

    ViewPackage(String username) {
        setBounds(750, 250, 550, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l11 = new JLabel("MY PACKAGE");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l11.setBounds(175, 5, 500, 25);
        l11.setForeground(new Color(134, 154, 176));
        add(l11);

        JLabel l1 = new JLabel("Username: ");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l1.setBounds(30, 260, 150, 25);
        add(l1);

        JLabel t1 = new JLabel();
        t1.setBounds(115, 260, 250, 25);
        t1.setForeground(new Color(47, 102, 152));
        t1.setFont(new Font("Calibiri", Font.BOLD, 14));
        add(t1);

        JLabel l2 = new JLabel("ID: ");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l2.setBounds(30, 300, 150, 25);
        add(l2);

        JLabel t2 = new JLabel();
        t2.setBounds(115, 300, 250, 25);
        t2.setForeground(new Color(47, 102, 152));
        t2.setFont(new Font("Calibiri", Font.BOLD, 14));
        add(t2);

        JLabel l3 = new JLabel("ID Number: ");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l3.setBounds(30, 340, 150, 25);
        add(l3);

        JLabel t3 = new JLabel();
        t3.setBounds(115, 340, 250, 25);
        t3.setForeground(new Color(47, 102, 152));
        t3.setFont(new Font("Calibiri", Font.BOLD, 14));
        add(t3);

        JLabel l4 = new JLabel("Phone: ");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l4.setBounds(30, 380, 150, 25);
        add(l4);

        JLabel t4 = new JLabel();
        t4.setBounds(115, 380, 250, 25);
        t4.setForeground(new Color(47, 102, 152));
        t4.setFont(new Font("Calibiri", Font.BOLD, 14));
        add(t4);

        JLabel l5 = new JLabel("Package: ");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l5.setBounds(260, 260, 150, 25);
        add(l5);

        JLabel t5 = new JLabel();
        t5.setBounds(340, 257, 250, 30);
        t5.setForeground(new Color(47, 102, 152));
        t5.setFont(new Font("Calibiri", Font.BOLD, 14));
        add(t5);

        JLabel l6 = new JLabel("People: ");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l6.setBounds(260, 340, 150, 25);
        add(l6);

        JLabel t6 = new JLabel();
        t6.setBounds(345, 340, 250, 25);
        t6.setForeground(new Color(47, 102, 152));
        t6.setFont(new Font("Calibiri", Font.BOLD, 14));
        add(t6);

        JLabel l7 = new JLabel("Price: ");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l7.setBounds(260, 380, 150, 25);
        add(l7);

        JLabel t7 = new JLabel();
        t7.setBounds(325, 380, 250, 25);
        t7.setFont(new Font("Calibiri", Font.BOLD, 16));
        t7.setForeground(Color.RED);
        add(t7);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("./icons/view-pack.jpg"));
        Image i1 = img.getImage().getScaledInstance(300, 200, Image.SCALE_REPLICATE);
        ImageIcon img2 = new ImageIcon(i1);
        JLabel l10 = new JLabel(img2);
        l10.setBounds(100, 40, 300, 200);
        add(l10);

        b1 = new JButton("Back");
        b1.setBounds(200, 455, 100, 30);
        b1.setBackground(new Color(134, 154, 176));
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createLineBorder(new Color(134, 154, 176), 1));
        b1.addActionListener(this);
        add(b1);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bookPackage where username='" + username + "'");
            while (rs.next()) {
                t1.setText(rs.getString("username"));
                t2.setText(rs.getString("id"));
                t3.setText(rs.getString("no"));
                t4.setText(rs.getString("phone"));
                t5.setText("<html><body>" + rs.getString("package") + "</body></html>");
                t6.setText(rs.getString("person"));
                t7.setText("Rs. "+rs.getString("price"));

            }
        } catch (Exception e) {
        }

    }

    public static void main(String args[]) {
        new ViewPackage("sunidhi").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
        }

    }

}
