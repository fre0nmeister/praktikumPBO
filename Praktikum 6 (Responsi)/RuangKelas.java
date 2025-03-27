/* Nama file: RuangKelas.java
 * Deskripsi: Berisi atribut dan metode dalam class RuangKelas
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 27 Maret 2025
*/

public class RuangKelas extends Ruang{
    private int kursiBagus;
    private int kursiRusak;
    private double tarifKebersihan = 10000; //dimisalkan tarif biaya kebersihan fakultas bernilai 100000

    public RuangKelas(){
        super();
        kursiBagus = 0;
        kursiRusak = 0;
    }

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int kursiBagus, int kursiRusak){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.kursiBagus = kursiBagus;
        this.kursiRusak = kursiRusak;
    }

    public int getKursiBagus(){
        return kursiBagus;
    }

    public void setKursiBagus(int kursiBagus){
        this.kursiBagus = kursiBagus;
    }

    public int getKursiRusak(){
        return kursiRusak;
    }

    public void setKursiRusak(int kursiRusak){
        this.kursiRusak = kursiRusak;
    }

    @Override
    public double hitungBiayaKebersihan() {
        return getPanjang() * getLebar() * tarifKebersihan;
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("Jenis ruang         : Ruang Kelas");
        System.out.println("Jumlah kursi bagus  : " + kursiBagus);
        System.out.println("Jumlah kursi rusak  : " + kursiRusak);
        System.out.println("Kode ruang          : " + getKode());
        System.out.println("Panjang ruang       : " + getPanjang());
        System.out.println("Lebar ruang         : " + getLebar());
        System.out.println("Tinggi ruang        : " + getTinggi());
        System.out.println("Kapasitas ruang     : " + getKapasitas());
        System.out.println("Biaya kebersihan    : " + hitungBiayaKebersihan());
    }
}
