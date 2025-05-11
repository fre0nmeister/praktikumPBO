/* Nama file: Datum.java
 * Deskripsi: Berisi atribut dan metode dalam class Datum
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 11 Mei 2025
*/

public class Datum <T>{
    private T isi;

    public Datum() {
        this.isi = null;
    }

    public Datum(T isi) {
        this.isi = isi;
    }

    public void setIsi(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return this.isi;
    }
}
