/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author rdaff
 */
public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main(String[] args) throws SQLException {
        List <Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        // Insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(1, "Bayu");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();
        
        // Update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        // Delete
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }
    
    public static void displayAll() throws SQLException {
        System.out.println("===DisplayAll");
        List<Mahasiswa> list = service.getAll();
        if (list.isEmpty()) {
            System.out.println("Tabel kosong");
        } else {
            for (Mahasiswa m : list) {
                System.out.println(m.toString());
            }
        } 
    }
}
