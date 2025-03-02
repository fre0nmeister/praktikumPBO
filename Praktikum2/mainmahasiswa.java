/* Nama file: mainmahasiswa.java
 * Deskripsi: File main dari class Mahasiswa
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 2 Maret 2025
 */

public class mainmahasiswa {
    public static void main (String[] args) {
        Matkul PBO = new Matkul("PBO", "Pemrograman Berbasis Objek", 3);
        Matkul MBD = new Matkul("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("077", "Daffa", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("B5964FNI", "Motor");
        M1.setDosen(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah matkul: " + M1.getJumlahMatkul());
        System.out.println("Jumlah sks: " + M1.getJumlahSKS());
    }
}
