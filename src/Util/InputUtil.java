/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.util.Scanner;

/**
 *
 * @author anggarasaputra
 */
public class InputUtil {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static String inputUser(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
}
