/* Nama file: PNS.java
 * Deskripsi: Berisi atribut dan metode dalam class PNS
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Senin, 24 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS = 0;

    public PNS(){
        super();
        nip = "";
        counterPNS++;
    }

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(getTglmulaikerja(), LocalDate.now()).getYears() + 7;
    }

    @Override
    public double hitungPajak(){
        return getPendapatan() * (10.0 / 100);
    }

    @Override
    public void cetakInfo(){
        System.out.println("Nama            : " + nama);
        System.out.println("NIP             : " + nip);
        System.out.println("Jabatan         : PNS");
        System.out.println("Tanggal masuk   : " + tglMulaiKerja.format(DateTimeFormatter.ofPattern("d MMMM yyy", Locale.of("id", "ID"))));
        System.out.println("Alamat          : " + alamat);
        System.out.println("Pendapatan      : " + pendapatan);
        System.out.println("Masa Kerja      : " + hitungMasaKerja() + " tahun");
    }
}