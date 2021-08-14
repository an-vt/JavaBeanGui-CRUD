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
public class insert implements Serializable{
    int id;
    String name;
    String email;
    public void insert(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String insert_record(String sql) throws ClassNotFoundException,SQLException{
        db cdb=new db();
        String str="";
        try {
            Connection con=cdb.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, String.valueOf(id));
            ps.setString(2, name);
            ps.setString(3, email);
            ps.executeUpdate();
            str="them thanh cong!";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}
