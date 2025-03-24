/* Nama file: Petani.java
 * Deskripsi: Berisi atribut dan metode dalam class Petani
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Senin, 24 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;
   
    public Petani(){
        super();
        counterPetani++;
    }

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    public String getAsal_kota(){
        return asal_kota;
    }

    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(getTglmulaikerja(), LocalDate.now()).getYears() + 0;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public void cetakInfo(){
        System.out.println("Nama            : " + nama);
        System.out.println("Asal kota       : " + asal_kota);
        System.out.println("Jabatan         : Petani");
        System.out.println("Tanggal masuk   : " + tglMulaiKerja.format(DateTimeFormatter.ofPattern("d MMMM yyy", Locale.of("id", "ID"))));
        System.out.println("Alamat          : " + alamat);
        System.out.println("Pendapatan      : " + pendapatan);
        System.out.println("Masa Kerja      : " + hitungMasaKerja() + " tahun");
    }
}
