package com.sunidhi.travel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sunidhi Thakur
 */
public class CheckPackage extends JFrame{
    
    CheckPackage(){
        setBounds(400, 180, 1400, 550);
        getContentPane().setBackground(Color.WHITE);
        String[] package1 = new String[]{"Mesmerizing Uttarakhand","Package includes: ", 
            "4 Nights", "₹ 6,499","Per Person on twin sharing", "<html><body><p>Uttarakhand, a state in northern India crossed by the Himalayas, "
               + "is known for its Hindu pilgrimage sites.<br> Rishikesh, a major centre for yoga study, "
               + "was made famous by the Beatles’ 1968 visit.<br>The city hosts the evening Ganga Aarti, "
               + "a spiritual gathering on the sacred Ganges River.<br> The state's forested Jim Corbett "
               + "National Park shelters Bengal tigers and other native wildlife.</p></body></html>","./icons/pack1.jpg"};
        String[] package2 = new String[]{"     God's Own Country","Package includes: ",
            "6 Nights", "₹ 16,499","  20% Off for a family of 4",
            "<html><body><p>Kerala, a state on India's tropical Malabar Coast, has nearly 600km of Arabian Sea shoreline.<br>"
                + " It's known for its palm-lined beaches and backwaters, a network of canals."
                + " Inland are the Western Ghats, mountains whose slopes support tea, coffee and spice plantations as well as wildlife."
                + "<br>National parks like Eravikulam and Periyar, plus Wayanad and other sanctuaries, are home to elephants, langur monkeys and tigers.</p></body><html>",
        "./icons/pack2.jpg"};
         String[] package3 = new String[]{"     Rome of the East","Package includes: ",
             "3 Nights", "₹ 2,999","               Per Person",
            "<html><body><p>Goa is a state in western India with coastlines stretching along the Arabian Sea.<br>"
                 + "Its long history as a Portuguese colony prior to 1961 is evident in its preserved 17th-century churches and the area’s tropical spice plantations.<br> "
                 + "Goa is also known for its beaches, ranging from popular stretches at Baga and Palolem to those in laid-back fishing villages such as Agonda.</p></body><html>",
         "./icons/pack3.jpg"};
        
        JPanel p1 = createPackage(package1);
        JPanel p2 = createPackage(package2);
        JPanel p3 = createPackage(package3);
       
        
        JTabbedPane pane = new JTabbedPane();
        pane.addTab("Package 1", null, p1);
        pane.addTab("Package 2", null, p2);
        pane.addTab("Package 3", null, p3);
        pane.setBackground(new Color(219, 243, 250));
        
        
        add(pane, BorderLayout.CENTER);
        
    }  
    
    public static void main(String args[]){
        new CheckPackage().setVisible(true);
    }

    private JPanel createPackage(String[] pack) {
       JPanel f1 = new JPanel();
       f1.setLayout(null);
       f1.setBounds(300, 150, 1400, 550);
       add(f1);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(pack[6]));
       Image i2 = i1.getImage().getScaledInstance(600,550, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l1 = new JLabel(i3);
       l1.setBounds(0,0,600,550);
        
       
       JPanel p1 = new JPanel();
       p1.setBackground(Color.WHITE);
       p1.setBounds(0, 0, 600, 550);
       p1.setLayout(null);
       p1.add(l1);
       f1.add(p1);
       
       
       JPanel p2 = new JPanel();
       p2.setBackground(new Color(47, 102, 147));
       p2.setBounds(600, 0, 600, 550);
       p2.setLayout(null);
       f1.add(p2);
       
       JLabel l2 = new JLabel(pack[0]);
       l2.setBounds(145,40, 500, 40);
       l2.setFont(new Font("Times New Roman", Font.BOLD, 30));
       l2.setForeground(Color.WHITE);
       p2.add(l2);
       
       JLabel fact = new JLabel(pack[1]);
       fact.setBounds(20,102, 200, 40);
       fact.setFont(new Font("Railway", Font.BOLD, 16));
       fact.setForeground(Color.WHITE);
       p2.add(fact);
       
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("./icons/meal.png"));
       Image i5 = i4.getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT);
       ImageIcon i6 = new ImageIcon(i5);
       JLabel l3 = new JLabel(i6);
       l3.setBounds(120,150,40,40);
       p2.add(l3);
       JLabel l32 = new JLabel("Meals");
       l32.setBounds(124,187,40,40);
       l32.setFont(new Font("Tahoma", Font.PLAIN, 12));
       l32.setForeground(Color.WHITE);
       p2.add(l32);
       
       ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("./icons/accomodation.png"));
       Image i8 = i7.getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT);
       ImageIcon i9 = new ImageIcon(i8);
       JLabel l4 = new JLabel(i9);
       l4.setBounds(220,150,40,40);
       p2.add(l4);
       JLabel l42 = new JLabel("Accomodation");
       l42.setBounds(202,187,80,40);
       l42.setFont(new Font("Tahoma", Font.PLAIN, 12));
       l42.setForeground(Color.WHITE);
       p2.add(l42);
       
       ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("./icons/sightseeing.png"));
       Image i11 = i10.getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT);
       ImageIcon i12 = new ImageIcon(i11);
       JLabel l5 = new JLabel(i12);
       l5.setBounds(320,150,40,40);
       p2.add(l5);
        JLabel l52 = new JLabel("Sightseeing");
       l52.setBounds(308,187,80,40);
       l52.setFont(new Font("Tahoma", Font.PLAIN, 12));
       l52.setForeground(Color.WHITE);
       p2.add(l52);
       
       ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("./icons/transportation.png"));
       Image i14 = i13.getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT);
       ImageIcon i15 = new ImageIcon(i14);
       JLabel l6 = new JLabel(i15);
       l6.setBounds(420,150,40,40);
       p2.add(l6);
       JLabel l62 = new JLabel("Transportation");
       l62.setBounds(402,187,80,40);
       l62.setFont(new Font("Tahoma", Font.PLAIN, 12));
       l62.setForeground(Color.WHITE);
       p2.add(l62);   
       
       JButton b = new JButton(pack[2]);
       b.setBounds(200, 240, 200, 30);
       b.setBackground(Color.WHITE);
       b.setForeground(new Color(47, 102, 147));
       b.setFont(new Font("Tahoma", Font.BOLD, 16));
       p2.add(b);
       
       JLabel l7 = new JLabel(pack[3]);
       l7.setBounds(256,330,200,40);
       l7.setFont(new Font("Tahoma", Font.BOLD, 24));
       l7.setForeground(Color.WHITE);
       p2.add(l7); 
       
       JLabel l8 = new JLabel(pack[4]);
       l8.setBounds(210,360,500,40);
       l8.setFont(new Font("Tahoma", Font.BOLD, 14));
       l8.setForeground(Color.WHITE);
       p2.add(l8);
       
       JPanel p3 = new JPanel();
       p3.setBackground(Color.WHITE);
       p3.setBounds(1200, 0, 200, 550);
       p3.setLayout(null);
       f1.add(p3);
       
       JLabel l9 = new JLabel();
       l9.setText(pack[5]);
       l9.setBounds(20,0,150, 450);
       l9.setFont(new Font("Tahoma", Font.BOLD, 14));
       l9.setForeground(new Color(48, 144, 48));
       
       p3.add(l9);
       
       return f1;
    }
    
}
