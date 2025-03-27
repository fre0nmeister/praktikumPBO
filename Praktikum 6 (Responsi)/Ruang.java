/* Nama file: Ruang.java
 * Deskripsi: Berisi atribut dan metode dalam class Ruang
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 27 Maret 2025
*/

public class Ruang {
    private String kode;
    private double panjang, lebar, tinggi;
    private int kapasitas;

    public Ruang(){
        kode = "";
        panjang = 0;
        lebar = 0;
        tinggi = 0;
        kapasitas = 0;
    }

    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas){
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }

    public String getKode(){
        return kode;
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public double getPanjang(){
        return panjang;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public double getTinggi(){
        return tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public int getKapasitas(){
        return kapasitas;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    public double hitungBiayaKebersihan(){
        return panjang * lebar * 0;
    }

    public void tampilkanInfo(){
        System.out.println("Kode ruang          : " + kode);
        System.out.println("Panjang ruang       : " + panjang);
        System.out.println("Lebar ruang         : " + lebar);
        System.out.println("Tinggi ruang        : " + tinggi);
        System.out.println("Kapasitas ruang     : " + kapasitas);
    }
}
