/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test.Service;

import Entity.Todolist;
import Repository.TodoListRepository;
import Repository.TodoListRepositoryImpl;
import Service.TodoListService;
import Service.TodoListServiceimpl;
/**
 *
 * @author anggarasaputra
 */
public class TodoListServiceTest {
    public static void main(String[] args){
        testRemoveTodoList();
    }
    
    //plmp
    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new Todolist("Test 1 ");
        todoListRepository.data[1] = new Todolist("Test 2 ");
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);
        
        todoListService.showTodoList();
    }
    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);
        
        todoListService.addTodoList("List 1 ");
        todoListService.addTodoList("List 2 ");
        
        todoListService.showTodoList();
    }
    
    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);
        
        todoListService.addTodoList("List 1 ");
        todoListService.addTodoList("List 2 ");
        
        todoListService.showTodoList();
        
        todoListService.removeTodoList(5);
        todoListService.removeTodoList(1);
        todoListService.removeTodoList(1);
        
        todoListService.showTodoList();
    }
}
