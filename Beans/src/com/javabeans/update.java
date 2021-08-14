/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabeans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author vuan
 */
public class update implements Serializable{
    String name;
    String email;
    public void update(){}

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
    public String update_record(String sql){
        String str="";
        try {
            db d=new db();
            Connection con=d.getConnection();
            PreparedStatement st=con.prepareStatement(sql);
            st.executeUpdate();
            str="da cap nhat thanh cong";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}
