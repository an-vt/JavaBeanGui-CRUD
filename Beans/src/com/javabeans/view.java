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
public class view implements Serializable{
    String sql;
    public void view(){}

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    
    public ResultSet view_record()throws SQLException{
        ResultSet rs=null;
        setSql(sql);
        try {
            db cdb=new db();
            Connection con=cdb.getConnection();
            Statement st=con.createStatement();
            rs=st.executeQuery(getSql());
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
