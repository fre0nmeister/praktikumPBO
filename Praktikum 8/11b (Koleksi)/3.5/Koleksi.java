/* Nama file: Koleksi.java
 * Deskripsi: Berisi atribut dan metode dalam class Koleksi.
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 11 Mei 2025
*/

import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;               
    private ArrayList<T> wadah;      

    public Koleksi() {
        wadah = new ArrayList<T>();
        nbelm = 0;
    }

    public T getIsi(int index) {
        return wadah.get(index);
    }

    public void setIsi(int index, T elemen) {
        wadah.set(index, elemen);
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int n) {
        this.nbelm = n;
    }

    public void add(T elemen) {
        wadah.add(elemen);
        nbelm++;
    }

    public void delete(int index) {
        if(index < nbelm){
            wadah.remove(index);
            nbelm--;
        }
    }

    public void showAll() {
        System.out.println("Isi Koleksi:");
        for (T item : wadah) {
            System.out.print(item + " ");
        }
        System.out.println("\nJumlah elemen: " + nbelm);
    }
}
