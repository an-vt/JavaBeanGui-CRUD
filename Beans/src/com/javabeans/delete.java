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
public class delete implements Serializable{
    int id;
    public void delete(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String delete_record(String sql) throws SQLException{
        String str="";
        try {
            db d=new db();
            Connection con=d.getConnection();
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            return str="da xoa thanh cong";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}
