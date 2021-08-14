/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabeans;

import java.io.Serializable;
import java.sql.*;

/**
 *
 * @author vuan
 */
public class db implements Serializable {
    public void ConnectDB(){}
    public Connection getConnection() throws ClassNotFoundException ,NullPointerException{
        Connection conn=null;
        //duong dan toi database
        String url="jdbc:sqlserver://DESKTOP-EFGCM6B\\SQLEXPRESS:1433;databaseName=TestDB;integratedSecurity=true";
        //ten tai khoan trong database
        String user="sa";
        //mat khau trong database
        String pass="123456789";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //tao ket noi
            conn= DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("ngoai le exception");
            e.printStackTrace();
        }
        return (Connection) conn; 
    }

}
