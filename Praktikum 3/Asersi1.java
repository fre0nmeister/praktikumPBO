/*
 * Nama: Rasendriya Daffa Al Ghifary (24060123130077)
 * Hari/Tanggal: Minggu 9 Maret 2025
 * File: Asersi1.java
 * Deskripsi: Program untuk menunjukkan asersi
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0){
            System.out.println("X bilangan positif");
        }

        else{
            assert(x < 0): "Ada kesalahan kode";
            System.out.println("X bilangan negatif");
        }
        
    }
}
