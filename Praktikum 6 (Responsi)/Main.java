/* Nama file: Main.java
 * Deskripsi: File main untuk menjalankan kode-kode dari file Ruang, RuangKelas, Laboratorium, LabKomputer, LabNonKomputer, RuangDepartemen, RuangDosen
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 27 Maret 2025
*/

public class Main {
    public static void main(String[] args) throws Exception {
        RuangKelas RK1 = new RuangKelas("E101", 15, 10, 5, 70, 50, 20);
        LabKomputer LKom1 = new LabKomputer("E1", 10, 10, 5, 30, "Lab PBO", 200000, 30);
        LabNonKomputer LNonKom1 = new LabNonKomputer("K2", 10, 10, 5, 30, "Lab Biologi", 100000, "Anatomi Manusia");
        RuangDepartemen RDe1 = new RuangDepartemen("Departemen Informatika", "Muhammad Helmi", "RDe1", 10, 10, 5, 20, 20, 20, 5, 200000);
        RuangDosen RDo1 = new RuangDosen("RDo1", 3, 3, 5, 2, "Rico Aldy Kusuma", 2, 2, 50000);

        System.out.println("========= INFO RUANG KELAS =========");
        RK1.tampilkanInfo();

        System.out.println("========= INFO LAB KOMPUTER =========");
        LKom1.tampilkanInfo();

        System.out.println("========= INFO LAB NON KOMPUTER =========");
        LNonKom1.tampilkanInfo();

        System.out.println("========= INFO RUANG DEPARTEMEN =========");
        RDe1.tampilkanInfo();

        System.out.println("========= INFO RUANG DOSEN =========");
        RDo1.tampilkanInfo();
    }
}
