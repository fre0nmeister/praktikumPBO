/* Nama file: Anabul.java
 * Deskripsi: Berisi atribut dan metode dalam class Anabul
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 27 April 2025
*/

public abstract class Anabul {
    private String nama;

    public Anabul(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}
