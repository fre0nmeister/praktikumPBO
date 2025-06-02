/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan_11;
import java.util.HashMap;
import java.util.Map;
/**
 * Nama File    : LambdaMap.java
 * Deskripsi    : Implementasi Lambda tanpa dan dengan blok statement pada HashMap.
 * Tanggal      : Senin, 2 Juni 2025
 * Nama         : Rasendriya Daffa Al Ghifary
 * NIM          : 25060123130077
 */

public class LambdaMap {
    public static void main(String[] args){
        Map<String, String> dataMahasiswa = new HashMap<>();
        
        dataMahasiswa.put("24060123120041", "Steven Jonathan Sihombing");
        dataMahasiswa.put("24060123120044", "Rico Aldy Kusuma");
        dataMahasiswa.put("24060123130077", "Rasendriya Daffa Al Ghifary");
        dataMahasiswa.put("24060123140196", "Ranggadya Aditama Ramadhani");
        
        // Lambda tanpa blok statement
        dataMahasiswa.forEach((nim, nama) -> System.out.println("Nim: " + nim + ", Nama: " + nama));
        
        // Lambda dengan blok statement
        dataMahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}
