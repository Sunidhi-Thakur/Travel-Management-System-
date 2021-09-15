package com.sunidhi.travel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sunidhi Thakur
 */
public class CheckHotel extends JFrame implements Runnable {

    Thread t1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JLabel[] label = new JLabel[]{l1, l2, l3, l4, l5, l6, l7, l8, l9, l10};
    JLabel name;

    CheckHotel() {
        setBounds(600, 180, 900, 600);
        getContentPane().setBackground(Color.WHITE);
        String base = "./icons/";
        String[] img = new String[]{base + "hotel-1.jpg", base + "hotel-2.jpg", base + "hotel-3.jpg", base + "hotel-4.jpg", base + "hotel-5.jpg",
            base + "hotel-6.jpeg", base + "hotel-7.jpg", base + "hotel-8.jpg", base + "hotel-9.jpg", base + "hotel-10.jpg"};
        ImageIcon i1;
        Image i2;
        name = new JLabel();
        name.setBounds(50,500,1000,80);
        name.setForeground(Color.white);
        name.setBackground(new Color(46, 102, 147));
        name.setFont(new Font("Tahoma", Font.BOLD, 24));
        
        for (int i = 0; i < 10; i++) {
            i1 = new ImageIcon(ClassLoader.getSystemResource(img[i]));
            i2 = i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
            i1 = new ImageIcon(i2);
            this.label[i] = new JLabel(i1);
            this.label[i].setBounds(0, 0, 900, 600);
            add(this.label[i]);
        }

        t1 = new Thread(this);
        t1.start();

    }

    public static void main(String args[]) {
        new CheckHotel().setVisible(true);
    }

    @Override
    public void run() {
        String[] text = new String[]{"Hotel Savoy, Uttarakhand","JW Marriott, Uttarakhand", "The Naini Retreat, Uttarakhand",
        "Lemon Tree Vembanad Lake Resort, Kerala", "Kovalam Beach Retreat, Kerala",
        "Hotel Padmini Nivas, Uttarakhand", "Kumarakom Lake Resort, Kerala", "Hotel Park Regis, Goa",
        "Holiday Inn Resort, Goa", "Taj Exotica Resort & Spa, Goa"};
        try {
            for (int i = 0; i < 10; i++) {
                this.label[i].setVisible(true);
                name.setText(text[i]);
                this.label[i].add(name);
                Thread.sleep(2800);
                this.label[i].setVisible(false);
            }
        } catch (Exception e) {
        }
    }

}
