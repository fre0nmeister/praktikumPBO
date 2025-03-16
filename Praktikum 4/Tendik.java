/* Nama file: Tendik.java
 * Deskripsi: Berisi atribut dan metode dalam class tendik
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 13 Maret 2025
 */


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai {
    private String bidang;
    private int bup = 55;
    
    public Tendik(){
    }

    public Tendik(String nip, String nama, String tglLahir, String tmt, int gaji, String bidang){
        super(nip, nama, tglLahir, tmt, gaji);
        this.bidang = bidang;
    }
    
    public String getBidang(){
        return bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    @Override
    public void printInfo(){
        System.out.println("=========== TENDIK ===========");
        System.out.println("NIP             : " + getNip());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal lahir   : " + getTgl().format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"))));
        System.out.println("TMT             : " + getTmt().format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"))));
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + getBidang());
        System.out.println("Masa kerja      : " + hitungMasaKerja());
        System.out.println("BUP             : " + hitungBUP(bup).format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"))));
        System.out.println("Gaji pokok      : " + formatRupiah(getGaji()));
        System.out.println("Tunjangan       : 1% x " + Period.between(getTmt(), LocalDate.now()).getYears() + " x " + formatRupiah(getGaji()) + " = " + formatRupiah(0.01 * Period.between(getTmt(), LocalDate.now()).getYears() * getGaji()));
    }
}
