/* Nama file: DosenTamu.java
 * Deskripsi: Berisi atribut dan metode dalam class dosentamu
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 13 Maret 2025
 */


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate kontrak;

    public DosenTamu(){
    }

    public DosenTamu(String nip, String nama, String tglLahir, String tmt, int gaji, String fakultas, String nidk, String kontrak){
        super(nip, nama, tglLahir, tmt, gaji, fakultas);
        this.nidk = nidk;
        this.kontrak = LocalDate.parse(kontrak, DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID")));
    }

    public String getNidk(){
        return nidk;
    }

    public void setNidk(String nidk){
        this.nidk = nidk;
    }

    public LocalDate getKontrak(){
        return kontrak;
    }

    public void setKontrak(String kontrak){
        this.kontrak = LocalDate.parse(kontrak, DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID")));
    }

    public int hitungKontrak() {
        Period selisih = Period.between(LocalDate.now(), kontrak);
        int totalBulan = selisih.getYears() * 12 + selisih.getMonths();
        return totalBulan;
    }
    

    @Override
    public void printInfo(){
        System.out.println("=========== DOSEN TAMU ===========");
        System.out.println("NIP             : " + getNip());
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal lahir   : " + getTgl().format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"))));
        System.out.println("TMT             : " + getTmt().format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"))));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Masa kerja      : " + hitungMasaKerja());
        System.out.println("Sisa Kontrak    : " + hitungKontrak() + " bulan lagi");
        System.out.println("Gaji pokok      : " + formatRupiah(getGaji()));
        System.out.println("Tunjangan       : 2,5% x " + formatRupiah(getGaji()) + " = " + formatRupiah(0.025 * getGaji()));
    }
}
