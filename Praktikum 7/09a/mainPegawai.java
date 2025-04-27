/* Nama file: mainPegawai.java
 * Deskripsi: File main untuk menjalankan class Pegawai, Manajer, dan Programmer
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 24 April 2025
*/

import java.util.ArrayList;
public class mainPegawai {
    public static void main(String[] args) {
        System.out.println("Nama: Rasendriya Daffa Al Ghifary (24060123130077)\n ");

        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/* 1. Manfaat polimorfisme: Manfaat polimorfisme pada kasus ini adalah memudahkan pengelolaan objek-objek yang berbeda tipe (yaitu Programmer dan Manajer)
      dalam satu koleksi (ArrayList<Pegawai>). Dengan polimorfisme, semua objek Programmer dan Manajer bisa diperlakukan sebagai objek Pegawai, 
      sehingga kita bisa menggunakan satu loop for untuk memanggil tampilData() tanpa perlu memeriksa tipe masing-masing objek secara manual. 
      Ini membuat kode menjadi lebih sederhana, fleksibel, dan mudah dikembangkan di masa depan. 
    
   2. Kita harus membuat list atau array yang berbeda untuk setiap jenis pegawai (Programmer, Manajer, dll) Kita tidak bisa menggunakan satu struktur data 
      (ArrayList<Pegawai>) untuk menampung semuanya. Saat ingin menampilkan data, kita harus memanggil method tampilData() satu per satu untuk setiap jenis 
      pegawai secara eksplisit, sehingga kode menjadi panjang, duplikatif, dan sulit dirawat. 
*/