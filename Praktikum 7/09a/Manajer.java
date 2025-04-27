/* Nama file: Manajer.java
 * Deskripsi: Berisi atribut dan metode dalam class Manajer
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 24 April 2025
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama){
        super(nama);
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
