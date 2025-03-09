/**
 * Nama: Rasendriya Daffa Al Ghifary (24060123130077)
 * Hari/Tanggal: Minggu 9 Maret 2025
 * File     : AngkaSialException.java
 * Deskripsi: Eksepsi buatan sendiri, menolak masukan angka 13!
 */

 public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan memasukkan angka 13 karena angka sial!!!");
    }
}
