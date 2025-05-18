/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* Nama file: DAOManager.java
 * Deskripsi: Pengelola DAO dalam program
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 15 Mei 2025
*/

public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO (PersonDAO person){
        personDAO = person;
    }
    
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
    
}
