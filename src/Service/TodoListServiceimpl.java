/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

//import static aplikasitodolist.AplikasiTodoList.model;

import Entity.Todolist;
import GUI.TodoListGUI;
import GUI.TodoListUI;
import Repository.TodoListRepository;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author anggarasaputra
 */
public class TodoListServiceimpl implements TodoListService{
    private TodoListGUI connectionn = new TodoListGUI();
    private Statement state;
    private Connection rConnect;

    public TodoListServiceimpl() throws SQLException {
        connectionn.setCon();
        rConnect = connectionn.getCon();
        state = rConnect.createStatement();
    }
    
    
    @Override
    public void showTodoList(JTable jTable1){
        //ArrayList<String> comList = new ArrayList<String>();
        try {
            String[] comString = {
                "Nomor", "Kegiatan"
            }; var count = 0;
            DefaultTableModel tModel = new DefaultTableModel(null, comString);
            ResultSet rs = state.executeQuery("SELECT * FROM `ListTodo`");
            while(rs.next()){
                count += 1;
                String[] dataString = {
                    Integer.toString(count), 
                    rs.getString("Kegiatan")
            };
            tModel.addRow(dataString);
        }
         jTable1.setModel(tModel);
        } catch (Exception e) {
            
        }
    }
    
    @Override
    public void addTodoList(String Addlist){
        try {
            state.execute("INSERT INTO `ListTodo`(`Kegiatan`) VALUES(' " + Addlist + "' )");
        } catch (SQLException ex) {
            Logger.getLogger(TodoListUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void removeTodoList(String TeksRemoved){
       ResultSet rs;
        try {
            rs = state.executeQuery("SELECT * FROM `ListTodo`");
            int hapus = Integer.parseInt(TeksRemoved);
            int count = 1;
            int data = -1;
            while(rs.next()){
                if(count == hapus){
                    data = rs.getInt("id");
                    break;
                } count += 1;
            }
            state.execute("DELETE FROM `ListTodo` WHERE id = " + data); 
        } catch (SQLException ex) {
            Logger.getLogger(TodoListUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
