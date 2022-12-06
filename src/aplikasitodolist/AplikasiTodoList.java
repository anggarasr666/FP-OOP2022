/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasitodolist;

import GUI.TodoListUI;
import Repository.TodoListRepository;
import Repository.TodoListRepositoryImpl;
import Service.TodoListService;
import Service.TodoListServiceimpl;
import View.TodoListView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author anggarasaputra
 */
public class AplikasiTodoList {
    public static void main(String[] args) {
        
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        
        todoListView.showTodoList();
    }
}
