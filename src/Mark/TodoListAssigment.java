/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mark;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author anggarasaputra
 */
public abstract class TodoListAssigment {
    String status;
    
    public void setStatus(){
        status = "Belum Dikerjakan";
    }
    
    public abstract String getStatus();
}