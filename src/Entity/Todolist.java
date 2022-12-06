/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author anggarasaputra
 */
public class Todolist {
    private String todo;
    
    public Todolist(){
        
    }
    
    public Todolist(String todo){
        this.todo = todo;
    }
    
    public String getTodo(){
        return todo;
    }
    
    public void setTodo(String todo){
        this.todo=todo;
    }
}
