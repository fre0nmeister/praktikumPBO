/* Nama file: Burung.java
 * Deskripsi: Berisi atribut dan metode dalam class Burung
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 27 April 2025
*/

public class Burung extends Anabul{

    public Burung(String nama){
        super(nama);
    }

    public void Gerak(){
        System.out.println("Bergerak: Terbang");
    }

    public void Bersuara(){
        System.out.println("Bersuara: Cuit!");
    }
}