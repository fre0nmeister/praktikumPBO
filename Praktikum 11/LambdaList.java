/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan_11;
import java.util.ArrayList;

/**
 * Nama File    : LambdaList.java
 * Deskripsi    : Implementasi Lambda dengan List
 * Tanggal      : Senin, 2 Juni 2025
 * Nama         : Rasendriya Daffa Al Ghifary
 * NIM          : 25060123130077
 */

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        
        //Lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
