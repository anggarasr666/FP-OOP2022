/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mark;

import GUI.TodoListGUI;
import GUI.TodoListUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import java.sql.*;

/**
 *
 * @author anggarasaputra
 */
public class TodoListAssigmentExtd extends TodoListAssigment{
   
    public void setStatus(String valset){
        this.status = valset;
    }

    @Override
    public String getStatus() {
        return this.status;
    }
     
    public void setUpdated(String setd) {
        ResultSet rs;
        try {
            TodoListGUI setGUI = new TodoListGUI();
            setGUI.setCon();
            Connection con = setGUI.getCon();
            Statement state = con.createStatement();
            rs = state.executeQuery("SELECT * FROM `ListTodo`");
            int hapus = Integer.parseInt(setd);
            int count = 1;
            int data = -1;
            while(rs.next()){
                if(count == hapus){
                    data = rs.getInt("id");
                    break;
                } count += 1;
            }
            state.execute("UPDATE `ListTodo` SET `Pengerjaan` = '"+ getStatus() + "' WHERE id = " + data); 
        } catch (SQLException ex) {
            Logger.getLogger(TodoListUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}