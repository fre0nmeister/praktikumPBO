/* Nama file: titik.java
 * Deskripsi: Berisi atribut dan metode dalam class titik
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 20 Februari 2025
 */

public class Titik{
    /*Atribut*/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*Method */
    //Konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //Konstruktor untuk membuat titik (0, 0)
    Titik(){
        this(0, 0);
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //Mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinant titik
    void printTitik(){
        System.out.print("(" + absis + ", " + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(Titik.getCounterTitik());
    }

    int getKuadran(){
        if (this.absis > 0 && this.ordinat > 0){
            return 1;
        }
        else if (this.absis < 0 && this.ordinat > 0){
            return 2;
        }
        else if (this.absis < 0 && this.ordinat < 0){
            return 3;
        }
        else if (this.absis > 0 && this.ordinat < 0){
            return 4;
        }
        else{
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    }

    void refleksiX(){
        this.ordinat = -1 * this.ordinat;
    }

    void refleksiY(){
        this.absis = -1 * this.absis;
    }

    Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }
}