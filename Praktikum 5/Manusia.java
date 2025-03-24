/* Nama file: Manusia.java
 * Deskripsi: Berisi atribut dan metode dalam class Manusia
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Senin, 24 Maret 2025
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterManusia = 0;    

    public Manusia(){
        nama = "";
        tglMulaiKerja = LocalDate.now();
        alamat = "";
        pendapatan = 0.0;
        counterManusia++;
    }

    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterManusia++;
    }

    public static int getCounterMns() {
        return counterManusia;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTglmulaikerja(){
        return tglMulaiKerja;
    }

    public void setTglmulaikerja(LocalDate tglMulaiKerja){
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }
    
    public void cetakInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Tanggal masuk: " + tglMulaiKerja.format(DateTimeFormatter.ofPattern("d MMMM yyy", Locale.of("id", "ID"))));
        System.out.println("Alamat      : " + alamat);
        System.out.println("Pendapatan  : " + pendapatan);
        System.out.println("Masa Kerja  : " + hitungMasaKerja() + " tahun");
    }

    public abstract int hitungMasaKerja();
}
