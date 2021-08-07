/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunidhi.travel;
import java.sql.*;
/**
 *
 * @author Sunidhi Thakur
 */
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms", "root", "dolly");
            s = c.createStatement(); 
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
