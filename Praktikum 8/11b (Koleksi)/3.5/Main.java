/* Nama file: Main.java
 * Deskripsi: Aplikasi dari kelas Koleksi.
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 11 Mei 2025
*/

public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();

        for (char c = 'A'; c < 'A' + 10; c++) {
            koleksiKarakter.add(c);
        }

        // Tampilkan semua elemen
        koleksiKarakter.showAll();

        // Tampilkan elemen ke-2
        System.out.println("Elemen ke-2 adalah: " + koleksiKarakter.getIsi(1));  // Index mulai dari 0


        // Edit elemen ke-0 menjadi 'Z'
        koleksiKarakter.setIsi(0, 'Z');

        // Hapus elemen ke-5
        koleksiKarakter.delete(5);

        // Tampilkan lagi
        System.out.println("\nSetelah edit dan hapus:");
        koleksiKarakter.showAll();
    }
}
