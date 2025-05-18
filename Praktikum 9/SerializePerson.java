/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* Nama file: SerializePerson.java
 * Deskripsi: Program untuk serialisasi objek Person
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 15 Mei 2025
*/

import java.io.*;

class Person implements Serializable{
    private String name;
    
    public Person (String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args){
        Person person = new Person("Panji");
        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek person");
            s.close();
        }
        
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
