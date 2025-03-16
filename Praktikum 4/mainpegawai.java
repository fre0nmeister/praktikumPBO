/* Nama file: mainpegawai.java
 * Deskripsi: file main dari class pegawai dan subclassnya
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 13 Maret 2025
 */

public class mainpegawai extends Pegawai{
    public static void main(String[] args) {
        Tendik T1 = new Tendik("24060123130077", "Rasendriya Daffa Al Ghifary", "29 Februari 2000", "15 Juli 2020", 4000000, "Kemahasiswaan");
        DosenTetap DT1 = new DosenTetap("9545647548", "Andi", "5 Mei 1990", "1 Januari 2015", 5000000, "Fakultas Sains dan Matematika", "78647324");
        DosenTamu DT2 = new DosenTamu("196402191990032001", "Ova Emilia", "19 Februari 1964", "27 Mei 2022", 100000000, "Fakultas Kedokteran", "82920385", "1 Juni 2027");

        T1.printInfo();
        DT1.printInfo();
        DT2.printInfo();

    }
}
