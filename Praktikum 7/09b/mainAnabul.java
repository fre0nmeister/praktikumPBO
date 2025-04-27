/* Nama file: mainAnabul.java
 * Deskripsi: File main untuk menjalankan class Kucing, Anjing, dan Burung
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 27 April 2025
*/

public class mainAnabul {
    public static void main(String[] args) {
        Kucing K1 = new Kucing("Oreo");

        System.out.println("===== KUCING =====");
        K1.Gerak();
        K1.Bersuara();

        Anjing A1 = new Anjing("Coco");

        System.out.println("===== ANJING =====");
        A1.Gerak();
        A1.Bersuara();

        Burung B1 = new Burung("Peanut");

        System.out.println("===== BURUNG =====");
        B1.Gerak();
        B1.Bersuara();
    }
}
