/* Nama file: LabKomputer.java
 * Deskripsi: Berisi atribut dan metode dalam class LabKomputer
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 27 Maret 2025
*/

public class LabKomputer extends Laboratorium{
    private int jumlahKomputer;

    public LabKomputer(){
        super();
        jumlahKomputer = 0;
    }

    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, int jumlahKomputer){
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.jumlahKomputer = jumlahKomputer;
    }

    public int getJumlahKomputer(){
        return jumlahKomputer;
    }

    public void setJumlahKomputer(int jumlahKomputer){
        this.jumlahKomputer = jumlahKomputer;
    }

    @Override
    public double hitungBiayaKebersihan() {
        return super.hitungBiayaKebersihan();
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("Jenis ruang         : Lab Komputer");
        System.out.println("Jumlah komputer     : " + jumlahKomputer);
        System.out.println("Nama lab            : " + getNamaLab());
        System.out.println("Harga sewa          : " + getHargaSewa());
        System.out.println("Kode ruang          : " + getKode());
        System.out.println("Panjang ruang       : " + getPanjang());
        System.out.println("Lebar ruang         : " + getLebar());
        System.out.println("Tinggi ruang        : " + getTinggi());
        System.out.println("Kapasitas ruang     : " + getKapasitas());
        System.out.println("Biaya kebersihan    : " + hitungBiayaKebersihan());
    }
}
