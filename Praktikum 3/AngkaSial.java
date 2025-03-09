/**
 * Nama: Rasendriya Daffa Al Ghifary (24060123130077)
 * Hari/Tanggal: Minggu 9 Maret 2025
 * File     : AngkaSial.java
 * Deskripsi: Program penggunaan exception buatan sendiri
 *            Pengenalan klausa 'throw' dan 'throws'
 */
 public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(-10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // Method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}

/*
 * Jawaban: 
 * - Baris 12 tidak dijalankan, Jika angka == 13, maka program langsung melempar (throw) eksepsi AngkaSialException.
 *   Ketika eksepsi dilempar, eksekusi method langsung dihentikan, sehingga baris System.out.println(angka + " bukan angka sial"); tidak akan dijalankan.
 * - Baris 21 dieksekusi karena ketika baris kode "as.cobaAngka(13)" dijalankan,
 *   method cobaAngka akan melempar eksepsi, dan ketika terjadi eksepsi, baris kode catch tersebut akan dieksekusi.
 */