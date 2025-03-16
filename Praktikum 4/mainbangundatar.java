/* Nama file: mainbangundatar.java
 * Deskripsi: file main dari class bangundatar dan subclassnya
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 13 Maret 2025
 */

public class mainbangundatar extends BangunDatar{
    public static void main(String[] args) {
        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(2.0, "Merah", "Tebal");
        Lingkaran L1 = new Lingkaran();
        Lingkaran L2 = new Lingkaran(5.0, "biru", "Tebal");

        System.out.println("======== PERSEGI =========");
        P1.setSisi(5.0);
        P1.setWarna("Hitam");
        P1.setBorder("Tipis");
        System.out.println("Sisi P1: " + P1.getSisi());
        System.out.println("Sisi P2: " + P2.getSisi());
        System.out.println("Luas persegi P1: " + P1.getLuas());
        System.out.println("Luas persegi P2: " + P2.getLuas());
        System.out.println("Keliling persegi P1: " + P1.getKeliling());
        System.out.println("Keliling persegi P2: " + P2.getKeliling());
        System.out.println("Panjang diagonal P1: "+ P1.getDiagonal());
        System.out.println("Panjang diagonal P2: "+ P2.getDiagonal());
        System.out.println("PrintInfo dari P1: ");
        P1.printInfo();
        System.out.println("PrintInfo dari P2: ");
        P2.printInfo();

        System.out.println("\n======== LINGKARAN =========");
        L1.setJari(3.0);
        L1.setWarna("Hijau");
        L1.setBorder("Tipis");
        System.out.println("Luas lingkaran L1: " + L1.getLuas());
        System.out.println("Keliling lingkaran L1: " + L1.getKeliling());
        System.out.println("PrintInfo dari L1: ");
        L1.printInfo();
        System.out.println("PrintInfo dari L2: ");
        L2.printInfo();

        System.out.print("Jumlah bangun datar: ");
        printCounterBangunDatar();
    }
}
