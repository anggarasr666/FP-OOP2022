/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author anggarasaputra
 */
public class TodoListGUI {
    Connection connection;
    Statement qStatement;
    String url = "jdbc:mysql://localhost/TodoList";
    String user = "root";
    String pass = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection getCon(){
        return connection;
    }
    public void setCon(){
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
        }catch(Exception finax){
            finax.printStackTrace();
        }
    }
}