/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author anggarasaputra
 */
public interface TodoListService {
    void showTodoList(JTable jTable1);
    
    void addTodoList(String TeksAdd);
    
    void removeTodoList(String TeksRemoved);
    
}