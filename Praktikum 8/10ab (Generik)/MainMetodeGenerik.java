/* Nama file: MainMetodeGenerik.java
 * Deskripsi: File main untuk menyimulasikan perilaku objek Datum dengan berbagai variasi hewan peliharaan.
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 11 Mei 2025
*/

public class MainMetodeGenerik {
    public static void main(String[] args) {
        Kucing kucingBaru = new Kucing("Momo");
        Anjing anjingBaru = new Anjing("Rex");
        Burung burungBaru = new Burung("Piko");

        Datum<Kucing> dataKucing = new Datum<>();
        dataKucing.setIsi(kucingBaru);

        Datum<Anjing> dataAnjing = new Datum<>();
        dataAnjing.setIsi(anjingBaru);

        Datum<Burung> dataBurung = new Datum<>();
        dataBurung.setIsi(burungBaru);

        ContohMetodeGenerik handler = new ContohMetodeGenerik();

        System.out.println("=== Kucing ===");
        handler.tampilkanPerilaku(dataKucing);

        System.out.println("\n=== Anjing ===");
        handler.tampilkanPerilaku(dataAnjing);

        System.out.println("\n=== Burung ===");
        handler.tampilkanPerilaku(dataBurung);

        handler.ubahIsi(dataKucing, new Kucing("Tom"));
        handler.ubahIsi(dataAnjing, new Anjing("Ben"));
        handler.ubahIsi(dataBurung, new Burung("Dimas"));

        System.out.println("\n=== Kucing (Setelah diubah) ===");
        handler.tampilkanPerilaku(dataKucing);

        System.out.println("\n=== Anjing (Setelah diubah) ===");
        handler.tampilkanPerilaku(dataAnjing);

        System.out.println("\n=== Burung (Setelah diubah) ===");
        handler.tampilkanPerilaku(dataBurung);
    }
}
