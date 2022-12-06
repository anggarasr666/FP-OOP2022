/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

//import static aplikasitodolist.AplikasiTodoList.model;

import Entity.Todolist;
import Repository.TodoListRepository;


/**
 *
 * @author anggarasaputra
 */
public class TodoListServiceimpl implements TodoListService{
    private TodoListRepository todoListRepository; 
    
    public TodoListServiceimpl(TodoListRepository todoListRepository){
        this.todoListRepository = todoListRepository;
    }
    
    @Override
    public void showTodoList(){
        Todolist[] model = todoListRepository.getAll();
        System.out.println("TODOLIST");
        for(var i = 0; i < model.length; i++){
            var toDoList = model[i];
            var number = i+1;
            
            if(toDoList != null){
                System.out.println(number + ". " + toDoList.getTodo());
            }
        }
    }
    
    @Override
    public void addTodoList(String todo){
        Todolist todolist = new Todolist(todo);
        todoListRepository.add(todolist);
        System.out.println("List Baru : " + todo);
    }
    
    @Override
    public void removeTodoList(Integer number){
        boolean succes = todoListRepository.remove(number);
        if(succes){
            System.out.println("List Dihapus : " + number);
        } else {
            System.out.println("List Gagal Dihapus : " + number);
        }
    }
}
