/* Nama file: mtitik.java
 * Deskripsi: Berisi atribut dan metode dalam class titik
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 20 Februari 2025
 */

public class mtitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);

        System.out.println();
        T1.printTitik();
        T1.geser(3, 4);

        System.out.println();
        T1.printTitik();

        Titik T2 = T1;

        System.out.println();
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);

        System.out.println();
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3, 5);

        System.out.println();
        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());

        System.out.println("Kuadran titik T3: " + T3.getKuadran());
        System.out.println("Kuadran titik T4: " + T4.getKuadran());

        System.out.println("Jarak titik T3 dari pusat: " + T3.getJarakPusat());
        System.out.println("Jarak titik T3 dari pusat: " + T4.getJarakPusat());

        System.out.println("Jarak antara titik T3 dan T4: " + T4.getJarak(T3));

        T1.refleksiX();
        T4.refleksiY();

        System.out.print("T1 setelah dicerminkan terhadap sumbu X: ");
        T1.printTitik();

        System.out.println();
        System.out.print("T4 setelah dicerminkan terhadap sumbu Y: ");
        T4.printTitik();

        Titik TrefleksiX = T4.getRefleksiX();
        Titik TrefleksiY = T1.getRefleksiY();

        System.out.println();
        System.out.print("Titik baru hasil cerminan T4 terhadap sumbu X: ");
        TrefleksiX.printTitik();

        System.out.println();
        System.out.print("Titik baru hasil cerminan T1 terhadap sumbu Y: ");
        TrefleksiY.printTitik();
    }
}
