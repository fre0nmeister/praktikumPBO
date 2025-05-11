/* Nama file: MainAnabul.java
 * Deskripsi: File main untuk menjalankan class KoleksiAnabul.
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 11 Mei 2025
*/

public class MainAnabul {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksi = new KoleksiAnabul<>();

        koleksi.add(new Kucing("Mimi"));
        koleksi.add(new Anjing("Doggo"));
        koleksi.add(new Burung("Ciki"));
        koleksi.add(new Kucing("Luna"));
        koleksi.add(new Anjing("Bruno"));
        koleksi.add(new Burung("Beo"));
        koleksi.add(new Kucing("Neko"));
        koleksi.add(new Burung("Rio"));
        koleksi.add(new Anjing("Rex"));
        koleksi.add(new Kucing("Miu"));

        koleksi.showAll();
    }
}
