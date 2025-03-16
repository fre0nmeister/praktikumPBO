/* Nama file: Lingkaran.java
 * Deskripsi: Berisi atribut dan metode dalam class lingkaran
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 13 Maret 2025
 */

public class Lingkaran extends BangunDatar{
    private double jari;

    // Konstruktor tanpa parameter
    public Lingkaran() {
        this.jari = 0;
    }

    // Konstruktor dengan parameter diameter, warna, dan border
    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    // Getter untuk jari-jari
    public double getJari() {
        return jari;
    }

    // Setter untuk jari-jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Metode untuk menghitung luas lingkaran
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // Metode untuk menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari: " + jari);
    }
}
