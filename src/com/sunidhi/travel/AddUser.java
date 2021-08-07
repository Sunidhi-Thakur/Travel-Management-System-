
package com.sunidhi.travel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import utility.Country;

/**
 *
 * @author Sunidhi Thakur
 */

public class AddUser extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t5, t7;
    JFormattedTextField t6;
    private final JComboBox<Country> comboCountry;
    JComboBox cb;
    JRadioButton r1,r2,r3;
    JButton b1,b2;
    
    AddUser(String username){
        setBounds(600, 250, 850, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l11 = new JLabel("ADD YOUR DETAILS");
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
         
         cb = new JComboBox(new String[] {"Passport", "Aadhar Card", "PAN Card", "Driving Licence"});
         cb.setBounds(150, 90, 150, 25);
         add(cb);
         
         
         JLabel l3 = new JLabel("ID Number: ");
         l3.setFont(new Font("Tahoma", Font.BOLD, 14));
         l3.setBounds(30,130,150,25);
         add(l3);
         
         t2 = new JTextField();
         t2.setBounds(150,130,250,25);
         t2.setFont(new Font("Calibiri", Font.PLAIN, 14));
         add(t2);
         
         JLabel l4 = new JLabel("Name: ");
         l4.setFont(new Font("Tahoma", Font.BOLD, 14));
         l4.setBounds(30,170,150,25);
         add(l4);
         
         t3 = new JTextField();
         t3.setBounds(150,170,250,25);
         t3.setFont(new Font("Calibiri", Font.PLAIN, 14));
         add(t3);
         
         JLabel l5 = new JLabel("Gender: ");
         l5.setFont(new Font("Tahoma", Font.BOLD, 14));
         l5.setBounds(30,210,150,25);
         add(l5);
         
         r1 = new JRadioButton("Male");
         r1.setBackground(Color.white);
         r1.setBounds(150, 210, 70, 25);
         add(r1);
         
         r2 = new JRadioButton("Female");
         r2.setBackground(Color.white);
         r2.setBounds(230, 210, 70, 25);
         add(r2);
         
         r3 = new JRadioButton("Other");
         r3.setBackground(Color.white);
         r3.setBounds(310, 210, 70, 25);
         add(r3);
         
         JLabel l6 = new JLabel("Country: ");
         l6.setFont(new Font("Tahoma", Font.BOLD, 14));
         l6.setBounds(30,250,150,25);
         add(l6);
         
         Country[] listCountry = createCountryList();
         comboCountry = new JComboBox<>(listCountry);
         comboCountry.setBounds(150,250,250,25);
         add(comboCountry);
         
         JLabel l7 = new JLabel("Address: ");
         l7.setFont(new Font("Tahoma", Font.BOLD, 14));
         l7.setBounds(30,290,150,25);
         add(l7);
         
         t5 = new JTextField();
         t5.setBounds(150,290,250,25);
         t5.setFont(new Font("Calibiri", Font.PLAIN, 14));
         add(t5);
         
         JLabel l8 = new JLabel("Mob. No: ");
         l8.setFont(new Font("Tahoma", Font.BOLD, 14));
         l8.setBounds(30,330,150,25);
         add(l8);
          
         try{
            MaskFormatter fmt = new MaskFormatter("##### #####");
            t6 = new JFormattedTextField(fmt);
            t6.setBounds(150,330,250,25);
            t6.setFont(new Font("Calibiri", Font.PLAIN, 14));
            add(t6);
         }catch(Exception e){}
         
         JLabel l9 = new JLabel("Email: ");
         l9.setFont(new Font("Tahoma", Font.BOLD, 14));
         l9.setBounds(30,370,150,25);
         add(l9);
         
         t7 = new JTextField();
         t7.setBounds(150,370,250,25);
         t7.setFont(new Font("Calibiri", Font.PLAIN, 14));
         add(t7);
         
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
         
         ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("./icons/personal-details.png"));
         Image i1 = img.getImage().getScaledInstance(300, 300, Image.SCALE_REPLICATE);
         ImageIcon img2 = new ImageIcon(i1);
         JLabel l10 = new JLabel(img2);
         l10.setBounds(470, 100, 300, 300);
         add(l10); 
         
         try{
             Conn c = new Conn();
             ResultSet rs = c.s.executeQuery("select * from account where username='"+username+"'");
             while(rs.next()){
                 t1.setText(rs.getString("username"));
                 t3.setText(rs.getString("name"));
             }
         }catch(Exception e){}         
    }
    
    public static void main(String args[]){
        new AddUser("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
            String username = t1.getText();
            String id = cb.getSelectedItem().toString();
            String num = t2.getText();
            String name = t3.getText();
            String gender = null;
            if(r1.isSelected())
                gender = "Male";
            else if(r2.isSelected())
                gender = "Female";
            else
                gender = "Other";
            String country = comboCountry.getSelectedItem().toString();
            String add = t5.getText();
            String ph = t6.getValue().toString();
            String email = t7.getText();

            String query = "insert into user values('"+username+"', '"+id+"', '"+num
                    +"', '"+name+"', '"+gender+"', '"+country+"', '"+add+"', '"+ph+"', '"+email+"')";

            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Details Added Successfully");
                this.setVisible(false);

            }catch(Exception e){
            System.out.print(e);
            }
        }
        else if(ae.getSource() == b2){
            this.setVisible(false);
        }     
    }

    private Country[] createCountryList() {
        String[] countryCodes = Locale.getISOCountries();
        Country[] listCountry = new Country[countryCodes.length];
 
        for (int i = 0; i < countryCodes.length; i++) {
            Locale locale = new Locale("", countryCodes[i]);
            String code = locale.getCountry();
            String name = locale.getDisplayCountry();
 
            listCountry[i] = new Country(code, name);
        }
 
        Arrays.sort(listCountry);
 
        return listCountry;
    }
    
}