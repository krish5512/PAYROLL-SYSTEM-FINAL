/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.system.db;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Database {
    public static Connection c;
    public static Statement st;
    public static PreparedStatement checkuser,updatep,viewp,gpayslip,viewpay,adduser,deluser,checke,rating,adminc;
    static {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","payroll","payroll");
            st=c.createStatement();
            checkuser=c.prepareStatement("select * from login where userid=? and password=?");
            updatep=c.prepareStatement("update login set password=? where userid=?");
            viewp=c.prepareStatement("select * from personal where userid=?");
            gpayslip=c.prepareStatement("insert into salary values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            viewpay=c.prepareStatement("select * from salary where userid=? ");
            adduser=c.prepareStatement("insert into personal values(?,?,?,?,?,?,?,?,?,?)");
            deluser=c.prepareStatement("delete from personal where userid=?");
            checke=c.prepareStatement("select userid from login where userid=?");
            adminc=c.prepareStatement("select password from login where userid='admin' and password=?");
            rating=c.prepareStatement("update salary set rating=? where userid=?");
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
