/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak11.java;

/**
 *
 * @author user
 */
public class Bus2 {
    private int penumpang;
    private int maxPenumpang;
    
    //konstruktor
    public Bus2(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang ){
            System.out.println("Penumpang melebihi kuota");
        }
        else {
            this.penumpang = temp;
        }
    }

    void cetak() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
