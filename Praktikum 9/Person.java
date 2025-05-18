/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* Nama file: Person.java
   Deskripsi: Person database model
   Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
   Tanggal: Kamis, 15 Mei 2025
*/

public class Person {
    private int id;
    private String name;
    
    public Person (String n) {
        name = n;
    }
    
    public Person (int i, String n){
        id = i;
        name = n;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}
