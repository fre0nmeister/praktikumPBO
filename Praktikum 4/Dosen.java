/* Nama file: Dosen.java
 * Deskripsi: Berisi atribut dan metode dalam class dosen
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 13 Maret 2025
 */


import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Dosen extends Pegawai{
    private String fakultas;

    public Dosen(){
    }

    public Dosen(String nip, String nama, String tglLahir, String tmt, int gaji, String fakultas){
        super(nip, nama, tglLahir, tmt, gaji);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo(){
        System.out.println("NIP             : " + getNip());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal lahir   : " + getTgl().format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"))));
        System.out.println("TMT             : " + getTmt().format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"))));
        System.out.println("Fakultas        :" + fakultas);
        System.out.println("Masa kerja      : " + hitungMasaKerja());
        System.out.println("Gaji pokok      : " + formatRupiah(getGaji()));
    }
}
