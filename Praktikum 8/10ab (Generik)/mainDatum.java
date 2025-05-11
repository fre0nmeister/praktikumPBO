/* Nama file: Datum.java
 * Deskripsi: File main untuk menjalankan class Datum.
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 11 Mei 2025
*/

public class mainDatum {
    public static void main(String[] args) throws Exception {
        Datum<Anabul> dataKucing = new Datum<>();
        Datum<Anabul> dataAnjing = new Datum<>();
        Datum<Anabul> dataBurung = new Datum<>();

        dataKucing.setIsi(new Kucing("Mimi"));
        dataAnjing.setIsi(new Anjing("Doggo"));
        dataBurung.setIsi(new Burung("Ciki"));

        System.out.println("=== KUCING ===");
        System.out.println("Nama: " + dataKucing.getIsi().getNama());
        dataKucing.getIsi().Gerak();
        dataKucing.getIsi().Bersuara();

        System.out.println("\n=== ANJING ===");
        System.out.println("Nama: " + dataAnjing.getIsi().getNama());
        dataAnjing.getIsi().Gerak();
        dataAnjing.getIsi().Bersuara();

        System.out.println("\n=== BURUNG ===");
        System.out.println("Nama: " + dataBurung.getIsi().getNama());
        dataBurung.getIsi().Gerak();
        dataBurung.getIsi().Bersuara();
    }
}
