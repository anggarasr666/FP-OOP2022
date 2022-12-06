/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Service.TodoListService;
import Util.InputUtil;


/**
 *
 * @author anggarasaputra
 */
public class TodoListView {
    
    public TodoListService todoListService;
    
    public TodoListView(TodoListService todoListService){
        this.todoListService = todoListService;
    }
    
    public void showTodoList(){
         while(true){
        todoListService.showTodoList();
        
        System.out.println("MENU : ");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("x. keluar");
        
        var input = InputUtil.inputUser("Pilih");
        
        if(input.equals("1")) {
            addTodoList();
        } else if(input.equals("2")){
            removeTodoList();
        } else if(input.equals("x")){
            break;
        }else {
            System.out.println("Pilihan tidak dimengerti");
        }
        }
    }
    
    public void addTodoList(){
        System.out.println("MENAMBAH TODOLIST");
        
        var todo = InputUtil.inputUser("Todo (x jika batal)");
        
        if(todo.equals("x")){
            //batal
        }else{
            todoListService.addTodoList(todo);
            System.out.println("Input Berhasil");
        }
    }
    
    public void removeTodoList(){
         System.out.println("MENGHAPUS TODOLIST");
        
        var todo = InputUtil.inputUser("Nomor yang dihapus(x jika batal)");
        if(todo.equals("x")){
            //batal
        }else{
            todoListService.removeTodoList(Integer.valueOf(todo));
        }
    }
}
