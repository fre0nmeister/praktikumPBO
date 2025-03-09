/*
 * Nama: Rasendriya Daffa Al Ghifary (24060123130077)
 * Hari/Tanggal: Minggu 9 Maret 2025
 * File: Asersi2.java
 * Deskripsi: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran
 * yang bernilai nol
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran (double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    } 
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;

        assert(jariJari > 0): "Jari jari tidak boleh nol!!!";

        Lingkaran L1 = new Lingkaran(jariJari);
        double kelilingLingkaran = L1.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}   

/*
 * Jawaban pertanyaan: Asersi tidak cocok untuk validasi input
 * - Asersi dalam java secara default dinonaktifkan jika program dijalankan tanpa opsi -enableassertions
 * - Jika program dijalankan tanpa asersi aktif (java Asersi2), program tetap akan membuat objek Lingkaran dengan jariJari = 0, sehingga hasil perhitungan keliling akan salah (0.0),
 *   meskipun secara logika itu tidak boleh terjadi.
 * - Seharusnya, validasi untuk memastikan jari-jari lebih besar dari nol dilakukan menggunakan if-else, bukan assert.
 */
