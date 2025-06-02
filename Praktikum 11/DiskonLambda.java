/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan_11;

/**
 * Nama File    : DiskonLambda.java
 * Deskripsi    : Contoh implementasi Lambda
 * Tanggal      : Senin, 2 Juni 2025
 * Nama         : Rasendriya Daffa Al Ghifary
 * NIM          : 25060123130077
 */

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args){
        //Tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
        
        //Dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        //Dengan lambda dengan blok statement

        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    
    }
}
