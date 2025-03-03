/* Nama file: Dosen.java
 * Deskripsi: Berisi atribut dan metode dalam class Dosen
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 2 Maret 2025
 */

public class Dosen {
    /* Atribut */
    private String nip, nama, prodi;

    /* Method */
    public Dosen (){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen (String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip(){
        return nip;
    }

    public String getNama_dosen(){
        return nama;
    }

    public String getProdi_dosen(){
        return prodi;
    }

    public void setNip(String x){
        nip = x;
    }

    public void setNama(String x){
        nama = x;
    }
    public void setProdi(String x){
        prodi = x;
    }
}