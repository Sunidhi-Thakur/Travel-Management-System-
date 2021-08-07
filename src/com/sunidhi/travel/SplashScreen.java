package com.sunidhi.travel;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author Sunidhi Thakur
 */

public class SplashScreen {
    public static void main(String[] args){
        SplashFrame frame = new SplashFrame();
        frame.setVisible(true);
        int x = 1;
        for(int i=1; i<700; i+=6, x+=7){
           frame.setLocation(950 - (x+i)/2, 500-(i/2));
            frame.setSize(x+i,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
       
        frame.setVisible(true);
    }
}

class SplashFrame extends JFrame implements Runnable{
    Thread t1;
        public SplashFrame() {
            ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("./icons/splash.jpg"));
            Image img2 = img1.getImage().getScaledInstance(1600, 700, Image.SCALE_DEFAULT);
            ImageIcon img3 = new ImageIcon(img2);
            JLabel l1 = new JLabel(img3);
            add(l1);
            setUndecorated(true);
            t1 = new Thread(this);
            t1.start();
        }

    @Override
    public void run() {
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            
            new Login().setVisible(true);
        }catch(Exception e){}
    }
}
