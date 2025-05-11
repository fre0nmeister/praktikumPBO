/* Nama file: BangunDatarGenericTest.java
 * Deskripsi: Class untuk menguji ketiga buah kelas bangun datar yang telah dibuat.
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Minggu, 11 Mei 2025
*/

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        //Uji lingkaran
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdLingkaran = new BangunDatarGeneric<>();
        bdLingkaran.set(l);
        System.out.println("Keliling Lingkaran: " + bdLingkaran.hitungKeliling());
        System.out.println("Tipe generic: " + bdLingkaran.get().getClass().getName());

        System.out.println();

        //Uji persegi
        Persegi p = new Persegi(4);
        BangunDatarGeneric<Persegi> bdPersegi = new BangunDatarGeneric<>();
        bdPersegi.set(p);
        System.out.println("Keliling Persegi: " + bdPersegi.hitungKeliling());
        System.out.println("Tipe generic: " + bdPersegi.get().getClass().getName());

        System.out.println();

        //Uji persegi panjang
        PersegiPanjang pp = new PersegiPanjang(5, 3);
        BangunDatarGeneric<PersegiPanjang> bdPP = new BangunDatarGeneric<>();
        bdPP.set(pp);
        System.out.println("Keliling Persegi Panjang: " + bdPP.hitungKeliling());
        System.out.println("Tipe generic: " + bdPP.get().getClass().getName());

        System.out.println();

        //Uji segitiga
        Segitiga s = new Segitiga(3, 4, 5);
        BangunDatarGeneric<Segitiga> bdSegitiga = new BangunDatarGeneric<>();
        bdSegitiga.set(s);
        System.out.println("Keliling Segitiga: " + bdSegitiga.hitungKeliling());
        System.out.println("Tipe generic: " + bdSegitiga.get().getClass().getName());
    }
}
