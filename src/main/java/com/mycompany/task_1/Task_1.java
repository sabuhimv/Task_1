/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.task_1;

/**
 *
 * @author SebuhiMv
 */
public class Task_1 {

    public static void main(String[] args) {
        String name = "salam";

        char[] ch = new char[name.length()];

        for (int i = 0; i < name.length(); i++) {
            ch[i] = name.charAt(i);
        }

//        for (char c : ch) {
//            System.out.println(c);
//        }
        System.out.println("Tersine Cevrilmis: ");
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
