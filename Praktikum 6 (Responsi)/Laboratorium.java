/* Nama file: Laboratorium.java
 * Deskripsi: Berisi atribut dan metode dalam class Laboratorium
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 27 Maret 2025
*/

public class Laboratorium extends Ruang{
    private String namaLab;
    private double hargaSewa;
    private double tarifKebersihan = 10000; //dimisalkan tarif biaya kebersihan fakultas bernilai 100000

    public Laboratorium(){
        super();
        namaLab = "";
        hargaSewa = 0;
    }

    public Laboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
    }

    public String getNamaLab(){
        return namaLab;
    }

    public void setNamaLab(String namaLab){
        this.namaLab = namaLab;
    }

    public double getHargaSewa(){
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa){
        this.hargaSewa = hargaSewa;
    }

    @Override
    public double hitungBiayaKebersihan() {
        return getPanjang() * getLebar() * tarifKebersihan;
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("Jenis ruang         : Laboratorium");
        System.out.println("Nama lab            : " + namaLab);
        System.out.println("Harga sewa          : " + hargaSewa);
        System.out.println("Kode ruang          : " + getKode());
        System.out.println("Panjang ruang       : " + getPanjang());
        System.out.println("Lebar ruang         : " + getLebar());
        System.out.println("Tinggi ruang        : " + getTinggi());
        System.out.println("Kapasitas ruang     : " + getKapasitas());
        System.out.println("Biaya kebersihan    : " + hitungBiayaKebersihan());
    }
}
