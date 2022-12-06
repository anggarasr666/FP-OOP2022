/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test.View;

import Repository.TodoListRepository;
import Repository.TodoListRepositoryImpl;
import Service.TodoListService;
import Service.TodoListServiceimpl;
import View.TodoListView;

/**
 *
 * @author anggarasaputra
 */
public class TodoListViewtest {
    public static void main(String[] args){
        testRemoveTodoList();
    }
    
    public static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        
        todoListService.addTodoList("Test 1 ");
        todoListService.addTodoList("Test 2 ");
        todoListService.addTodoList("Test 3 ");
        
        todoListView.showTodoList();
    }
    
        public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        
        todoListView.addTodoList();
        
        todoListService.showTodoList();
        
        todoListView.addTodoList();
        
        todoListService.showTodoList();
    }
        
        public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        
        todoListService.addTodoList("Test 1 ");
        todoListService.addTodoList("Test 2 ");
        todoListService.addTodoList("Test 3 ");
        
        todoListService.showTodoList();
        
        todoListView.removeTodoList();
        
        todoListService.showTodoList();
    }
}
