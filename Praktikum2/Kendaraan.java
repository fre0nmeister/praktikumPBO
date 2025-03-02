/* Nama file: Kendaraan.java
 * Deskripsi: Berisi atribut dan metode dalam class Kendaraan
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 2 Maret 2025
 */

public class Kendaraan {
    /* Atribut */
    private String noPlat, jenis;

    /* Method */
    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoplat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoplat(String x){
        noPlat = x;
    }

    public void setJenis(String x){
        jenis = x;
    }
}
