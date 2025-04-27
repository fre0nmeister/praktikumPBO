/* Nama file: Programmer.java
 * Deskripsi: Berisi atribut dan metode dalam class Programmer
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 24 April 2025
*/

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
