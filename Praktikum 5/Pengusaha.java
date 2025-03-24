/* Nama file: Pengusaha.java
 * Deskripsi: Berisi atribut dan metode dalam class Pengusaha
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Senin, 24 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(){
        super();
        npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public String getNpwp(){
        return npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(getTglmulaikerja(), LocalDate.now()).getYears() + 7;
    }

    @Override
    public double hitungPajak(){
        return getPendapatan() * (15.0 / 100);
    }

    @Override
    public void cetakInfo(){
        System.out.println("Nama            : " + nama);
        System.out.println("NPWP            : " + npwp);
        System.out.println("Jabatan         : Pengusaha");
        System.out.println("Tanggal masuk   : " + tglMulaiKerja.format(DateTimeFormatter.ofPattern("d MMMM yyy", Locale.of("id", "ID"))));
        System.out.println("Alamat          : " + alamat);
        System.out.println("Pendapatan      : " + pendapatan);
        System.out.println("Masa Kerja      : " + hitungMasaKerja() + " tahun");
    }
}
