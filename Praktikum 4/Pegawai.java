/* Nama file: Pegawai.java
 * Deskripsi: Berisi atribut dan metode dalam class pegawai
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 13 Maret 2025
 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    private String nip;
    private String nama;
    private LocalDate tglLahir;
    private LocalDate tmt;
    private double gaji;

    public Pegawai(){
    }

    public Pegawai(String nip, String nama, String tglLahir, String tmt, double gaji){
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = LocalDate.parse(tglLahir, DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID")));
        this.tmt = LocalDate.parse(tmt, DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID")));
        this.gaji = gaji;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTgl(){
        return tglLahir;
    }

    public void setTgl(String tglLahir){
        this.tglLahir = LocalDate.parse(tglLahir, DateTimeFormatter.ofPattern("d MMMM yyyy"));;
    }

    public LocalDate getTmt(){
        return tmt;
    }

    public void setTmt(String tmt){
        this.tmt = LocalDate.parse(tmt, DateTimeFormatter.ofPattern("d MMMM yyyy"));;
    }

    public double getGaji(){
        return gaji;
    }

    public void setGaji(double gaji){
        this.gaji = gaji;
    }

    public String hitungMasaKerja() {
        Period selisih = Period.between(getTmt(), LocalDate.now());
        int tahun = selisih.getYears();
        int bulan = selisih.getMonths();
        return tahun + " tahun " + bulan + " bulan";
    }

    public LocalDate hitungBUP(int bup) {
        return getTgl().plusYears(bup).withDayOfMonth(1).plusMonths(1);
    }

    public String formatRupiah(double angka) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        
        DecimalFormat format = new DecimalFormat("Rp#,##0.00", symbols);
        return format.format(angka);
    }

    public void printInfo(){
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal lahir   : " + tglLahir.format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"))));
        System.out.println("TMT             : " + tmt.format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"))));
        System.out.println("Masa kerja      : " + hitungMasaKerja());
        System.out.println("Gaji pokok      : " + formatRupiah(getGaji()));
    }
}
