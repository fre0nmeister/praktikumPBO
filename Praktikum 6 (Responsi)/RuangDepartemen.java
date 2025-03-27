/* Nama file: RuangDepartemen.java
 * Deskripsi: Berisi atribut dan metode dalam class RuangDepartemen
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 27 Maret 2025
*/

public class RuangDepartemen extends Ruang{
    private String namaDepartemen;
    private String ketuaDepartemen;
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;
    private double tarifKebersihan;

    public RuangDepartemen(){
        super();
        jumlahMeja = 0;
        jumlahKursi = 0;
        jumlahLemari = 0;
        tarifKebersihan = 0;
    }

    public RuangDepartemen(String namaDepartemen, String ketuaDepartemen, String kode, double panjang, double lebar, double tinggi, int kapasitas, int jumlahMeja, int jumlahKursi, int jumlahLemari, double tarifKebersihan){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        this.tarifKebersihan = tarifKebersihan;
    }

    public String getNamaDepartemen(){
        return namaDepartemen;
    }

    public void setNamaDepartemen(String namaDepartemen){
        this.namaDepartemen = namaDepartemen;
    }

    public String getKetuaDepartemen(){
        return ketuaDepartemen;
    }

    public void setKetuaDepartemen(String ketuaDepartemen){
        this.ketuaDepartemen = ketuaDepartemen;
    }

    public int getJumlahMeja(){
        return jumlahMeja;
    }

    public void setJumlahMeja(int jumlahMeja){
        this.jumlahMeja = jumlahMeja;
    }

    public int getJumlahKursi(){
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi){
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahLemari(){
        return jumlahLemari;
    }

    public void setJumlahLemari(int jumlahLemari){
        this.jumlahLemari = jumlahLemari;
    }

    public double getTarifKebersihan(){
        return tarifKebersihan;
    }

    public void setTarifKebersihan(double tarifKebersihan){
        this.tarifKebersihan = tarifKebersihan;
    }

    @Override
    public double hitungBiayaKebersihan() {
        return getPanjang() * getLebar() * tarifKebersihan;
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("Jenis ruang         : Ruang Departemen");
        System.out.println("Nama departemen     : " + namaDepartemen);
        System.out.println("Ketua departemen    : " + ketuaDepartemen);
        System.out.println("Jumlah meja         : " + jumlahMeja);
        System.out.println("Jumlah kursi        : " + jumlahKursi);
        System.out.println("Jumlah lemari       : " + jumlahLemari);
        System.out.println("Kode ruang          : " + getKode());
        System.out.println("Panjang ruang       : " + getPanjang());
        System.out.println("Lebar ruang         : " + getLebar());
        System.out.println("Tinggi ruang        : " + getTinggi());
        System.out.println("Kapasitas ruang     : " + getKapasitas());
        System.out.println("Biaya kebersihan    : " + hitungBiayaKebersihan());
    }
}
