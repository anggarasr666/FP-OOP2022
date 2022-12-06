/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Entity.Todolist;
//import static aplikasitodolist.AplikasiTodoList.model;

/**
 *
 * @author anggarasaputra
 */
public class TodoListRepositoryImpl implements TodoListRepository{
    
    public Todolist[] data = new Todolist[10];
    
    @Override
    public Todolist[] getAll(){
        return data;
    }
    
    public boolean penuh(){
        //mengecek apakah data array telah penuh
        var penuh = true;
        for(var i = 0; i < data.length; i++){
            if(data[i] == null){
                //model masih ada yang kosong
                penuh = false;
                break;
            }
        }
        return penuh;
    }
    
    public void doubleResize(){
        //resize 2x jika ukuran array penuh
        if(penuh()){
            var temp = data;
            data = new Todolist[data.length * 2];
            
            for(var i = 0; i < temp.length; i++){
                data[i] = temp[i];
            }
        }
    }
    
    @Override
    public void add(Todolist todolist){
        doubleResize();
        //menambahkan dimana data array adalah null
        for(var i = 0; i < data.length; i++){
            if(data[i] == null){
                data[i] = todolist;
                break;
            }
        }
    }
    
    @Override
    public boolean remove(Integer number){
        if((number - 1) >= data.length){
            return false;
        }else if(data[number-1] == null){
            return false;
        }else{
            for (var i = (number-1); i < data.length; i++){
                if(i == (data.length -1)){
                    data[i] = null;
                }else{
                    data[i] = data[i+1];
                }
            }
            return true;
        }
    }
}
