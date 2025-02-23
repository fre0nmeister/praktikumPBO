/* Nama file: mgaris.java
 * Deskripsi: Berisi atribut dan metode dalam class garis
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Jumat, 21 Februari 2025
 */

public class mgaris {
    public static void main(String[] args){
        Garis G1 = new Garis();
        Garis G2 = new Garis(new Titik(0, -5), new Titik (5, 0));
        Garis G3 = new Garis(new Titik(), new Titik(1, -1));

        System.out.println("-----Titik awal-----");
        System.out.print("G1: ");
        G1.printGaris();

        System.out.print("\nG2: ");
        G2.printGaris();

        System.out.print("\nG3: ");
        G3.printGaris();

        System.out.println("\n\n-----Panjang garis-----");
        System.out.println("Panjang garis G1: " + G1.panjangGaris());
        System.out.println("Panjang garis G2: " + G2.panjangGaris());
        System.out.println("Panjang garis G3: " + G3.panjangGaris());

        System.out.println("\n-----Gradien garis-----");
        System.out.println("Gradien garis G1: " + G1.gradienGaris());
        System.out.println("Gradien garis G2: " + G2.gradienGaris());
        System.out.println("Gradien garis G3: " + G3.gradienGaris());

        System.out.println("\n-----Titik tengah----");
        Titik tTengah1 = G1.titikTengah();
        Titik tTengah2 = G2.titikTengah();
        Titik tTengah3 = G3.titikTengah();

        System.out.print("Titik tengah dari garis G1: ");
        tTengah1.printTitik();

        System.out.print("\nTitik tengah dari garis G2: ");
        tTengah2.printTitik();

        System.out.print("\nTitik tengah dari garis G3: ");
        tTengah3.printTitik();

        System.out.println("\n\n-----Sejajar-----");
        String sejajar1 = G1.sejajar(G2) ? "G1 sejajar dengan G2" : "G1 tidak sejajar dengan G2";
        String sejajar2 = G1.sejajar(G3) ? "G1 sejajar dengan G3" : "G1 tidak sejajar dengan G3";
        String sejajar3 = G2.sejajar(G3) ? "G2 sejajar dengan G3" : "G2 tidak sejajar dengan G3";
        
        System.out.println(sejajar1);
        System.out.println(sejajar2);
        System.out.println(sejajar3);
        
        System.out.println("\n-----Tegak lurus-----");
        String tegaklurus1 = G1.tegakLurus(G2) ? "G1 tegak lurus dengan G2" : "G1 tidak tegak lurus dengan G2";
        String tegaklurus2 = G1.tegakLurus(G3) ? "G1 tegak lurus dengan G3" : "G1 tidak tegak lurus dengan G3";
        String tegaklurus3 = G2.tegakLurus(G3) ? "G2 tegak lurus dengan G3" : "G2 tidak tegak lurus dengan G3";

        System.out.println(tegaklurus1);
        System.out.println(tegaklurus2);
        System.out.println(tegaklurus3);

        System.out.println("\n-----Persamaan garis-----");
        G1.persamaanGaris();
        G2.persamaanGaris();
        G3.persamaanGaris();
        
        System.out.println("\n-----Jumlah garis-----");
        System.out.println("Jumlah garis yang ada: " + Garis.getCounterGaris());
    }
}
