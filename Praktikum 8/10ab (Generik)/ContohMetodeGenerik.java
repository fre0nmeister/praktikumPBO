/* Nama file: ContohMetodeGenerik.java
 * Deskripsi: Berisi metode/fungsi/prosedur generik yang dapat mengendalikan kelas Datum.
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 11 Mei 2025
*/

public class ContohMetodeGenerik {
    // Metode generik untuk menampilkan isi dari Datum
    public <T extends Anabul> void tampilkanPerilaku(Datum<T> data) {
        T objek = data.getIsi();
        System.out.println("Nama: " + objek.getNama());
        objek.Gerak();
        objek.Bersuara();
    }

    // Metode generik untuk mengganti isi dari Datum
    public <T> void ubahIsi(Datum<T> data, T nilaiBaru) {
        data.setIsi(nilaiBaru);
    }
}
