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
public class BookHotel extends JFrame implements ActionListener {

    JTextField t1;
    Choice ch, ch2, ch3;
    JLabel l11, l12, l13, l14, l15, l16, l17;
    JButton b1, b2, b3;

    BookHotel(String username) {
        setBounds(600, 220, 900, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l0 = new JLabel("BOOK HOTEL");
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
        l11.setForeground(new Color(47, 102, 152));
        add(l11);

        JLabel l2 = new JLabel("Select Hotel: ");
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(50, 100, 140, 25);
        add(l2);

        JLabel l3 = new JLabel("Days of Stay: "); 
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(50, 140, 140, 25);
        add(l3);

        l12 = new JLabel();
        l12.setFont(new Font("Tahoma", Font.BOLD, 14));
        l12.setBounds(190, 140, 250, 25);
        l12.setForeground(new Color(47, 102, 152));
        add(l12);

        JLabel l4 = new JLabel("No. of Rooms: ");
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(50, 180, 140, 25);
        add(l4);

        l13 = new JLabel();
        l13.setFont(new Font("Tahoma", Font.BOLD, 14));
        l13.setBounds(190, 180, 250, 25);
        l13.setForeground(new Color(47, 102, 152));
        add(l13);

        JLabel l5 = new JLabel("Room-Type: ");
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(50, 220, 140, 25);
        add(l5);

        ch2 = new Choice();
        ch2.add("AC");
        ch2.add("Non-AC");
        ch2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ch2.setForeground(new Color(47, 102, 152));
        ch2.setBounds(190, 220, 250, 25);
        add(ch2);

        JLabel l6 = new JLabel("ID: ");
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setBounds(50, 260, 140, 25);
        add(l6);

        l14 = new JLabel();
        l14.setFont(new Font("Tahoma", Font.BOLD, 14));
        l14.setBounds(190, 260, 250, 25);
        l14.setForeground(new Color(47, 102, 152));
        add(l14);

        JLabel l7 = new JLabel("ID-Number: ");
        l7.setFont(new Font("Tahoma", Font.BOLD, 14));
        l7.setBounds(50, 300, 140, 25);
        add(l7);

        l15 = new JLabel();
        l15.setFont(new Font("Tahoma", Font.BOLD, 14));
        l15.setBounds(190, 300, 250, 25);
        l15.setForeground(new Color(47, 102, 152));
        add(l15);

        JLabel l8 = new JLabel("Phone: ");
        l8.setFont(new Font("Tahoma", Font.BOLD, 14));
        l8.setBounds(50, 340, 140, 25);
        add(l8);

        l16 = new JLabel();
        l16.setFont(new Font("Tahoma", Font.BOLD, 14));
        l16.setBounds(190, 340, 250, 25);
        l16.setForeground(new Color(47, 102, 152));
        add(l16);

        JLabel l9 = new JLabel("Total Price: ");
        l9.setFont(new Font("Tahoma", Font.BOLD, 14));
        l9.setBounds(50, 380, 140, 25);
        add(l9);

        l17 = new JLabel();
        l17.setFont(new Font("Tahoma", Font.BOLD, 14));
        l17.setBounds(190, 380, 400, 25);
        l17.setForeground(Color.RED);
        add(l17);

        JLabel l18 = new JLabel("*Non-AC Room charges, for one room is included in the package. Additional amount will be charged for AC Rooms and more the one Non-AC");
        l18.setFont(new Font("Tahoma", Font.BOLD, 10));
        l18.setBounds(50, 540, 1000, 25);
        l18.setForeground(Color.RED);
        add(l18);

        b1 = new JButton("Check Price");
        b1.setBackground(new Color(47, 102, 146));
        b1.setForeground(Color.WHITE);
        b1.setBounds(50, 470, 150, 24);
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Book Hotel");
        b2.setBackground(new Color(47, 102, 146));
        b2.setForeground(Color.WHITE);
        b2.setBounds(220, 470, 150, 24);
        b2.setFont(new Font("Tahoma", Font.BOLD, 14));
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Back");
        b3.setBackground(new Color(47, 102, 146));
        b3.setForeground(Color.WHITE);
        b3.setBounds(390, 470, 150, 24);
        b3.setFont(new Font("Tahoma", Font.BOLD, 14));
        b3.addActionListener(this);
        add(b3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("./icons/book-hotel.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(440, 10, 500, 500);
        add(l10);

        String loc = "";
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bookPackage where username='" + username + "'");
            while (rs.next()) {
                l11.setText(rs.getString("username"));
                l14.setText(rs.getString("id"));
                l15.setText(rs.getString("no"));
                l16.setText(rs.getString("phone"));
                int people = Integer.parseInt(rs.getString("person"));
                if (people == 1) {
                    l13.setText("1");
                } else {
                    l13.setText(Integer.toString(people / 2));
                }
                String pack = rs.getString("package");
                switch (pack) {
                    case "Mesmerizing Uttarakhand: Uttarakhand":
                        l12.setText("3");
                        loc = "Uttarakhand";
                        break;
                    case "God's Own Country: Kerala":
                        l12.setText("5");
                        loc = "Kerala";
                        break;
                    case "Rome of the East: Goa":
                        l12.setText("2");
                        loc = "Goa";
                        break;
                }

            }
        } catch (Exception e) {
             System.out.println(e);
        }

        ch = new Choice();
        try {
            Conn conn = new Conn();
            ResultSet rset = conn.s.executeQuery("select * from hotel where location='" + loc + "'");
            while (rset.next()) {
                ch.add(rset.getString("name"));
            }
        } catch (Exception e) {
             System.out.println(e);
        }
        ch.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ch.setForeground(new Color(47, 102, 152));
        ch.setBounds(190, 100, 250, 25);
        add(ch);

    }

    public static void main(String args[]) {
        new BookHotel("Sunidhi").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try{
                int cost = 0, na=0, ac=0;
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from hotel where name='"+ch.getSelectedItem()+"'");
                String rType = ch2.getSelectedItem();
                int room = Integer.parseInt(l13.getText());
                if(room <= 0){
                    JOptionPane.showMessageDialog(null, "Invalid room number");
                    this.setVisible(false);
                }
                int days = Integer.parseInt(l12.getText())-1;
               
                while(rs.next()){
                    na = rs.getInt("NA");
                    ac = rs.getInt("AC");
                }
                if(room > 1 && rType.equals("Non-AC")){
                    cost = (room-1)*days*na;
                    l17.setText("Rs. "+cost);
                }else if(room > 1 && rType.equals("AC")){
                    cost = (room-1)*days*ac;
                    l17.setText("Rs. "+cost);
                }else if(rType.equals("Non-AC") && room == 1)
                    l17.setText("Rs. 0 (Charges included in the package)");
                else if(rType.equals("AC") && room == 1){
                    cost = room*days*(ac-na);
                    l17.setText("Rs. "+cost);
                }
                
            }catch(Exception e){
                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {
            String hotel = ch.getSelectedItem();
            try {
                Conn c = new Conn();
                String sql = "insert into bookhotel values ('" + l11.getText()
                        + "', '" + hotel + "', '"
                        + Integer.parseInt(l12.getText()) + "', '" + l13.getText() + "', '"
                        + ch2.getSelectedItem() + "', '" + l14.getText() + "','"
                        + l15.getText() + "', '" + l16.getText()+ "', '" + l17.getText().substring(4)+"')";
                c.s.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Hurray! Hotel Booked");
                this.setVisible(false);
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            this.setVisible(false);
        }
    }

}
