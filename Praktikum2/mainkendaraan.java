/* Nama file: mainkendaraan.java
 * Deskripsi: File main dari class Kendaraan
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 2 Maret 2025
 */

public class mainkendaraan {
    public static void main(String[] args) {
        Kendaraan K1 = new Kendaraan();
        Kendaraan K2 = new Kendaraan("R5173BAC", "Motor");

        K1.setNoplat("H2005IP");
        K1.setJenis("Motor");

        System.out.println("Plat kendaraan 1: " + K1.getNoplat());
        System.out.println("Jenis kendaraan 1: "+ K1.getJenis());
        System.out.println("Plat kendaraan 2: " + K2.getNoplat());
        System.out.println("Jenis kendaraan 2: "+ K2.getJenis());
    }
}
