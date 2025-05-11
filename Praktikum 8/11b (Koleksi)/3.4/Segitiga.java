/* Nama file: Segitiga.java
 * Deskripsi: Berisi atribut dan metode dalam class Segitiga.
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 11 Mei 2025
*/

public class Segitiga extends BangunDatar {
    private double sisi1, sisi2, sisi3;

    public Segitiga(double s1, double s2, double s3) {
        this.sisi1 = s1;
        this.sisi2 = s2;
        this.sisi3 = s3;
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}
