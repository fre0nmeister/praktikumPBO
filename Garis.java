/* Nama file: garis.java
 * Deskripsi: Berisi atribut dan metode dalam class garis
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Jumat, 21 Februari 2025
 */

public class Garis {
    /*Atribut */
    Titik tAwal, tAkhir;
    static int counterGaris = 0;

    /*Method */
    /*Konstruktor untuk membuat garis dengan parameter masukan titik awal dan titik akhir */
    Garis (Titik tAwal, Titik tAkhir){
        this.tAwal = tAwal;
        this.tAkhir = tAkhir;
        counterGaris++;
    }

    /*Konstruktor untuk membuat garis dengan titik awal (0, 0) dan titik akhir (1, 1)*/
    Garis(){
        this.tAwal = new Titik(0, 0);
        this.tAkhir = new Titik(1, 1);
        counterGaris++;
    }

    /*Mengembalikan nilai counterGaris */
    static int getCounterGaris(){
        return counterGaris;
    }

    /*Mengembalikan nilai titik awal*/
    Titik getTawal(){
        return tAwal;
    }

    /*Mengembalikan nilai titik akhir */
    Titik getTakhir(){
        return tAkhir;
    }

    /*Mengset titik awal garis dengan titik baru T */
    void setTawal(Titik T){
        tAwal = T;
    }

    /*Mengset titik akhir garis dengan titik baru T */
    void setTakhir(Titik T){
        tAkhir = T;
    }

    /* Method untuk mendapatkan panjang garis */
    double panjangGaris(){
        return Math.sqrt(Math.pow(tAkhir.getAbsis() - tAwal.getAbsis(), 2) + Math.pow(tAkhir.getOrdinat() - tAwal.getOrdinat(), 2));
    }
    
    /* Method untuk mendapatkan gradien garis */
    double gradienGaris(){
        if (tAkhir.absis - tAwal.absis == 0){
            return Double.POSITIVE_INFINITY;
        }
        return (tAkhir.ordinat - tAwal.ordinat) / (tAkhir.absis - tAwal.absis);
    }

    /* Method untuk mmendapatkan titik tengah dari sebuah garis */
    Titik titikTengah(){
        double x = (tAwal.getAbsis() + tAkhir.getAbsis()) / 2;
        double y = (tAwal.getOrdinat() + tAkhir.getOrdinat()) / 2;

        return new Titik(x, y);
    }

    /* Method untuk mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya */
    boolean sejajar(Garis G){
        return this.gradienGaris() == G.gradienGaris();
    }

    /* Method untuk mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya */
    boolean tegakLurus(Garis G){
        Double m1 = gradienGaris();
        Double m2 = G.gradienGaris();
        
        
        // Jika salah satu gradien adalah Infinity dan yang lain adalah 0, maka tegak lurus
        if ((m1 == Double.POSITIVE_INFINITY && m2 == 0) || (m2 == Double.POSITIVE_INFINITY && m1 == 0)) 
            return true; 

        // Jika hasil perkalian dua gradien adalah -1, maka tegak lurus
        if (m1 * m2 == -1) 
            return true; 

        return false;
    }
    
    /* Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c */
    void persamaanGaris(){
        if (tAwal.absis == tAkhir.absis){
            System.out.println("x = " + tAwal.absis);
        }
        else if (tAwal.ordinat == tAkhir.ordinat){
            System.out.println("y = " + tAkhir.ordinat);
        }
        else{
            double c = tAwal.ordinat - (gradienGaris() * tAwal.absis);

            if (c == 0.0){
                System.out.println("y = " + gradienGaris() + "x");
            }

            else if (c > 0.0){
                System.out.println("y = " + gradienGaris() + "x+" + c);
            }

            else{
                System.out.println("y = " + gradienGaris() + "x" + c);
            }
        }
    }

    /* Method untuk menampilkan ke layar titik awal dan titik akhir garis*/
    void printGaris(){
        System.out.print("Garis ini memiliki titik awal: ");
        tAwal.printTitik();
        System.out.print(" dan titik akhir: ");
        tAkhir.printTitik();
    }
}