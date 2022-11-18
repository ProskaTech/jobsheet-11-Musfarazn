/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prak11.java;

/**
 *
 * @author user
 */
public class Pertama {
    private int a = 10;
    
    protected void terprotek() {
         System.out.println("Method ini hanya untuk anaknya");
    }

    public void info() {
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada =" + this.getClass() .getName());
    }
}
