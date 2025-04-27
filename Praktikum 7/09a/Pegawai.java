/* Nama file: Pegawai.java
 * Deskripsi: Berisi atribut dan metode dalam class Pegawai
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 24 April 2025
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
