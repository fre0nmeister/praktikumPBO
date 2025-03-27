/* Nama file: LabNonKomputer.java
 * Deskripsi: Berisi atribut dan metode dalam class LabNonKomputer
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 27 Maret 2025
*/

public class LabNonKomputer extends Laboratorium{
    private String mataKuliah;

    public LabNonKomputer(){
        super();
        mataKuliah = "";
    }

    public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, String mataKuliah){
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.mataKuliah = mataKuliah;
    }

    public String getMataKuliah(){
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }

    @Override
    public double hitungBiayaKebersihan() {
        return super.hitungBiayaKebersihan();
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("Jenis ruang         : Lab Non Komputer");
        System.out.println("Nama matkul         : " + mataKuliah);
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
