/* Nama file: DosenTetap.java
 * Deskripsi: Berisi atribut dan metode dalam class dosentetap
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 13 Maret 2025
 */


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Dosen{
    private String nidn;
    private int bup = 65;

    public DosenTetap(){
    }

    public DosenTetap(String nip, String nama, String tglLahir, String tmt, int gaji, String fakultas, String nidn){
        super(nip, nama, tglLahir, tmt, gaji, fakultas);
        this.nidn = nidn;
    }

    public String getNidn(){
        return nidn;
    }

    public void setNidn(String nidn){
        this.nidn = nidn;
    }

    @Override
    public void printInfo(){
        System.out.println("=========== DOSEN TETAP ===========");
        System.out.println("NIP             : " + getNip());
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal lahir   : " + getTgl().format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"))));
        System.out.println("TMT             : " + getTmt().format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"))));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Masa kerja      : " + hitungMasaKerja());
        System.out.println("BUP             : " + hitungBUP(bup).format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"))));
        System.out.println("Gaji pokok      : " + formatRupiah(getGaji()));
        System.out.println("Tunjangan       : 2% x " + Period.between(getTmt(), LocalDate.now()).getYears() + " x " + formatRupiah(getGaji()) + " = " + formatRupiah(0.02 * Period.between(getTmt(), LocalDate.now()).getYears() * getGaji()));
    }
}
