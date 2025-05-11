/* Nama file: KoleksiAnabul.java
 * Deskripsi: Berisi atribut dan metode dalam class KoleksiAnabul
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 11 Mei 2025
*/

import java.util.ArrayList;

public class KoleksiAnabul<T extends Anabul> {
    private ArrayList<T> wadah;

    public KoleksiAnabul() {
        wadah = new ArrayList<>();
    }

    public void add(T anabul) {
        wadah.add(anabul);
    }

    public void showAll() {
        for (T a : wadah) {
            System.out.println("-----");
            System.out.println("Nama: " + a.getNama());
            System.out.println("Jenis: " + a.getClass().getSimpleName());
            a.Gerak();
            a.Bersuara();
        }
        System.out.println("Jumlah elemen: " + wadah.size());
    }
}
