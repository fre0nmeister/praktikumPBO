/* Nama file: RuangDosen.java
 * Deskripsi: Berisi atribut dan metode dalam class RuangDosen
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 27 Maret 2025
*/

public class RuangDosen extends Ruang{
    private String namaDosen;
    private int jumlahMeja;
    private int jumlahKursi;
    private double tarifKebersihan;

    public RuangDosen(){
        super();
        namaDosen = "";
        jumlahMeja = 0;
        jumlahKursi = 0;
        tarifKebersihan = 0;
    }

    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int jumlahMeja, int jumlahKursi, double tarifKebersihan){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.tarifKebersihan = tarifKebersihan;
    }

    public String getNamaDosen(){
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen){
        this.namaDosen = namaDosen;
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
        System.out.println("Jenis ruang         : Ruang Dosen");
        System.out.println("Nama dosen          : " + namaDosen);
        System.out.println("Jumlah meja         : " + jumlahMeja);
        System.out.println("Jumlah kursi        : " + jumlahKursi);
        System.out.println("Kode ruang          : " + getKode());
        System.out.println("Panjang ruang       : " + getPanjang());
        System.out.println("Lebar ruang         : " + getLebar());
        System.out.println("Tinggi ruang        : " + getTinggi());
        System.out.println("Kapasitas ruang     : " + getKapasitas());
        System.out.println("Biaya kebersihan    : " + hitungBiayaKebersihan());
    } 
}
